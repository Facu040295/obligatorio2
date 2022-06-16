package Logica;

public class Preferencial extends TipoCliente{
    
    public Preferencial() {
        super("Preferencial");
    }

    @Override
    protected boolean validar(String nombre) {
        if (nombre == "Preferencial"){
            return true;
        }
        return false;
    }
    
}
