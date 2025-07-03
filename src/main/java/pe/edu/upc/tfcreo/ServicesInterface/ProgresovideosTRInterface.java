package pe.edu.upc.tfcreo.ServicesInterface;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.tfcreo.Entity.ProgresovideosTR;

import java.util.List;

public interface ProgresovideosTRInterface {
    public void insertarProgresoVideosTR(ProgresovideosTR progresovideosTR);
    public void updateProgresoVideosTR(ProgresovideosTR progresovideosTR);
    public void eliminarProgresoVideosTR(int id);
    public List<ProgresovideosTR> listarProgresoVideosTR();
    public double calcularPorcentajeProgreso(int idSesion);
    public List<ProgresovideosTR> quantityVideosCompletadosBySesion(int idSesion);

}
