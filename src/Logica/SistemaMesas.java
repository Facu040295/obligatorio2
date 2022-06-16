package Logica;

import java.util.ArrayList;

public class SistemaMesas {
    
    private ArrayList<Mesa> mesas = new ArrayList<>();
    private ArrayList<Servicio> servicios = new ArrayList<>();
    private ArrayList<Pedido> pedidos = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private Pedido ultimoPedidoProcesado;
    private Pedido ultimoPedidoFinalizado;
    
    public void agregarMesa(int numero, String m) {    
      ArrayList<Mozo> mozos = Fachada.getInstancia().getMozos();
      for (Mozo mozo : mozos) {
        if (mozo.getUser().equals(m) && mozo.getMesasAsignadas().size() < 5) {
            Mesa mesa = new Mesa(numero, mozo);
            mozo.getMesasAsignadas().add(mesa);
            mesas.add(mesa);
        }
      }
    }

    public ArrayList<Mesa> getMesas(){
        ArrayList<Mozo> mozos = Fachada.getInstancia().getMozos();
        for(Mozo m : mozos){
            for(Mesa mesa : m.getMesasAsignadas()){
                mesas.add(mesa);
            }
        }
        return mesas;
    }

    public ArrayList<Servicio> getServicios(){
        
        for(Mesa m : this.getMesas()){
            if(m.getServicio() != null){
                servicios.add(m.getServicio());
            }
        }
        
        return servicios;
    }
    
    public ArrayList<Pedido> getPedidos(){

        for(Servicio s : this.getServicios()){
            for(Pedido p : s.getPedidos()){
                pedidos.add(p);
            }
        }
        
        return pedidos;
    }
    
    public void setUltimoPedidoProcesado(Pedido p){
        ultimoPedidoProcesado = p;
    }
    
    public Pedido getUltimoPedidoProcesado(){
        return ultimoPedidoProcesado;
    }
    
    public void setUltimoPedidoFinalizado(Pedido p){
        this.ultimoPedidoFinalizado = p;
    }
    
    public Pedido getUltimoPedidoFinalizado(){
        return ultimoPedidoFinalizado;
    }

    public ArrayList<Cliente> getClientes(){
        return clientes;
    }
    
    public void agregarCliente(int id, String nombre, String email, String tipoCliente) {
        Cliente cliente = new Cliente(id, nombre,email);
        cliente.ValidarTipoCliente(tipoCliente);
        for(Cliente c : clientes) {
            if (!c.equals(cliente)) {
                clientes.add(cliente);
            }
        }
    }
    
}
