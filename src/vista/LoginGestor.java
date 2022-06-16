package vista;

import Logica.Gestor;
import Logica.Sesion;
import Logica.UnidadProcesadora;
import controlador.ControladorLogin;
import java.awt.Frame;
import Logica.UsuarioException;
import java.util.ArrayList;

public class LoginGestor extends LoginAbstracto{

    ControladorLogin controlador;
    
    public LoginGestor(Frame parent, boolean modal) {
        super(parent, modal);
        this.controlador = new ControladorLogin(this);
    }
    
    @Override
    public String getTitulo() {
        return "UNIDADES PROCESADORAS";
    }

    @Override
    public void invocarLoginLogicaNegocio(String nom, String pwd) throws UsuarioException {
        controlador.loginGestor(nom, pwd);
    }

    @Override
    public void ejecutarProximoCasoUso(Object dato) {
        new VistaMonitorPedidos(null, false, (Sesion) dato).setVisible(true);
    }
    
}
