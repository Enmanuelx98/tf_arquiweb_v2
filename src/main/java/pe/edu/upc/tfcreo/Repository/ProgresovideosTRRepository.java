package pe.edu.upc.tfcreo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfcreo.Entity.ProgresovideosTR;

import java.util.List;


@Repository
public interface ProgresovideosTRRepository extends JpaRepository<ProgresovideosTR, Integer> {
   //Cantidad de videos que estan completados de una sesion
    @Query(value = "select * from ProgresovideosTR p where p.idsesion_Terapia = :idSesion and completado = true", nativeQuery = true)
    public List<ProgresovideosTR> quantityVideosCompletadosBySesion(@Param("idSesion") int idSesion);

    //Cantidad de videos por sesion
    @Query(value = "select * from ProgresovideosTR p where p.idsesion_Terapia = :idSesion", nativeQuery = true)
    public List<ProgresovideosTR> countVideosBySesion(@Param("idSesion") int idSesion);

}
