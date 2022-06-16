package DatosPrueba;

import Logica.Fachada;

public class DatosPrueba {
    public static void cargar() {
        Fachada fachada = Fachada.getInstancia();
        
        //---- Mozos ----------------------------------
        //ArrayList<Mesa> mesas = new ArrayList<>();
        fachada.agregarUsuarioMozo("a", "a", "Nombre del Mozo 1", 123456789);
        fachada.agregarUsuarioMozo("b", "b", "Nombre del Mozo 2", 123456789);
        fachada.agregarUsuarioMozo("c", "c", "Nombre del Mozo 3", 123456789);
        fachada.agregarUsuarioMozo("d", "d", "Nombre del Mozo 4", 123456789);
        fachada.agregarUsuarioMozo("e", "e", "Nombre del Mozo 5", 123456789);
        fachada.agregarUsuarioMozo("f", "f", "Nombre del Mozo 6", 123456789);
        
        //---- Gestores -----------------------------------
        fachada.agregarUsuarioGestor("a", "a", "Gestor 1");
        fachada.agregarUsuarioGestor("b", "b", "Gestor 2");
        fachada.agregarUsuarioGestor("c", "c", "Gestor 3");
        fachada.agregarUsuarioGestor("d", "d", "Gestor 4");
        fachada.agregarUsuarioGestor("e", "e", "Gestor 5");
        fachada.agregarUsuarioGestor("f", "f", "Gestor 6");
        
        //---- Unidades Procesadoras ----------------------
        fachada.agregarUnidadProcesadora("Cocina");
        fachada.agregarUnidadProcesadora("Bar");
        fachada.agregarUnidadProcesadora("Barra de Sushi");

        //---- Mesas ----------------------
        fachada.agregarMesa(1,"a");
        fachada.agregarMesa(3,"a");
        fachada.agregarMesa(4,"a");
        fachada.agregarMesa(10,"a");
        fachada.agregarMesa(12,"a");
        fachada.agregarMesa(11,"a");
        
        fachada.agregarMesa(2,"b");
        fachada.agregarMesa(5,"b");
        fachada.agregarMesa(6,"b");
        //fachada.agregarMesa(7,"b");
        //fachada.agregarMesa(8,"b");
        //fachada.agregarMesa(9,"b");
        
        //---- Productos ----------------------
        fachada.agregarProducto(1,"Napolitana",380,30,fachada.getUnidades().get(0));
        fachada.agregarProducto(2,"Pizza",320,20,fachada.getUnidades().get(0));
        fachada.agregarProducto(3,"Muzarella",340,30,fachada.getUnidades().get(0));
        fachada.agregarProducto(4,"Tallarines",280,25,fachada.getUnidades().get(0));
        fachada.agregarProducto(5,"Hamburguesa",220,30,fachada.getUnidades().get(0));
        fachada.agregarProducto(6,"Fritas",130,80,fachada.getUnidades().get(0));
        fachada.agregarProducto(7,"Rústicas",140,70,fachada.getUnidades().get(0));
        
        fachada.agregarProducto(8,"Cerveza",180,200,fachada.getUnidades().get(1));
        fachada.agregarProducto(9,"Whisky",220,100,fachada.getUnidades().get(1));
        fachada.agregarProducto(10,"Gin Tonic",220,100,fachada.getUnidades().get(1));
        fachada.agregarProducto(11,"Ron",260,80,fachada.getUnidades().get(1));
        fachada.agregarProducto(12,"Daikiri",180,130,fachada.getUnidades().get(1));
        fachada.agregarProducto(13,"Fernet",200,180,fachada.getUnidades().get(1));
        fachada.agregarProducto(14,"Vino",220,170,fachada.getUnidades().get(1));
        
        fachada.agregarProducto(15,"Dragon Roll",890,200,fachada.getUnidades().get(2));
        fachada.agregarProducto(16,"Akita Roll",780,100,fachada.getUnidades().get(2));
        fachada.agregarProducto(17,"Sakura Roll",760,200,fachada.getUnidades().get(2));
        fachada.agregarProducto(18,"Sashimi",920,80,fachada.getUnidades().get(2));
        fachada.agregarProducto(19,"Chirashi",900,130,fachada.getUnidades().get(2));
        fachada.agregarProducto(20,"Nigiri",820,180,fachada.getUnidades().get(2));
        fachada.agregarProducto(21,"Futomaki",840,170,fachada.getUnidades().get(2));
        
        //---- Clientes ----------------------
        fachada.agregarCliente(1, "Cliente 1", "a@a.com", "Comun");
    }
}
