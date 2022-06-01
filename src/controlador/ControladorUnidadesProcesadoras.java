/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Logica.Fachada;
import Logica.UnidadProcesadora;
import java.util.ArrayList;

/**
 *
 * @author facu2
 */
public class ControladorUnidadesProcesadoras {
    
    IvistaUnidadesProcesadoras interfase;
    Fachada fachada = Fachada.getInstancia();
    
    public ControladorUnidadesProcesadoras(IvistaUnidadesProcesadoras vista) {
        this.interfase = vista;
    }
    
    public void listarUnidades(){
        interfase.mostrarUnidades(fachada.getUnidadesProcesadoras());
    }
    
}
