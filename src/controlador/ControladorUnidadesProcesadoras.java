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
    
    Fachada fachada;
    
    public ControladorUnidadesProcesadoras() {
        fachada = Fachada.getInstancia();
    }
    
    //Constructor
    public ControladorContador(Contador unModelo, IVistaContador unaVista){
        this.modelo = unModelo;
        this.vista = unaVista;
        modelo.agregar(this);
        //Inicializacion de la vista
        vista.mostrarValor(modelo.getValor());
    }
    
    
}
