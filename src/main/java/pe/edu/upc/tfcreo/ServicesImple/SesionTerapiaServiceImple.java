package pe.edu.upc.tfcreo.ServicesImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.Entity.SesionTerapia;
import pe.edu.upc.tfcreo.Repository.SesionTerapiaRepository;
import pe.edu.upc.tfcreo.ServicesInterface.SesionTerapiaInterface;

import java.util.List;
@Service
public class SesionTerapiaServiceImple implements SesionTerapiaInterface {
    @Autowired
    private SesionTerapiaRepository sesionTerapiaRepository;
    @Override
    public void insertarSesionTerapia(SesionTerapia sesionT) {
        sesionTerapiaRepository.save(sesionT);
    }

    @Override
    public void updateSesionTerapia(SesionTerapia sesionT) {
        sesionTerapiaRepository.save(sesionT);
    }

    @Override
    public void eliminarSesionTerapia(int id) {
        sesionTerapiaRepository.deleteById(id);
    }

    @Override
    public List<SesionTerapia> listarSesionTerapia() {
        return sesionTerapiaRepository.findAll();
    }

    @Override
    public List<SesionTerapia> quantitySesionesbyUsuario(int u) {
        return sesionTerapiaRepository.quantitySesionesbyUsuario(u);
    }

    @Override
    public List<SesionTerapia> quantitySesionesCompletobyUsuario(int u2) {
        return sesionTerapiaRepository.quantitySesionesCompletobyUsuario(u2);
    }

    @Override
    public List<String[]> usermoresesiones() {
        return sesionTerapiaRepository.usermoresesiones();
    }

    @Override
    public List<String[]> terapiamoresesesions() {
        return sesionTerapiaRepository.terapiamoresesesions();
    }
}
