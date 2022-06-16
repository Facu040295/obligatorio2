package Logica;

import Observador.Observable;

public abstract class Usuario extends Observable{
    private String user;
    private String password;
    private String nombreCompleto;

    public Usuario(String nombre, String password, String nombreCompleto) {
        this.user = nombre;
        this.password = password;
        this.nombreCompleto = nombreCompleto;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

}
