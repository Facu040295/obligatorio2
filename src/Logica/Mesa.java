package Logica;

public class Mesa {
    private int numero;
    private Mozo mozoAsignado;
    private Servicio servicio;
    private boolean ocupado;
    
    public Mesa(int numero, Mozo mozoAsignado) {
        this.numero = numero;
        this.mozoAsignado = mozoAsignado;
        this.ocupado = false;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Mozo getMozoAsignado() {
        return mozoAsignado;
    }

    public void setMozoAsignado(Mozo mozoAsignado) {
        this.mozoAsignado = mozoAsignado;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
}
