package Logica;

import Observador.Observable;
import java.util.ArrayList;

public class Fachada extends Observable {
    private SistemaUsuarios sUsuarios = new SistemaUsuarios();
    private SistemaUnidadesProcesadoras sUnidadesProcesadoras = new SistemaUnidadesProcesadoras();
    private SistemaMesas sMesas = new SistemaMesas();
    
    private static Fachada instancia = new Fachada();

    public enum Eventos{abrirMesa, agregarPedido, agregarPedidoGestor, finalizarPedido};
    
    public static Fachada getInstancia() {
        return instancia;
    }

    public void agregarUsuarioMozo(String n, String p, String nc, int telefono) {
        sUsuarios.agregarUsuarioMozo(n, p, nc, telefono);
    }

    public ArrayList<Mozo> getMozos(){
        return sUsuarios.getMozos();
    }

    public void agregarUsuarioGestor(String n, String p, String nc) {
        sUsuarios.agregarUsuarioGestor(n, p, nc);
    }
    
    public Sesion loginMozo(String u, String p) throws UsuarioException {
        return sUsuarios.loginMozo(u, p);
    }

    public Sesion loginGestor(String nom, String pwd) throws UsuarioException {
        return sUsuarios.loginGestor(nom, pwd);
    }
    
    public void agregarUnidadProcesadora(String n) {
        sUnidadesProcesadoras.agregarUnidadProcesadora(n);
    }

    public ArrayList<UnidadProcesadora> getUnidades() {
        return sUnidadesProcesadoras.getUnidades();
    }
    
    public ArrayList<Pedido> getPedidosUnidad(UnidadProcesadora u){
        return sUnidadesProcesadoras.getPedidosUnidad(u);
    }
    
    public void agregarMesa(int numero, String m) {
        sMesas.agregarMesa(numero, m);
    }
    
    public void agregarCliente(int id, String nombre, String email, String tipoCliente) {
        sMesas.agregarCliente(id, nombre, email, tipoCliente);
    }
    
    public ArrayList<Cliente> getClientes() {
        return sMesas.getClientes();
    }
    
    public ArrayList<Pedido> getPedidos() {
        return sMesas.getPedidos();
    }
    
    public void agregarProducto(int codigo, String nombre, float precioUnitario, int stock, UnidadProcesadora unidadProcesadora){
        sUnidadesProcesadoras.agregarProducto(codigo, nombre, precioUnitario, stock, unidadProcesadora);
    }
    
    public void logout(Sesion s) {
        sUsuarios.logout(s);
    }

}
