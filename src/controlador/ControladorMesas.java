package controlador;

import Logica.Fachada;
import Observador.Observable;
import Observador.Observador;
import vista.VistaMozos;

public class ControladorMesas implements Observador {

    Fachada fachada;
    
    public ControladorMesas() {
        fachada = Fachada.getInstancia();
    }

    public ControladorMesas(VistaMozos aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void actualizar(Object evento, Observable origen) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
