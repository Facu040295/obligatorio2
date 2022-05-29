package Logica;

import java.util.ArrayList;
import logica.UsuarioException;

class SistemaUsuarios {
    private ArrayList<Mozo> usuariosMozo = new ArrayList();
    private ArrayList<Gestor> usuariosGestor = new ArrayList();
    private ArrayList<Usuario> usuariosIngresados = new ArrayList();
    
    public boolean agregarUsuarioMozo(String n, String p, String nc) {
    if (ValidarUsuario(n, true)) {
        usuariosMozo.add(new Mozo(n, p, nc));
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
        Usuario m;
        m = login(u, p, usuariosIngresados);
        if(yaIngresado(m)){
            throw new UsuarioException("Ud. ya está logueado");
        }
        m = (Mozo) login(u, p, usuariosMozo);
        if (m == null) {
            throw new UsuarioException("Nombre de usuario y/o contraseña incorrectos");
        }
        usuariosIngresados.add(m);
        return (Mozo) m;
    }

    public Gestor loginGestor(String nom, String pwd) throws UsuarioException {
        Usuario g;
        g = login(nom, pwd, usuariosIngresados);
        if(yaIngresado(g)){
            throw new UsuarioException("Ud. ya está logueado");
        }
        g = (Gestor) login(nom, pwd, usuariosGestor);
        if (g == null) {
            throw new UsuarioException("Nombre de usuario y/o contraseña incorrectos");
        }
        usuariosIngresados.add(g);
        return (Gestor) g;
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
    
    public boolean yaIngresado(Usuario u) {
        for (Usuario usuariosIngresados : usuariosIngresados) {
            if (usuariosIngresados.equals(u)) {
                return true;
            }
        }
        return false;
    }
}
