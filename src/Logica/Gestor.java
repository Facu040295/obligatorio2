package Logica;

import Logica.Fachada.Eventos;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class Gestor extends Usuario {
    private Date ultimaConexion;
    private ArrayList<Pedido> pedidos;
    
    public Gestor(String nombre, String password, String nombreCompleto) {
        super(nombre, password, nombreCompleto);
        this.ultimaConexion = Date.from(Instant.now());
    }

    public Date getUltimaConexion() {
        return ultimaConexion;
    }

    public void setUltimaConexion(Date ultimaConexion) {
        this.ultimaConexion = ultimaConexion;
    }
    
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
    
    public void setPedido(Pedido p){
        pedidos.add(p);
        Fachada.getInstancia().avisar(Eventos.agregarPedidoGestor);
    }
    
}
