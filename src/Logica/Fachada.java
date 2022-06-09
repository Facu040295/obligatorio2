package Logica;

import Observador.Observable;
import java.util.ArrayList;
import Logica.UsuarioException;

public class Fachada extends Observable {
    private SistemaUsuarios sUsuarios = new SistemaUsuarios();
    private SistemaUnidadesProcesadoras sUnidadesProcesadoras = new SistemaUnidadesProcesadoras();
    
    private static Fachada instancia = new Fachada();
    
    public static Fachada getInstancia() {
        return instancia;
    }
    
    private Fachada() {
    }
    
    public void agregarUsuarioMozo(String n, String p, String nc, int telefono) {
        sUsuarios.agregarUsuarioMozo(n, p, nc, telefono);
    }

    public void agregarUsuarioGestor(String n, String p, String nc) {
        sUsuarios.agregarUsuarioGestor(n, p, nc);
    }
    
    public Mozo loginMozo(String u, String p) throws UsuarioException {
        return sUsuarios.loginMozo(u, p);
    }

    public Gestor loginGestor(String nom, String pwd) throws UsuarioException {
        return sUsuarios.loginGestor(nom, pwd);
    }
    
    public void agregarUnidadProcesadora(String n) {
        sUnidadesProcesadoras.agregarUnidadProcesadora(n);
    }

    public ArrayList<UnidadProcesadora> getUnidadesProcesadoras() {
        return sUnidadesProcesadoras.getUnidades();
    }
    
     public void agregarMesa(int numero, String m, boolean ocupado) {
        sUsuarios.agregarMesa(numero, m, ocupado);
    }
    
    public void logout(Sesion s) {
        sUsuarios.logout(s);
    }
}
