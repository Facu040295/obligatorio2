package Logica;

import java.util.ArrayList;
import logica.UsuarioException;

class SistemaUsuarios {
    private ArrayList<Mozo> usuariosMozo = new ArrayList();
    private ArrayList<Gestor> usuariosGestor = new ArrayList();
    
    public boolean agregarUsuarioMozo(String n, String p, String nc) {
    if (ValidarUsuario(n, true)) {
        usuariosMozo.add(new Mozo(n, p, nc));
        return true;
    }
    return false;
    }

    public void agregarUsuarioGestor(String n, String p, String nc) throws UsuarioException {
    if (!ValidarUsuario(n, false)) {
        throw new UsuarioException("Login incorrecto");
    }
    usuariosGestor.add(new Gestor(n, p, nc));
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
        Mozo m = (Mozo) login(u, p, usuariosMozo);
        if (m == null) {
            throw new UsuarioException("Login incorrecto");
        }
        return m;
    }

    public Gestor loginGestor(String nom, String pwd) throws UsuarioException {
        Gestor g = (Gestor) login(nom, pwd, usuariosGestor);
        if (g == null) {
            throw new UsuarioException("Login incorrecto");
        }
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
}
