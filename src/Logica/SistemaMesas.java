package Logica;

import java.util.ArrayList;

public class SistemaMesas {
    
    private Fachada fachada = Fachada.getInstancia();
    
    public ArrayList<Mesa> getMesas(){
        
        ArrayList<Mozo> mozos = fachada.getMozos();
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
            servicios.add(m.getServicio());
        }
        
        return servicios;
    }
    
}
