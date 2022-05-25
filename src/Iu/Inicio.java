package Iu;
import DatosPrueba.DatosPrueba;

public class Inicio {
    public static void main(String[] args) {
        DatosPrueba.cargar();
        new MenuPrincipal().setVisible(true);
    }
}
