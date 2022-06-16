package controlador;

import Logica.Fachada;
import Logica.Mesa;
import Logica.MesasException;
import Logica.Mozo;
import Logica.Pedido;
import Logica.Producto;
import Logica.Servicio;
import Observador.Observable;
import Observador.Observador;
import java.util.ArrayList;
import Logica.Sesion;
import Logica.UnidadProcesadora;

public class ControladorMesas implements Observador {

    Fachada fachada;
    Mozo mozo;
    Sesion sesion;
    IVistaMesas interfase;
    
    public ControladorMesas(Sesion s, IVistaMesas v) {
        fachada = Fachada.getInstancia();
        sesion = s;
        interfase = v;
        mozo = s.getUsuarioMozo();
        
        Fachada.getInstancia().agregar(this);
    }
    
    public ArrayList<Mesa> getMesasAsignadas(){
        return mozo.getMesasAsignadas();
    }
    
    public void mesasAsignadas() {
        interfase.mostrarMesasAsignadas(getMesasAsignadas());
    }
    
    public boolean logout(){
        boolean abiertas = false;
        try {
            for (Mesa mesa : getMesasAsignadas()) {
                if(mesa.isOcupado() && !abiertas){
                    abiertas = true;
                    throw new MesasException("Debe cerrar las mesas abiertas antes de salir");
                }
            }
            if(!abiertas){
                fachada.logout(sesion);
                fachada.quitar(this);
            }
        } catch (MesasException ex) {
            interfase.mostrarError(ex.getMessage());
        }
        return abiertas;
    }
    
    public void abrirMesa(Mesa m) throws MesasException{
        if (m.getServicio() != null || m.isOcupado()){
            throw new MesasException("La mesa ya está abierta");
        }
        Servicio s = new Servicio(m, null, 0);
        m.setServicio(s);
        m.setOcupado(true);
        mesasAsignadas();
    }

    public void cerrarMesa(Mesa m) throws MesasException {
        if (m.getServicio() == null || !m.isOcupado()){
            throw new MesasException("La mesa no está abierta");
        }
        boolean encontro = false;
        for (Pedido pedido : m.getServicio().getPedidos()) {
            if(!pedido.isFinalizado()&& !encontro){
                encontro = true;
                throw new MesasException("Tiene pedidos pendientes");
            }
        }
        m.setServicio(null);
        m.setOcupado(false);
    }
    
    public ArrayList<Producto> getProductos() {
        ArrayList<UnidadProcesadora> unidades = fachada.getUnidades();
        ArrayList<Producto> productos = new ArrayList<>();
        
        for (UnidadProcesadora unidad : unidades) {
            for (Producto producto : unidad.getProductos()) {
                productos.add(producto);
            }
        }
        
        return productos;
    }
    
    public void mostrarServicio(Mesa m){
        if(m.isOcupado()){
            interfase.mostrarServicio(m.getServicio());
        }
    }
    
    /*public void ListarProductos(){
        vista.listarProductos(getProductos());
    }*/
    
    public void agregarPedido(Mesa m, Producto p, String descripcion, int cantidad) throws MesasException{
        if (!m.isOcupado()){
            throw new MesasException("La mesa está cerrada");
        }
        if (cantidad < 1){
            throw new MesasException("Cantidad inválida");
        }
        /*if (supera cantidad en stock){
            throw new MesasException("Sin stock, solo quedan " + cantidad);
        }*/
        Servicio s = m.getServicio();
        Pedido pedido = new Pedido(p, cantidad, descripcion, false, null);
        s.setPedido(pedido);
    }

    
    @Override
    public void actualizar(Object evento, Observable origen) {
        if(evento.equals(Fachada.Eventos.abrirMesa)){
            mesasAsignadas();
        }
    }
}
