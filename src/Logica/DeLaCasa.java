package Logica;

public class DeLaCasa extends TipoCliente{
    
    public DeLaCasa() {
        super("DeLaCasa");
    }

    @Override
    protected boolean validar(String nombre) {
        if (nombre == "DeLaCasa"){
            return true;
        }
        return false;
    }
}
