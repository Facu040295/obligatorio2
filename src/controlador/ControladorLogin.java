package controlador;

import Logica.Fachada;
import Logica.Gestor;
import Logica.Mozo;
import Logica.UsuarioException;

public class ControladorLogin {
    IvistaLogin interfase;
    Fachada fachada;
    
    public ControladorLogin(IvistaLogin vista) {
        this.interfase = vista;
        this.fachada = Fachada.getInstancia();
    }

    public void loginMozo(String nom, String pwd) throws UsuarioException{
        Mozo m = fachada.loginMozo(nom, pwd);
        interfase.ejecutarProximoCasoUso(m);
    }

    public void loginGestor(String nom, String pwd) throws UsuarioException{
        Gestor g = fachada.loginGestor(nom, pwd);
        interfase.ejecutarProximoCasoUso(g);
    }
}
