package controlador;

import Logica.Fachada;
import Logica.Mesa;
import Logica.Mozo;
import Observador.Observable;
import Observador.Observador;
import java.util.ArrayList;
import Logica.Sesion;

public class ControladorMesas implements Observador {

    //IvistaMesas miInterface;
    Fachada fachada;
    Mozo mozo;
    Sesion sesion;
    
    public ControladorMesas(Mozo m) {
        fachada = Fachada.getInstancia();
        mozo = m;
    }
    
    public ArrayList<Mesa> MesasAsignadas() {
        return mozo.getMesasAsignadas();
    }
    
    public void logout() {
       fachada.logout(sesion);
       fachada.quitar(this);
    }
    
    @Override
    public void actualizar(Object evento, Observable origen) {
        //if (evento.equals(mozo.Eventos.actualizarMesas)) {

    }
}
