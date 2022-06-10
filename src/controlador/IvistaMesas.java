package controlador;

import Logica.Mesa;
import java.util.ArrayList;

public interface IvistaMesas {
    public void mostrarMesasAsignadas(ArrayList<Mesa> m);
    public void AbrirMesa(Mesa m);
}