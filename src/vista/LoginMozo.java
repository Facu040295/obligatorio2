package vista;

import Logica.Mozo;
import controlador.ControladorLogin;
import java.awt.Frame;
import logica.UsuarioException;

public class LoginMozo extends LoginAbstracto{
    
    ControladorLogin controlador;
    
    public LoginMozo(Frame parent, boolean modal) {
        super(parent, modal);
        this.controlador = new ControladorLogin(this);
    }

    @Override
    public String getTitulo() {
        return "LOGIN DEL MOZO";
    }

    @Override
    public void invocarLoginLogicaNegocio(String nom, String pwd) throws UsuarioException {
        controlador.loginMozo(nom, pwd);  
    }

    @Override
    public void ejecutarProximoCasoUso(Object dato) {
        new VistaMozos(null, false, (Mozo) dato).setVisible(true);
    }
}
