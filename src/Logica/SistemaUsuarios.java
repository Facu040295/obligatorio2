package Logica;

import java.util.ArrayList;
import Logica.UsuarioException;

class SistemaUsuarios {
    private ArrayList<Mozo> usuariosMozo = new ArrayList();
    private ArrayList<Gestor> usuariosGestor = new ArrayList();
    private ArrayList<Sesion> usuariosIngresados = new ArrayList();
    
    public boolean agregarUsuarioMozo(String n, String p, String nc, int telefono) {
    if (ValidarUsuario(n, true)) {
        usuariosMozo.add(new Mozo(n, p, nc, telefono));
        return true;
    }
    return false;
    }

    public boolean agregarUsuarioGestor(String n, String p, String nc) {
    if (ValidarUsuario(n, false)) {
        usuariosGestor.add(new Gestor(n, p, nc));
        return true;
    }
    return false;
    }
        
    public boolean ValidarUsuario(String n, boolean esMozo) {
        if (esMozo) {
            for (Mozo m : usuariosMozo) {
                if (m.getUser().equals(n)) {
                    return false;
                }
            }
        } else {
            for (Gestor g : usuariosGestor) {
                if (g.getUser().equals(n)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public Mozo loginMozo(String u, String p) throws UsuarioException {
        Sesion s = null;
        Usuario usuarioMozo = (Mozo) login(u, p, usuariosMozo);
        if (usuarioMozo == null) {
            throw new UsuarioException("Nombre de usuario y/o contraseña incorrectos");
        }
        Mozo m = (Mozo) usuarioMozo;
        s = new Sesion (null, m);
        if(yaIngresado(s)){
            throw new UsuarioException("Ud. ya está logueado");
        }
        usuariosIngresados.add(s);
        return m;
    }

    public Gestor loginGestor(String nom, String pwd) throws UsuarioException {
        Sesion s = null;
        Usuario u = (Gestor) login(nom, pwd, usuariosGestor);
        if (u == null) {
            throw new UsuarioException("Nombre de usuario y/o contraseña incorrectos");
        }
        Gestor g = (Gestor) u;
        s = new Sesion (g, null);
        if(yaIngresado(s)){
            throw new UsuarioException("Ud. ya está logueado");
        }
        usuariosIngresados.add(s);
        return g;
    }
    
    private Usuario login(String nom, String pwd, ArrayList usuarios) {
        Usuario u;
        for (Object obj : usuarios) {
            u = (Usuario) obj;
            if (u.getUser().equals(nom) && u.getPassword().equals(pwd)) {
                return u;
            }
        }
        return null;
    }
    
    public boolean yaIngresado(Sesion s) {
        for (Sesion usuarioIngresado : usuariosIngresados) {
            if (usuarioIngresado.getUsuarioGestor() == s.getUsuarioGestor()&&usuarioIngresado.getUsuarioMozo() == null) {
                return true;
            }
            if (usuarioIngresado.getUsuarioMozo() == s.getUsuarioMozo()&&usuarioIngresado.getUsuarioGestor() == null) {
                return true;
            }
        }
        return false;
    }
    
    public void logout(Sesion s){
        usuariosIngresados.remove(s);
    }

    public void agregarMesa(int numero, String m, boolean ocupado) {      
      for (Mozo mozo : usuariosMozo) {
        if (mozo.getUser().equals(m) && mozo.getMesasAsignadas().size() < 5) {
            Mesa mesa = new Mesa(numero, mozo, ocupado);
            mozo.getMesasAsignadas().add(mesa);
        }
      }
    }
}
