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
        ArrayList<Pedido> pedidos = Fachada.getInstancia().getPedidos();
        ArrayList<Pedido> pedidosUnidad = new ArrayList<>();

        for(Pedido p : pedidos){
            if(u.getProductos().contains(p.getProducto())){
                pedidosUnidad.add(p);
            }
        }
        
        vista.mostrarPedidosUnidadProcesadora(pedidosUnidad);
        
    }
    @Override
    public void actualizar(Object evento, Observable origen) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
