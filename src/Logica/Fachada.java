package Logica;

import Observador.Observable;
import logica.UsuarioException;

public class Fachada extends Observable {
    private SistemaUsuarios sUsuarios = new SistemaUsuarios();
    private static Fachada instancia = new Fachada();
    
    public static Fachada getInstancia() {
        return instancia;
    }
    
    private Fachada() {
    }
    
    public boolean agregarUsuarioMozo(String n, String p, String nc) {
        return sUsuarios.agregarUsuarioMozo(n, p, nc);
    }

    public void agregarUsuarioGestor(String n, String p, String nc) throws UsuarioException {
        sUsuarios.agregarUsuarioGestor(n, p, nc);
    }

    public boolean ValidarUsuario(String n, boolean esJugador) {
        return sUsuarios.ValidarUsuario(n, esJugador);
    }
    
    public Mozo loginMozo(String u, String p) throws UsuarioException {
        return sUsuarios.loginMozo(u, p);
    }

    public Gestor loginGestor(String nom, String pwd) throws UsuarioException {
        return sUsuarios.loginGestor(nom, pwd);
    }
}
