package Logica;

import Observador.Observable;
import java.util.ArrayList;

public class Mozo extends Usuario {
    private int telefono;
    private ArrayList<Mesa> mesasAsignadas;
    
    public Mozo(String nombre, String password, String nombreCompleto, int telefono) {
        super(nombre, password, nombreCompleto);
        this.telefono = telefono;
        this.mesasAsignadas = new ArrayList<Mesa>();
    }

    public enum Eventos {
        actualizarMesas;
    }
    
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Mesa> getMesasAsignadas() {
        return mesasAsignadas;
    }

    public void setMesasAsignadas(ArrayList<Mesa> mesasAsignadas) {
        this.mesasAsignadas = mesasAsignadas;
    }

    
}
