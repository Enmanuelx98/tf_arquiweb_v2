package pe.edu.upc.tfcreo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfcreo.Entity.Terapia;
@Repository
public interface TerapiaRepository extends JpaRepository<Terapia, Integer> {
}
