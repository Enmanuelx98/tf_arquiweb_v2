package pe.edu.upc.tfcreo.ServicesImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.Entity.ProgresoMaterialMedi;
import pe.edu.upc.tfcreo.Repository.ProgresoMaterialMediRepository;
import pe.edu.upc.tfcreo.ServicesInterface.ProgresoMaterialMediInterface;

import java.util.List;
@Service
public class ProgresoMaterialMediImple implements ProgresoMaterialMediInterface {
    @Autowired
    private ProgresoMaterialMediRepository progresoMaterialMediRepository;
    @Override
    public void insertarProgresoMaterialMedi(ProgresoMaterialMedi progresomaterialmedi) {
        progresoMaterialMediRepository.save(progresomaterialmedi);
    }

    @Override
    public void updateProgresoMaterialMedi(ProgresoMaterialMedi progresomaterialmedi) {
        progresoMaterialMediRepository.save(progresomaterialmedi);

    }

    @Override
    public void eliminarProgresoMaterialMedi(int id) {
        progresoMaterialMediRepository.deleteById(id);
    }

    @Override
    public List<ProgresoMaterialMedi> listarProgresoMaterialMedi() {
        return progresoMaterialMediRepository.findAll();
    }
    @Override
    public double calcularPorcentajeProgreso(int idSesion) {
        List<ProgresoMaterialMedi> totalVideos = progresoMaterialMediRepository.countMaterialBySesion(idSesion);
        List<ProgresoMaterialMedi> videosCompletados = progresoMaterialMediRepository.quantityMaterialCompletadosBySesion(idSesion);

        if (totalVideos.isEmpty()) { //si es true es porque no tiene elementos osea 0
            return 0.0;
        }
        return (videosCompletados.size() * 100.0) / totalVideos.size();
    }

    @Override
    public List<ProgresoMaterialMedi> quantityMaterialCompletadosBySesion(int idSesion) {
        return progresoMaterialMediRepository.quantityMaterialCompletadosBySesion(idSesion);
    }
}
