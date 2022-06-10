/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Logica.Fachada;
import Logica.Gestor;
import Logica.Sesion;
import Logica.UnidadProcesadora;
import Observador.Observable;
import Observador.Observador;
import java.util.ArrayList;

/**
 *
 * @author facu2
 */
public class ControladorUnidadesProcesadoras implements Observador {
    
    Fachada fachada = Fachada.getInstancia();
    
    IvistaUnidadesProcesadoras IvistaUnidadesProcesadoras;
    IvistaMonitorPedidos ivistaMonitorPedidos;
    Gestor gestor;
    Sesion sesion;
    
    public ControladorUnidadesProcesadoras(IvistaUnidadesProcesadoras vista, Sesion s) {
        this.IvistaUnidadesProcesadoras = vista;
        sesion = s;
        gestor = s.getUsuarioGestor();
    }
    
    public void listarUnidades(){
        IvistaUnidadesProcesadoras.mostrarUnidades(fachada.getUnidades());
    }

    public void logout() {
       fachada.logout(sesion);
       fachada.quitar(this);
    }

    @Override
    public void actualizar(Object evento, Observable origen) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
