package controlador;

import Logica.Pedido;
import java.util.ArrayList;

public interface IvistaMonitorPedidos {
    
    public void mostrarPedidosUnidadProcesadora(ArrayList<Pedido> p);
    
    public void mostrarPedidosGestor(ArrayList<Pedido> p);
    
}