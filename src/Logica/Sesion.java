
package Logica;

import java.util.Date;


public class Sesion {
    private Date fechaHoraIngreso = new Date();
    private Gestor usuarioGestor;
    private Mozo usuarioMozo;
    
    public Sesion(Gestor usuarioGestor, Mozo usuarioMozo) {
        this.usuarioGestor = usuarioGestor;
        this.usuarioMozo = usuarioMozo;
    }

    public Date getFechaHoraIngreso() {
        return fechaHoraIngreso;
    }

    public Gestor getUsuarioGestor() {
        return usuarioGestor;
    }

    public Mozo getUsuarioMozo() {
        return usuarioMozo;
    }

    @Override
    public String toString() {
        if (usuarioGestor != null)
            return usuarioGestor.getNombreCompleto(); 
        else 
            return usuarioMozo.getNombreCompleto();
    }
}
