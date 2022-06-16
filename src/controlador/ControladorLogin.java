package controlador;

import Logica.Fachada;
import Logica.Sesion;
import Logica.UsuarioException;

public class ControladorLogin {
    IVistaLogin interfase;
    Fachada fachada;
    
    public ControladorLogin(IVistaLogin vista) {
        this.interfase = vista;
        this.fachada = Fachada.getInstancia();
    }

    public void loginMozo(String nom, String pwd) throws UsuarioException{
        Sesion s = fachada.loginMozo(nom, pwd);
        interfase.ejecutarProximoCasoUso(s);
    }

    public void loginGestor(String nom, String pwd) throws UsuarioException{
        Sesion s = fachada.loginGestor(nom, pwd);
        interfase.ejecutarProximoCasoUso(s);
    }
}
