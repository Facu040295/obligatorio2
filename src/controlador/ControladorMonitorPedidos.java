/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Logica.Fachada;
import Logica.Gestor;
import Logica.Mesa;
import Logica.Pedido;
import Logica.Producto;
import Logica.Servicio;
import Logica.Sesion;
import Logica.UnidadProcesadora;
import Observador.Observable;
import Observador.Observador;
import java.util.ArrayList;
import vista.VistaGestores;

/**
 *
 * @author facu2
 */
public class ControladorMonitorPedidos implements Observador{
    
    iVistaMonitorPedidos vista;
    UnidadProcesadora u;
    Gestor g;
    Servicio s;
    
    public ControladorMonitorPedidos(Sesion s, iVistaMonitorPedidos v){
        this.vista = v;
        this.g = s.getUsuarioGestor();
        mostrarTitulo();
        
        Fachada.getInstancia().agregar(this);
        
    }
    
    public void mostrarTitulo() {
        if(u != null){
            String titulo = "Unidad Procesadora: " + u.getNombre() + " | Gestor: " + g.getNombreCompleto();
            vista.mostrarTitulo(titulo);
        }
    }
    
    public ArrayList<UnidadProcesadora> getUnidades(){
        return Fachada.getInstancia().getUnidades();
    }
    
    public void listarUnidades(){
        vista.listarUnidades(Fachada.getInstancia().getUnidades());
    }

    public void seleccionarUnidad(UnidadProcesadora unidad){
        this.u = unidad;
        mostrarPedidosUnidad();
    }
    
    public void agregarPedidoUnidad(){
        ArrayList<Pedido> pedidos = Fachada.getInstancia().getPedidos();
        
        for(Pedido p : pedidos){
            if(u.getProductos().contains(p.getProducto()) && !u.getPedidos().contains(p)){
                u.setPedido(p);
            }
        }
    }
    
    public void mostrarPedidosUnidad(){
        
        ArrayList<Pedido> pedidosUnidad = new ArrayList<>();
        
        for(Pedido p : u.getPedidos()){
            if(p.getGestorAsignado() == null && !p.Procesado()){
                pedidosUnidad.add(p);
            }
        }
        vista.mostrarPedidosUnidad(Fachada.getInstancia().getPedidos());  
    }
    
    @Override
    public void actualizar(Object evento, Observable origen) {
        if(evento.equals(Fachada.Eventos.agregarPedido)){
            mostrarPedidosUnidad();
        }
    }
    
}
