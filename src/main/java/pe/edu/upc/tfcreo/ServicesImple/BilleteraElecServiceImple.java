package pe.edu.upc.tfcreo.ServicesImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.Entity.BilleteraElectronica;
import pe.edu.upc.tfcreo.Repository.BilleteraElecRepository;
import pe.edu.upc.tfcreo.ServicesInterface.BilleteraElecServiceInterface;

import java.util.List;
@Service
public class BilleteraElecServiceImple implements BilleteraElecServiceInterface {
    @Autowired
    private BilleteraElecRepository BilleteraElecRepository;
    @Override
    public void insertarBilleteraElec(BilleteraElectronica billeteraelectronica) {
        BilleteraElecRepository.save(billeteraelectronica);
    }

    @Override
    public void updateBilleteraElec(BilleteraElectronica billeteraelectronica) {
        BilleteraElecRepository.save(billeteraelectronica);

    }

    @Override
    public void eliminarBilleteraElec(int id) {
        BilleteraElecRepository.deleteById(id);
    }

    @Override
    public List<BilleteraElectronica> listarBilleteraElec() {
        return BilleteraElecRepository.findAll();
    }
}
