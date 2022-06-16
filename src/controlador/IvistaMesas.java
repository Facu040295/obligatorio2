package controlador;

import Logica.Mesa;
import Logica.Producto;
import Logica.Servicio;
import java.util.ArrayList;

public interface IvistaMesas {
    public void mostrarMesasAsignadas(ArrayList<Mesa> m);
    
    public void abrirMesa(Mesa m);

    public void listarProductos(ArrayList<Producto> productos);
    
    public void mostrarServicio(Servicio s);
    
    public void agregarPedido(Mesa m, Producto p, String descripcion, int cantidad);
}