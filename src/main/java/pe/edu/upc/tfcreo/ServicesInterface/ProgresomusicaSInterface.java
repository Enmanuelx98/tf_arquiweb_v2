package pe.edu.upc.tfcreo.ServicesInterface;
import pe.edu.upc.tfcreo.Entity.ProgresomusicaS;

import java.util.List;

public interface ProgresomusicaSInterface {
    public void insertarProgresoMusica(ProgresomusicaS progresomusica);
    public void updateProgresoMusica(ProgresomusicaS progresomusica);
    public void eliminarProgresoMusica(int id);
    public List<ProgresomusicaS> listarProgresoMusica();
    public double calcularPorcentajeProgreso(int idSesion);
    public List<ProgresomusicaS> quantityMusicaCompletoBySesion(int idSesion);
}
