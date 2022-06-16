package controlador;

import Logica.Pedido;
import Logica.UnidadProcesadora;
import java.util.ArrayList;

public interface IvistaMonitorPedidos {
   
    public void mostrarPedidosGestor(ArrayList<Pedido> p);

    public void mostrarTitulo(String titulo);

    public void listarUnidades(ArrayList<UnidadProcesadora> unidades);

    public void mostrarPedidosUnidad(ArrayList<Pedido> pedidosActivos);
    
}