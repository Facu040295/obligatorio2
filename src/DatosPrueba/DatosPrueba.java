package DatosPrueba;

import Logica.Fachada;
import Logica.Mesa;
import Logica.Mozo;
import java.util.ArrayList;

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
        fachada.agregarMesa(1,"a",false);
        fachada.agregarMesa(3,"a",true);
        fachada.agregarMesa(4,"a",true);
        fachada.agregarMesa(10,"a",false);
        fachada.agregarMesa(12,"a",false);
        fachada.agregarMesa(2,"a",true);
        
        fachada.agregarMesa(2,"b",true);
        fachada.agregarMesa(5,"b",false);
        fachada.agregarMesa(6,"b",true);
        fachada.agregarMesa(7,"b",false);
        fachada.agregarMesa(8,"b",true);
        fachada.agregarMesa(9,"b",true);
    }
}
