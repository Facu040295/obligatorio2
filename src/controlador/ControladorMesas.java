package controlador;

import Logica.Fachada;
import Logica.Mesa;
import Logica.Mozo;
import Observador.Observable;
import Observador.Observador;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class ControladorMesas implements Observador {

    //IvistaMesas miInterface;
    Fachada fachada;
    Mozo mozo;
    ArrayList<Mesa> mesasAsignadas;
    
    public ControladorMesas(Mozo m) {
        fachada = Fachada.getInstancia();
        this.mozo = m;
        this.mesasAsignadas = m.getMesasAsignadas();
    }
    
    @Override
    public void actualizar(Object evento, Observable origen) {
        //if (evento.equals(mozo.Eventos.actualizarMesas)) {

    }

    //public void AsignarImagenMesa(Mozo m) {
        //for (Mesa mesa : mesasAsignadas){
            
        //}
    //}
    
}
