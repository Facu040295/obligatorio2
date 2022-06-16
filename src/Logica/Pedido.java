package Logica;

import Observador.Observable;

public class Pedido extends Observable{
    private Producto producto;
    private int cantidad;
    private String descripcion;
    private boolean finalizado;
    private Gestor gestorAsignado;
     private String estado;

    public Pedido(Producto producto, int cantidad, String descripcion, boolean finalizado, Gestor gestorAsignado, String estado) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.finalizado = false;
        this.gestorAsignado = null;
        this.estado = this.getEstado();
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

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
        Fachada.getInstancia().avisar(Fachada.Eventos.finalizarPedido);
    }

    public Gestor getGestorAsignado() {
        return gestorAsignado;
    }

    public void setGestorAsignado(Gestor gestorAsignado) {
        this.gestorAsignado = gestorAsignado;
    }
    
    public String getEstado() {
        String estado = "Activo";
       
        if(getGestorAsignado() != null){
            estado = "Procesando...";
        }
        if(isFinalizado()){
            estado = "Finalizado.";
        }
        return estado;
    }

}
