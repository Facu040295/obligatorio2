package Logica;

public class Mesa {
    private int numero;
    private Mozo mozoAsignado;
    private Servicio servicio;
    
    public Mesa(int numero, Mozo mozoAsignado, Servicio servicio) {
        this.numero = numero;
        this.mozoAsignado = mozoAsignado;
        this.servicio = servicio;
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
    
}
