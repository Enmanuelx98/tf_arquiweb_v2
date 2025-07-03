package pe.edu.upc.tfcreo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfcreo.Entity.BilleteraElectronica;
@Repository
public interface BilleteraElecRepository extends JpaRepository<BilleteraElectronica, Integer> {
}
