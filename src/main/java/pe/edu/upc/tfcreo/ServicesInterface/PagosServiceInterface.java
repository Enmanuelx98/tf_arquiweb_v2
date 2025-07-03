package pe.edu.upc.tfcreo.ServicesInterface;

import pe.edu.upc.tfcreo.Entity.MusicaCategoria;
import pe.edu.upc.tfcreo.Entity.Pagos;

import java.util.List;

public interface PagosServiceInterface {
    public void insertarPagos(Pagos pagos);
    public void updatePagos(Pagos pagos);
    public void eliminarPagos(int id);
    public List<Pagos > listarPagos();
    public Pagos listId(int id);

}
