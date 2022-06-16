package Logica;

import static Logica.Fachada.Eventos;
import Observador.Observable;
import java.util.ArrayList;

public class Servicio extends Observable {
    private Mesa mesa;
    private ArrayList<Pedido> pedidos;
    private float montoTotal;

    public Servicio(Mesa mesa, ArrayList<Pedido> pedidos, float montoTotal) {
        this.mesa = mesa;
        this.pedidos = new ArrayList<Pedido>();
        this.montoTotal = montoTotal;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
    
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedido(Pedido p) {
        pedidos.add(p);
        float montoPedido = (p.getProducto().getPrecioUnitario() * p.getCantidad()); 
        sumarTotal(montoPedido);
        Fachada.getInstancia().avisar(Eventos.agregarPedido);
    }

    public float getMontoTotal() {
        return montoTotal;
    }

    public void sumarTotal(float monto) {
        montoTotal += monto;
    }

}
