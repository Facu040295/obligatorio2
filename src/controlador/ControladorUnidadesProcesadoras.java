/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Logica.Fachada;

/**
 *
 * @author facu2
 */
public class ControladorUnidadesProcesadoras {
    
    IvistaUnidadesProcesadoras interfase;
    Fachada fachada;
    
    public ControladorUnidadesProcesadoras() {
        fachada = Fachada.getInstancia();
        interfase.mostrarUnidades(fachada.getUnidadesProcesadoras());
    }
    
    
    
    
}
