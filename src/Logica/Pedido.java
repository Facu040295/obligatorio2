package Logica;

public class Pedido {
    private Producto producto;
    private int cantidad;
    private String descripcion;
    private boolean procesado;
    private Gestor gestorAsignado;

    public Pedido(Producto producto, int cantidad, String descripcion, boolean procesado, Gestor gestorAsignado) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.procesado = false;
        this.gestorAsignado = null;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        if(descripcion.isEmpty())
            return "No se encuentra descripción para el pedido";
        else
            return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean Procesado() {
        return procesado;
    }

    public void setProcesado(boolean procesado) {
        this.procesado = procesado;
    }

    public Gestor getGestorAsignado() {
        return gestorAsignado;
    }

    public void setGestorAsignado(Gestor gestorAsignado) {
        this.gestorAsignado = gestorAsignado;
    }
    
}
