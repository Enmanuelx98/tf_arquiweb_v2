package pe.edu.upc.tfcreo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfcreo.Entity.MaterialMeditacion;

import java.util.List;

@Repository
public interface MateMeditacionRepository extends JpaRepository<MaterialMeditacion, Integer> {

   @Query("SELECT m FROM MaterialMeditacion m WHERE m.nombreMaterialMeditacion LIKE %:nombre%")
   public List<MaterialMeditacion> buscarmaterialnombre(@Param("nombre") String nombre);

}
