    package pe.edu.upc.tfcreo.Repository;
    
    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.data.jpa.repository.Query;
    import org.springframework.stereotype.Repository;
    import pe.edu.upc.tfcreo.Entity.TecnicaMeditacion;
    
    import java.util.List;
    
    @Repository
    public interface TecMeditacionRepository extends JpaRepository<TecnicaMeditacion, Integer> {
    
        @Query(value = "SELECT tm.nombre_tecnica_meditacion, t.tipo_terapia\n" +
                "FROM TecnicaMeditacion tm\n" +
                "JOIN Terapia t ON tm.idterapia = t.id_terapia\n" +
                "ORDER BY t.tipo_terapia, tm.nombre_tecnica_meditacion;", nativeQuery = true)
        public List<String[]> tecnicaMeditacionPorTipoTerapia();
    
        @Query (value = "SELECT t.tipo_terapia, COUNT(tm.id_tecnica_meditacion) AS cantidad_tecnicas\n" +
                "FROM Terapia t\n" +
                "LEFT JOIN TecnicaMeditacion tm ON t.id_terapia = tm.idterapia\n" +
                "GROUP BY t.tipo_terapia\n" +
                "ORDER BY cantidad_tecnicas DESC;", nativeQuery = true)
        public List<String[]> cantidadTecnicasMeditacionPorTipoTerapia();
    }
