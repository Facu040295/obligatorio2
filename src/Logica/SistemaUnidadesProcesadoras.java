/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.ArrayList;

/**
 *
 * @author facundo.lopez
 */
public class SistemaUnidadesProcesadoras {
    public ArrayList<UnidadProcesadora> unidadesProcesadoras;
    
    public void agregarUnidadProcesadora(String nombre){
        if(validarUnidad(nombre)){
            unidadesProcesadoras.add(new UnidadProcesadora(nombre));
        }
    }

    private boolean validarUnidad(String nombre) {
        
        for(UnidadProcesadora u : unidadesProcesadoras){
            if(u.getNombre().equals(nombre)){
                return false;
            }
        }
        return true;
    }
    
    public ArrayList<UnidadProcesadora> getUnidades() {
        return unidadesProcesadoras;
    }
}
