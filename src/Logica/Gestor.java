package Logica;

import java.time.Instant;
import java.util.Date;

public class Gestor extends Usuario{
    private Date ultimaConexion;
    
    public Gestor(String nombre, String password, String nombreCompleto) {
        super(nombre, password, nombreCompleto);
        this.ultimaConexion = Date.from(Instant.now());
    }

    public Date getUltimaConexion() {
        return ultimaConexion;
    }

    public void setUltimaConexion(Date ultimaConexion) {
        this.ultimaConexion = ultimaConexion;
    }
    
}
