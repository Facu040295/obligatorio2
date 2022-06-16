/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Logica.Mesa;
import Logica.Servicio;
import java.util.ArrayList;

/**
 *
 * @author facu2
 */
public interface IVistaMesas {

    public void mostrarMesasAsignadas(ArrayList<Mesa> mesasAsignadas);

    public void mostrarServicio(Servicio servicio);
    
}
