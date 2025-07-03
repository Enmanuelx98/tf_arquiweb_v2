package pe.edu.upc.tfcreo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfcreo.Entity.SesionTerapia;

import java.util.List;

@Repository
public interface SesionTerapiaRepository extends JpaRepository<SesionTerapia, Integer> {
    //Cantidad de sesiones de un usuario
    @Query(value="select * \n" +
            "from SesionTerapia se\n" +
            "where se.idusuario = :u",nativeQuery=true)
    public List<SesionTerapia> quantitySesionesbyUsuario(@Param("u") int u);

    //Cantidad de sesiones que ha completado un usuario
    @Query(value="select * \n" +
            "from SesionTerapia se\n" +
            "where se.idusuario = :u2 and se.completado = true",nativeQuery=true)
    public List<SesionTerapia> quantitySesionesCompletobyUsuario(@Param("u2") int u2);

    //El usuario que mas sesiones ha recibido
    @Query(value="select u.id, u.username, count(s.id_Sesion) as total_sesiones\n" +
            "from users u\n" +
            "join Sesionterapia s on u.id = s.idusuario\n" +
            "group BY u.id, u.username\n" +
            "order by total_sesiones desc\n" +
            "limit 1;",nativeQuery=true)
    public List<String[]> usermoresesiones();

    //La tecnica de relajacion mas usada
    @Query(value="select t.id_Terapia, t.tipo_Terapia, count(s.id_Sesion) as total_sesiones\n" +
            "from Sesionterapia s\n" +
            "join Terapia t on s.idterapia = t.id_Terapia\n" +
            "group by t.id_Terapia, t.tipo_Terapia\n" +
            "order by total_sesiones desc\n" +
            " limit 1;",nativeQuery=true)
    public List<String[]> terapiamoresesesions();
}
