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
import java.awt.Color;

public class ControladorMesas implements Observador {

    //IvistaMesas miInterface;
    Fachada fachada;
    Mozo mozo;
    Sesion sesion;
    IvistaMesas vista;
    
    public ControladorMesas(Sesion s, IvistaMesas v) {
        fachada = Fachada.getInstancia();
        sesion = s;
        vista = v;
        mozo = s.getUsuarioMozo();
    }
    
    public ArrayList<Mesa> getMesasAsignadas(){
        return mozo.getMesasAsignadas();
    }
    
    public void MesasAsignadas() {
        vista.mostrarMesasAsignadas(getMesasAsignadas());
    }
    
    public void logout() {
       fachada.logout(sesion);
       fachada.quitar(this);
    }
    
    public void abrirMesa(Mesa m) throws MesasException{
        if (m.getServicio() != null || m.isOcupado()){
            throw new MesasException("La mesa ya está abierta");
        }
        Servicio s = new Servicio(m, null, 0);
        m.setServicio(s);
        m.setOcupado(true);
    }
    
    @Override
    public void actualizar(Object evento, Observable origen) {
        //if (evento.equals(mozo.Eventos.actualizarMesas)) {

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
    
    public void ListarProductos(){
        vista.listarProductos(getProductos());
    }
    
    public void AgregarPedido(Mesa m, Producto p, String descripcion, int cantidad) throws MesasException{
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
        Pedido pedido = new Pedido(p, cantidad, descripcion, true, null);
        s.getPedidos().add(pedido);
    }

}
