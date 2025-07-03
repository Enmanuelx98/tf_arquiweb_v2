package pe.edu.upc.tfcreo.ServicesImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.Entity.ProgresomusicaS;
import pe.edu.upc.tfcreo.Entity.ProgresovideosTR;
import pe.edu.upc.tfcreo.Repository.ProgresomusicaSRepository;
import pe.edu.upc.tfcreo.ServicesInterface.ProgresomusicaSInterface;

import java.util.List;
@Service
public class ProgresomusicaSImple implements ProgresomusicaSInterface {
    @Autowired
    private ProgresomusicaSRepository progresomusicaSRepository;
    @Override
    public void insertarProgresoMusica(ProgresomusicaS progresomusica) {
        progresomusicaSRepository.save(progresomusica);
    }

    @Override
    public void updateProgresoMusica(ProgresomusicaS progresomusica) {
        progresomusicaSRepository.save(progresomusica);
    }

    @Override
    public void eliminarProgresoMusica(int id) {
        progresomusicaSRepository.deleteById(id);
    }

    @Override
    public List<ProgresomusicaS> listarProgresoMusica() {
        return progresomusicaSRepository.findAll();
    }

    @Override
    public double calcularPorcentajeProgreso(int idSesion) {
        List<ProgresomusicaS> totalVideos = progresomusicaSRepository.countMusicaBySesion(idSesion);
        List<ProgresomusicaS> videosCompletados = progresomusicaSRepository.quantityMusicaCompletoBySesion(idSesion);

        if (totalVideos.isEmpty()) { //si es true es porque no tiene elementos osea 0
            return 0.0;
        }
        return (videosCompletados.size() * 100.0) / totalVideos.size();
    }

    @Override
    public List<ProgresomusicaS> quantityMusicaCompletoBySesion(int idSesion) {
        return progresomusicaSRepository.quantityMusicaCompletoBySesion(idSesion);
    }
}
