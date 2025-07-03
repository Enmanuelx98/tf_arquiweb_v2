package pe.edu.upc.tfcreo.ServicesImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.Entity.Terapia;
import pe.edu.upc.tfcreo.Repository.TerapiaRepository;
import pe.edu.upc.tfcreo.ServicesInterface.TerapiaServiceInterface;

import java.util.List;
@Service
public class TerapiaServiceImple implements TerapiaServiceInterface {
    @Autowired
    private TerapiaRepository terapiaRepository;

    @Override
    public void insertarTerapia(Terapia terapia) {
        terapiaRepository.save(terapia);
    }

    @Override
    public void updateTerapia(Terapia terapia) {
        terapiaRepository.save(terapia);
    }

    @Override
    public void eliminarTerapia(int id) {
        terapiaRepository.deleteById(id);
    }

    @Override
    public List<Terapia> listarTerapia() {
        return terapiaRepository.findAll();
    }
}
