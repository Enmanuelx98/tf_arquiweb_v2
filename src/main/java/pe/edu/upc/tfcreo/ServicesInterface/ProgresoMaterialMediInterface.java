package pe.edu.upc.tfcreo.ServicesInterface;

import pe.edu.upc.tfcreo.Entity.ProgresoMaterialMedi;

import java.util.List;

public interface ProgresoMaterialMediInterface {
    public void insertarProgresoMaterialMedi(ProgresoMaterialMedi progresomaterialmedi);
    public void updateProgresoMaterialMedi(ProgresoMaterialMedi progresomaterialmedi);
    public void eliminarProgresoMaterialMedi(int id);
    public List<ProgresoMaterialMedi> listarProgresoMaterialMedi();
    public double calcularPorcentajeProgreso(int idSesion);
    public List<ProgresoMaterialMedi> quantityMaterialCompletadosBySesion(int idSesion);

}
