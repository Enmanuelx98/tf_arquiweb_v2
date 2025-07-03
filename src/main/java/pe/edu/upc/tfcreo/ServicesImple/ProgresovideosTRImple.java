package pe.edu.upc.tfcreo.ServicesImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.Entity.ProgresovideosTR;
import pe.edu.upc.tfcreo.Entity.VideosTecnicasRespiracion;
import pe.edu.upc.tfcreo.Repository.ProgresovideosTRRepository;
import pe.edu.upc.tfcreo.ServicesInterface.ProgresovideosTRInterface;

import java.util.List;

@Service
public class ProgresovideosTRImple implements ProgresovideosTRInterface {
    @Autowired
    private ProgresovideosTRRepository progresovideosTRRepository;
    @Override
    public void insertarProgresoVideosTR(ProgresovideosTR progresovideosTR) {
        progresovideosTRRepository.save(progresovideosTR);
    }

    @Override
    public void updateProgresoVideosTR(ProgresovideosTR progresovideosTR) {
        progresovideosTRRepository.save(progresovideosTR);

    }

    @Override
    public void eliminarProgresoVideosTR(int id) {
        progresovideosTRRepository.deleteById(id);
    }

    @Override
    public List<ProgresovideosTR> listarProgresoVideosTR() {
        return progresovideosTRRepository.findAll();
    }
    @Override
    public double calcularPorcentajeProgreso(int idSesion) {

        List<ProgresovideosTR> totalVideos = progresovideosTRRepository.countVideosBySesion(idSesion);
        List<ProgresovideosTR> videosCompletados = progresovideosTRRepository.quantityVideosCompletadosBySesion(idSesion);

        if (totalVideos.isEmpty()) { //si es true es porque no tiene elementos osea 0
            return 0.0;
        }
        return (videosCompletados.size() * 100.0) / totalVideos.size();
    }

    @Override
    public List<ProgresovideosTR> quantityVideosCompletadosBySesion(int idSesion) {
        return progresovideosTRRepository.quantityVideosCompletadosBySesion(idSesion);
    }
}
