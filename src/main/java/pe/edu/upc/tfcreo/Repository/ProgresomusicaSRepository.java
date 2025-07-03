package pe.edu.upc.tfcreo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfcreo.Entity.ProgresomusicaS;

import java.util.List;

@Repository
public interface ProgresomusicaSRepository extends JpaRepository<ProgresomusicaS, Integer> {
    //Cantidad de videos que estan completados de una sesion
    @Query(value = "select * from ProgresomusicaS p where p.idsesion_Terapia = :idSesion and completado = true", nativeQuery = true)
    public List<ProgresomusicaS> quantityMusicaCompletoBySesion(@Param("idSesion") int idSesion);

    //Cantidad de videos por sesion
    @Query(value = "select * from ProgresomusicaS p where p.idsesion_Terapia = :idSesion", nativeQuery = true)
    public List<ProgresomusicaS> countMusicaBySesion(@Param("idSesion") int idSesion);

}
