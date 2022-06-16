package Logica;

import java.util.ArrayList;

public class SistemaMesas {
    
    private ArrayList<Mesa> mesas = new ArrayList<>();
    private ArrayList<Servicio> servicios = new ArrayList<>();
    private ArrayList<Pedido> pedidos = new ArrayList<>();
    
    public void agregarMesa(int numero, String m) {    
      ArrayList<Mozo> mozos = Fachada.getInstancia().getMozos();
      for (Mozo mozo : mozos) {
        if (mozo.getUser().equals(m) && mozo.getMesasAsignadas().size() < 5) {
            Mesa mesa = new Mesa(numero, mozo);
            mozo.getMesasAsignadas().add(mesa);
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
    
}
