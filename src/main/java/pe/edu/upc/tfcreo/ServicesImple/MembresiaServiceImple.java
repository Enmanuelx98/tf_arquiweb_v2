package pe.edu.upc.tfcreo.ServicesImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.Entity.Membresia;
import pe.edu.upc.tfcreo.Repository.MembresiaRepository;
import pe.edu.upc.tfcreo.ServicesInterface.MembresiaServiceInterface;

import java.util.List;
@Service
public class MembresiaServiceImple implements MembresiaServiceInterface {
    @Autowired
    private MembresiaRepository membresiaRepository;

    @Override
    public void insertarMembresia(Membresia membresia) {
        membresiaRepository.save(membresia);
    }

    @Override
    public void updateMembresia(Membresia membresia) {
        membresiaRepository.save(membresia);
    }

    @Override
    public void eliminarMembresia(int id) {
        membresiaRepository.deleteById(id);
    }

    @Override
    public List<Membresia> listarMembresia() {
        return membresiaRepository.findAll();
    }
}
