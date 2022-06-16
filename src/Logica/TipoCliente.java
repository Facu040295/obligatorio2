package Logica;

public abstract class TipoCliente {
    private String nombre;

    public TipoCliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    protected String removerEspacios(String caracteres) {
        return caracteres.replace(" ", "");
    }
    
    protected abstract boolean validar(String nombre);
}
