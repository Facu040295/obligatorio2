package controlador;

import Logica.Fachada;
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
    
    public void mostrarPedidosUnidad(){

        ArrayList<Pedido> pedidosActivos = new ArrayList<>();
        
        for (Pedido p : u.getPedidos()) {
            if(!p.isFinalizado()&& p.getGestorAsignado() == null){
                pedidosActivos.add(p);
            }
        }
        interfase.mostrarPedidosUnidad(pedidosActivos);  
    }
    
    public void agregarPedidoGestor(Pedido p){
        p.setGestorAsignado(g);
        g.setPedido(p);
    }
    
    public void mostrarPedidosGestor(){
        interfase.mostrarPedidosGestor(g.getPedidos());
    }
    
    @Override
    public void actualizar(Object evento, Observable origen) {
        if(evento.equals(Fachada.Eventos.agregarPedido)){
            actualizarPedidosUnidad();
            mostrarPedidosUnidad();
        }
    }

    public void logout() {
        fachada.logout(sesion);
        fachada.quitar(this);
    }
    
}
