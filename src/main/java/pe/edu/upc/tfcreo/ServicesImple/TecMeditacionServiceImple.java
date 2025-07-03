package pe.edu.upc.tfcreo.ServicesImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.Entity.TecnicaMeditacion;
import pe.edu.upc.tfcreo.Repository.TecMeditacionRepository;
import pe.edu.upc.tfcreo.ServicesInterface.TecMeditacionServiceInterface;

import java.util.List;
@Service
public class TecMeditacionServiceImple implements TecMeditacionServiceInterface {
    @Autowired
    private TecMeditacionRepository tecMeditacionRepository;
    @Override
    public void insertarTecMeditacion(TecnicaMeditacion tecnicameditacion) {
        tecMeditacionRepository.save(tecnicameditacion);
    }

    @Override
    public void updateTecMeditacion(TecnicaMeditacion tecnicameditacion) {
        tecMeditacionRepository.save(tecnicameditacion);
    }

    @Override
    public void eliminarTecMeditacion(int id) {
        tecMeditacionRepository.deleteById(id);
    }

    @Override
    public List<TecnicaMeditacion> listarTecMeditacion() {
        return tecMeditacionRepository.findAll();
    }

    @Override
    public List<String[]> tecnicaMeditacionPorTipoTerapia() {
        return tecMeditacionRepository.tecnicaMeditacionPorTipoTerapia();
    }

    @Override
    public List<String[]> cantidadTecnicasMeditacionPorTipoTerapia() {
        return tecMeditacionRepository.cantidadTecnicasMeditacionPorTipoTerapia();
    }
}
