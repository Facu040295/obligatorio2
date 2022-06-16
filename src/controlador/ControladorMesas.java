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
    
    public boolean abrirMesa(Mesa m){
        boolean abre = true;
        try {
            if (m.getServicio() != null || m.isOcupado()){
                abre = false;
                throw new MesasException("La mesa ya está abierta");
            }
        Servicio s = new Servicio(m, null, 0);
        m.setServicio(s);
        m.setOcupado(true);
        mesasAsignadas();
        } catch (MesasException ex) {
            interfase.mostrarError(ex.getMessage());
        }
        return abre;
    }
    
    public boolean cerrarMesa(Mesa m){
        boolean cierra = true;
        try {
            if (m.getServicio() == null || !m.isOcupado()){
                cierra = false;
                throw new MesasException("La mesa no está abierta");
            }
            for (Pedido pedido : m.getServicio().getPedidos()) {
                if(!pedido.isFinalizado()&& cierra){
                    cierra = false;
                    throw new MesasException("Tiene pedidos pendientes");
                }
            }
            m.setServicio(null);
            m.setOcupado(false);
        } catch (MesasException ex) {
            interfase.mostrarError(ex.getMessage());
        }
        return cierra;
    }
  
    
    public ArrayList<Producto> ProductosConStock() {
        ArrayList<UnidadProcesadora> unidades = fachada.getUnidades();
        ArrayList<Producto> productos = new ArrayList<>();
        
        for (UnidadProcesadora unidad : unidades) {
            for (Producto producto : unidad.getProductos()) {
                if (producto.getStock() > 0)
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
    
    public ArrayList<String> cargarServicioMesa(Servicio s){
        ArrayList<String> listado = new ArrayList();
        for (Pedido p : s.getPedidos()) {
            listado.add(p.getProducto().getNombre() + " - " + p.getCantidad()
                        + " - " + p.getProducto().getPrecioUnitario() + " - " + 
                        (p.getProducto().getPrecioUnitario() * p.getCantidad()));
        }
        return listado;
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
        if (p.getStock() < cantidad){
            throw new MesasException("Sin stock, solo quedan " + p.getStock());
        }
        Servicio s = m.getServicio();
        Pedido pedido = new Pedido(p, cantidad, descripcion, false, null);
        s.setPedido(pedido);
        p.setStock(p.getStock()- cantidad);
    }

    
    @Override
    public void actualizar(Object evento, Observable origen) {
        if(evento.equals(Fachada.Eventos.abrirMesa)){
            mesasAsignadas();
        }
    }
}
