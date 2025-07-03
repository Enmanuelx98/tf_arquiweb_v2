package pe.edu.upc.tfcreo.ServicesImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.Entity.MaterialMeditacion;
import pe.edu.upc.tfcreo.Repository.MateMeditacionRepository;
import pe.edu.upc.tfcreo.ServicesInterface.MateMeditacionServiceInterface;

import java.util.List;

@Service
public class MateMeditacionServiceImple implements MateMeditacionServiceInterface {
    @Autowired
    private MateMeditacionRepository mateMeditacionRepository;
    @Override
    public void insertarMateMeditacion(MaterialMeditacion materialmeditacion) {
        mateMeditacionRepository.save(materialmeditacion);
    }

    @Override
    public void updateMateMeditacion(MaterialMeditacion materialmeditacion) {
        mateMeditacionRepository.save(materialmeditacion);
    }

    @Override
    public void eliminarMateMeditacion(int id) {
        mateMeditacionRepository.deleteById(id);
    }

    @Override
    public List<MaterialMeditacion> listarMateMeditacion() {
        return mateMeditacionRepository.findAll();
    }

    @Override
    public List<MaterialMeditacion> buscarmaterialnombre(String nombre) {
        return mateMeditacionRepository.buscarmaterialnombre(nombre);
    }
}
