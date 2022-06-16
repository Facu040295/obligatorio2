package Logica;

public class Cliente {
    private int id;
    private String nombre;
    private String email;
    private TipoCliente tipoCliente;
    
    public Cliente(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.tipoCliente = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    
    protected void ValidarTipoCliente (String nombre){
        TipoCliente tipoCliente = null;
        if(nombre == "Comun" /*&&  tipoCliente.validar(nombre)*/){
            tipoCliente = new Comun();
            this.setTipoCliente(tipoCliente);
        }
        if(nombre == "DeLaCasa" /*&&  tipoCliente.validar(nombre)*/){
            tipoCliente = new DeLaCasa();
            this.setTipoCliente(tipoCliente);
        }
        if(nombre == "Preferencial" /*&&  tipoCliente.validar(nombre)*/){
            tipoCliente = new Preferencial();
            this.setTipoCliente(tipoCliente);
        }
    }
}
