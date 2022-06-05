package DatosPrueba;

import Logica.Fachada;
import Logica.Mesa;
import Logica.Mozo;
import java.util.ArrayList;

public class DatosPrueba {
    public static void cargar() {
        Fachada fachada = Fachada.getInstancia();
        
        //---- Mozos ----------------------------------
        ArrayList<Mesa> mesas = new ArrayList<>();
        fachada.agregarUsuarioMozo("a", "a", "Mozo 1", 123456789);
        fachada.agregarUsuarioMozo("b", "b", "Mozo 2", 123456789);
        fachada.agregarUsuarioMozo("c", "c", "Mozo 3", 123456789);
        fachada.agregarUsuarioMozo("d", "d", "Mozo 4", 123456789);
        fachada.agregarUsuarioMozo("e", "e", "Mozo 5", 123456789);
        fachada.agregarUsuarioMozo("f", "f", "Mozo 6", 123456789);
        
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
        Mozo mozo1 = new Mozo("a", "a", "Mozo 1", 123456789);
        Mesa mesa1 = new Mesa(1, mozo1);
        mozo1.getMesasAsignadas().add(mesa1);
    }
}
