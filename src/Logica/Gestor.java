package Logica;

import java.util.Date;

public class Gestor extends Usuario{
    private Date ultimaConexion;
    
    public Gestor(String nombre, String password, String nombreCompleto, Date ultimaConexion) {
        super(nombre, password, nombreCompleto);
        this.ultimaConexion = ultimaConexion;
    }

    public Date getUltimaConexion() {
        return ultimaConexion;
    }

    public void setUltimaConexion(Date ultimaConexion) {
        this.ultimaConexion = ultimaConexion;
    }
    
}
