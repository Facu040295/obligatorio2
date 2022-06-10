package Logica;

import java.util.ArrayList;

public class UnidadProcesadora {
    private String nombre;
    private ArrayList<Pedido> pedidos;
    private ArrayList<Producto> productos;
    private ArrayList<Gestor> gestores;
    
    public UnidadProcesadora(String nombre) {
        this.nombre = nombre;
        this.pedidos = new ArrayList<>();
        this.productos = new ArrayList<>();
        this.gestores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProducto(Producto producto) {
        productos.add(producto);
    }
    
}
