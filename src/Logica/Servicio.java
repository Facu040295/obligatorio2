package Logica;

import java.util.ArrayList;

public class Servicio {
    private Mesa mesa;
    private ArrayList<Pedido> pedidos;
    private ArrayList<Producto> productos;
    private float montoTotal;

    public Servicio(Mesa mesa, ArrayList<Pedido> pedidos, ArrayList<Producto> productos, float montoTotal) {
        this.mesa = mesa;
        this.pedidos = pedidos;
        this.productos = productos;
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

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }
    
    
}
