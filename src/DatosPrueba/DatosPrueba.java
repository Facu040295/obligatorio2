package DatosPrueba;

import Logica.Fachada;

public class DatosPrueba {
    public static void cargar() {
        Fachada fachada = Fachada.getInstancia();
        
        //------------------  Jugadores  -------------------------
        fachada.agregarUsuarioMozo("a", "a", "Mozo 1");
        fachada.agregarUsuarioMozo("b", "b", "Mozo 2");
        fachada.agregarUsuarioMozo("c", "c", "Mozo 3");
        fachada.agregarUsuarioMozo("d", "d", "Mozo 4");
        fachada.agregarUsuarioMozo("e", "e", "Mozo 5");
        fachada.agregarUsuarioMozo("f", "f", "Mozo 6");
    }
}
