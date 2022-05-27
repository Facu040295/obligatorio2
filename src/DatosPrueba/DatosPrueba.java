package DatosPrueba;

import Logica.Fachada;

public class DatosPrueba {
    public static void cargar() {
        Fachada fachada = Fachada.getInstancia();
        
        //---- Mozos ----------------------------------
        fachada.agregarUsuarioMozo("a", "a", "Mozo 1");
        fachada.agregarUsuarioMozo("b", "b", "Mozo 2");
        fachada.agregarUsuarioMozo("c", "c", "Mozo 3");
        fachada.agregarUsuarioMozo("d", "d", "Mozo 4");
        fachada.agregarUsuarioMozo("e", "e", "Mozo 5");
        fachada.agregarUsuarioMozo("f", "f", "Mozo 6");
        
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


    }
}
