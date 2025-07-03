package pe.edu.upc.tfcreo.ServicesInterface;

import pe.edu.upc.tfcreo.Entity.TecnicaMeditacion;

import java.util.List;

public interface TecMeditacionServiceInterface {
    public void insertarTecMeditacion(TecnicaMeditacion tecnicameditacion);
    public void updateTecMeditacion(TecnicaMeditacion tecnicameditacion);
    public void eliminarTecMeditacion(int id);
    public List<TecnicaMeditacion> listarTecMeditacion();
    public List<String[]> tecnicaMeditacionPorTipoTerapia();
    public List<String[]> cantidadTecnicasMeditacionPorTipoTerapia();
}
