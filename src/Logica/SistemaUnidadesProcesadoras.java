/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.ArrayList;

/**
 *
 * @author facundo.lopez
 */
public class SistemaUnidadesProcesadoras {
    private ArrayList<UnidadProcesadora> unidadesProcesadoras = new ArrayList<UnidadProcesadora>();
    
    public void agregarUnidadProcesadora(String nombre){
        if(validarUnidad(nombre)){
            unidadesProcesadoras.add(new UnidadProcesadora(nombre));
        }
    }

    private boolean validarUnidad(String nombre) {
        
        for(UnidadProcesadora u : unidadesProcesadoras){
            if(u.getNombre().equals(nombre)){
                return false;
            }
        }
        return true;
    }
    
    public ArrayList<UnidadProcesadora> getUnidades() {
        return unidadesProcesadoras;
    }
    
    public ArrayList<Pedido> getPedidosUnidad(UnidadProcesadora u) {
        ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
        for(UnidadProcesadora unidad : this.getUnidades()){
            if (unidad == u) {
                for (Pedido p : unidad.getPedidos()) {
                    pedidos.add(p);
                }
            }
        }
        return pedidos;
    }

    void agregarProducto(int codigo, String nombre, float precioUnitario, int stock, UnidadProcesadora unidadProcesadora) {
        Producto producto = new Producto(codigo, nombre, precioUnitario, stock, unidadProcesadora);
        for(UnidadProcesadora unidad : unidadesProcesadoras){
            if(unidad == unidadProcesadora){
                unidad.setProducto(producto);
            }
        }
    }
}
