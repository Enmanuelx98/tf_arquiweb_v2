package pe.edu.upc.tfcreo.ServicesImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.Entity.Pagos;
import pe.edu.upc.tfcreo.Repository.PagosRepository;
import pe.edu.upc.tfcreo.ServicesInterface.PagosServiceInterface;

import java.util.List;

@Service
public class PagosServiceImple implements PagosServiceInterface {
    @Autowired
    private PagosRepository pagosRepository;

    @Override
    public void insertarPagos(Pagos pagos) {
        pagosRepository.save(pagos);
    }

    @Override
    public void updatePagos(Pagos pagos) {
        pagosRepository.save(pagos);
    }

    @Override
    public void eliminarPagos(int id) {
        pagosRepository.deleteById(id);
    }

    @Override
    public List<Pagos> listarPagos() {
        return pagosRepository.findAll();
    }
}
