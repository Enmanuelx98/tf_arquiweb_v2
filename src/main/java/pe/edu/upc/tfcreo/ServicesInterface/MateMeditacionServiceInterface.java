package pe.edu.upc.tfcreo.ServicesInterface;

import pe.edu.upc.tfcreo.Entity.MaterialMeditacion;

import java.util.List;

public interface MateMeditacionServiceInterface {
    public void insertarMateMeditacion(MaterialMeditacion materialmeditacion);
    public void updateMateMeditacion(MaterialMeditacion materialmeditacion);
    public void eliminarMateMeditacion(int id);
    public List<MaterialMeditacion> listarMateMeditacion();
    public List<MaterialMeditacion> buscarmaterialnombre(String nombre);

}
