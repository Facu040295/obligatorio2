/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Logica.Fachada;
import Logica.Gestor;
import Logica.UnidadProcesadora;
import java.util.ArrayList;

/**
 *
 * @author facu2
 */
public class ControladorUnidadesProcesadoras {
    
    Fachada fachada = Fachada.getInstancia();
    
    IvistaUnidadesProcesadoras IvistaUnidadesProcesadoras;
    IvistaMonitorPedidos ivistaMonitorPedidos;
    
    public ControladorUnidadesProcesadoras(IvistaUnidadesProcesadoras vista) {
        this.IvistaUnidadesProcesadoras = vista;
    }
    
    public ControladorUnidadesProcesadoras(IvistaMonitorPedidos vista){
        this.ivistaMonitorPedidos = vista;
    }
    
    public void listarUnidades(){
        IvistaUnidadesProcesadoras.mostrarUnidades(fachada.getUnidadesProcesadoras());
    }
    
    public void listarPedidosGestor(Gestor g){
    
    }
    
}
