package Logica;

public class Comun extends TipoCliente{
    
    public Comun() {
        super("Comun");
    }

    @Override
    protected boolean validar(String nombre) {
        if (nombre == "Comun"){
            return true;
        }
        return false;
    }
    
}
