package controlador;

import Logica.Fachada;
import Logica.Fachada.Eventos;
import Logica.Gestor;
import Logica.Pedido;
import Logica.Servicio;
import Logica.Sesion;
import Logica.UnidadProcesadora;
import Observador.Observable;
import Observador.Observador;
import java.util.ArrayList;

public class ControladorMonitorPedidos implements Observador{
    
    IvistaMonitorPedidos interfase;
    Fachada fachada;
    Sesion sesion;
    UnidadProcesadora u;
    Gestor g;
    Servicio s;
    
    public ControladorMonitorPedidos(Sesion s, IvistaMonitorPedidos v){
        fachada = Fachada.getInstancia();
        sesion = s;
        this.interfase = v;
        this.g = s.getUsuarioGestor();
        mostrarTitulo();
        
        Fachada.getInstancia().agregar(this);
        
    }
    
    public void mostrarTitulo() {
        if(u != null){
            String titulo = "Unidad Procesadora: " + u.getNombre() + " | Gestor: " + g.getNombreCompleto();
            interfase.mostrarTitulo(titulo);
        }
    }
    
    public ArrayList<UnidadProcesadora> getUnidades(){
        return Fachada.getInstancia().getUnidades();
    }
    
    public void listarUnidades(){
        interfase.listarUnidades(Fachada.getInstancia().getUnidades());
    }

    public void seleccionarUnidad(UnidadProcesadora unidad){
        this.u = unidad;
        actualizarPedidosUnidad();
        mostrarPedidosUnidad();
    }
    
    public void actualizarPedidosUnidad(){
        
        ArrayList<Pedido> pedidos = Fachada.getInstancia().getPedidos();

        for(Pedido p : pedidos){
            if(u.getProductos().contains(p.getProducto()) && !u.getPedidos().contains(p)){
                u.setPedido(p);
            }
        }
    }
    
    public ArrayList<Pedido> getPedidosUnidad(){

        ArrayList<Pedido> pedidosActivos = new ArrayList<>();
        
        for (Pedido p : u.getPedidos()) {
            if(!p.isFinalizado()&& p.getGestorAsignado() == null){
                pedidosActivos.add(p);
            }
        }
        
        return pedidosActivos;
          
    }

    public void mostrarPedidosUnidad() {
        interfase.mostrarPedidosUnidad(getPedidosUnidad());
    }
    
    public void agregarPedidoGestor(Pedido p){
        p.setGestorAsignado(g);
        g.setPedido(p);
    }
    
    public ArrayList<Pedido> getPedidosGestor() {
        ArrayList<Pedido> pedidosActivos = new ArrayList<>();
        
        for (Pedido p : g.getPedidos()) {
            if(!p.isFinalizado()){
                pedidosActivos.add(p);
            }
        }
        
        return pedidosActivos;
    }
    
    public void mostrarPedidosGestor(){
        interfase.mostrarPedidosGestor(getPedidosGestor());
    }
    
    public void finalizarPedido(Pedido p){
        p.setFinalizado(true);
    }
    
    @Override
    public void actualizar(Object evento, Observable origen) {
        
        switch ((Eventos)evento) {
            case agregarPedido:
                actualizarPedidosUnidad();
                mostrarPedidosUnidad();
                break;
                
            case agregarPedidoGestor:
                actualizarPedidosUnidad();
                mostrarPedidosUnidad();
                mostrarPedidosGestor();
                break;
                
            case finalizarPedido:
                actualizarPedidosUnidad();
                mostrarPedidosUnidad();
                mostrarPedidosGestor();
                break;
            
        }
    }

    public void logout() {
        fachada.logout(sesion);
        fachada.quitar(this);
    }

    
    
}
