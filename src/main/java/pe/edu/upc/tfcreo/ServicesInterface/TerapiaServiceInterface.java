package pe.edu.upc.tfcreo.ServicesInterface;

import pe.edu.upc.tfcreo.Entity.Terapia;

import java.util.List;

public interface TerapiaServiceInterface {
    public void insertarTerapia(Terapia terapia);
    public void updateTerapia(Terapia terapia);
    public void eliminarTerapia(int id);
    public List<Terapia> listarTerapia();
}
