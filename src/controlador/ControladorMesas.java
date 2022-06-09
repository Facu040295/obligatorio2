package controlador;

import Logica.Fachada;
import Logica.Mesa;
import Logica.Mozo;
import Logica.Servicio;
import Observador.Observable;
import Observador.Observador;
import java.util.ArrayList;
import Logica.Sesion;
import java.awt.Color;

public class ControladorMesas implements Observador {

    //IvistaMesas miInterface;
    Fachada fachada;
    Mozo mozo;
    Sesion sesion;
    IvistaMesas vista;
    
    public ControladorMesas(Mozo m, IvistaMesas v) {
        fachada = Fachada.getInstancia();
        mozo = m;
        vista = v;
    }
    
    public ArrayList<Mesa> getMesasAsignadas(){
        return mozo.getMesasAsignadas();
    }
    
    public void MesasAsignadas() {
        vista.mostrarMesasAsignadas(mozo.getMesasAsignadas());
    }
    
    public void logout() {
       fachada.logout(sesion);
       fachada.quitar(this);
    }
    
    public void abrirMesa(Mesa m) {
        Servicio s = new Servicio(m, null, null, 0);
        m.setServicio(s);
    }
    
    @Override
    public void actualizar(Object evento, Observable origen) {
        //if (evento.equals(mozo.Eventos.actualizarMesas)) {

    }

}
