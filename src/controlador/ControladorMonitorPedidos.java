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
import Logica.UnidadProcesadora;
import Observador.Observable;
import Observador.Observador;
import java.util.ArrayList;
import vista.VistaMonitorPedidos;

/**
 *
 * @author facu2
 */
public class ControladorMonitorPedidos implements Observador{
    
    Fachada fachada = Fachada.getInstancia();
    IvistaMonitorPedidos vista;
    UnidadProcesadora u;
    Gestor g;
    
    public ControladorMonitorPedidos(Gestor g, UnidadProcesadora u, IvistaMonitorPedidos v){
        this.vista = v;
        this.g = g;
        this.u = u;
        mostrarTitulo();
    }
    
    private void mostrarTitulo() {
        String titulo = "Unidad Procesadora: " + u.getNombre() + " | Gestor: " + g.getNombreCompleto();
        vista.mostrarTitulo(titulo);
    }

    public void mostrarPedidosUnidad(){
        ArrayList<Servicio> servicios = fachada.getServicios();
        ArrayList<Pedido> pedidos = new ArrayList<>();
        for(Servicio s : servicios){
            for(Pedido p : s.getPedidos()){
                for(Producto prod : u.getProductos()){
                    if(prod == p.getProducto()){
                        pedidos.add(p);
                    }
                }
            }
        }
        
        vista.mostrarPedidosUnidadProcesadora(pedidos);
        
    }
    @Override
    public void actualizar(Object evento, Observable origen) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
