package Logica;

import java.util.ArrayList;

public class Servicio {
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

    public float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }
    
}
