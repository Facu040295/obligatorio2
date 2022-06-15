package Logica;

import java.util.ArrayList;

public class SistemaMesas {
    
    public ArrayList<Mesa> getMesas(){
        
        ArrayList<Mozo> mozos = Fachada.getInstancia().getMozos();
        ArrayList<Mesa> mesas = new ArrayList<>();
        
        for(Mozo m : mozos){
            for(Mesa mesa : m.getMesasAsignadas()){
                mesas.add(mesa);
            }
        }
        
        return mesas;
    }
    
    public ArrayList<Servicio> getServicios(){
        
        ArrayList<Mesa> mesas = this.getMesas();
        ArrayList<Servicio> servicios = new ArrayList<>();
        
        for(Mesa m : mesas){
            if(m.getServicio() != null){
                servicios.add(m.getServicio());
            }
        }
        
        return servicios;
    }
    
    public ArrayList<Pedido> getPedidos(){
        ArrayList<Servicio> servicios = this.getServicios();
        ArrayList<Pedido> pedidos = new ArrayList<>();
        
        for(Servicio s : servicios){
            for(Pedido p : s.getPedidos()){
                pedidos.add(p);
            }
        }
        
        return pedidos;
    }
    
}
