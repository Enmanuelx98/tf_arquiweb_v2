package pe.edu.upc.tfcreo.ServicesImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.Entity.Tarjeta;
import pe.edu.upc.tfcreo.Repository.TarjetaRepository;
import pe.edu.upc.tfcreo.ServicesInterface.TarjetaServiceInterface;

import java.util.List;
@Service
public class TarjetaServiceImple implements TarjetaServiceInterface {
    @Autowired
    private TarjetaRepository tarjetaRepository;
    @Override
    public void insertarTarjeta(Tarjeta tarjeta) {
        tarjetaRepository.save(tarjeta);
    }

    @Override
    public void updateTarjeta(Tarjeta tarjeta) {
        tarjetaRepository.save(tarjeta);
    }

    @Override
    public void eliminarTarjeta(int id) {
        tarjetaRepository.deleteById(id);
    }

    @Override
    public List<Tarjeta> listarTarjeta() {
        return tarjetaRepository.findAll();
    }
}
