/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Logica.Mesa;
import Logica.Producto;
import Logica.Servicio;
import java.util.ArrayList;

/**
 *
 * @author facu2
 */
public interface IVistaMesas {

    public void mostrarMesasAsignadas(ArrayList<Mesa> m);
    
    public void abrirMesa(Mesa m);

    public void listarProductos(ArrayList<Producto> productos);
    
    public void mostrarServicio(Servicio servicio);
    
    public void agregarPedido(Mesa m, Producto p, String descripcion, int cantidad);
    
}
