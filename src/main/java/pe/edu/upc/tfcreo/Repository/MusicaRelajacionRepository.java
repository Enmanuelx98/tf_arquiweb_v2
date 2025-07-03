package pe.edu.upc.tfcreo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfcreo.Dtos.CategoriaMasUsadaDTO;
import pe.edu.upc.tfcreo.Entity.MusicaRelajacion;

import org.springframework.data.domain.Pageable;

import java.util.List;

@Repository
public interface MusicaRelajacionRepository extends JpaRepository<MusicaRelajacion, Integer> {

    @Query("SELECT new pe.edu.upc.tfcreo.Dtos.CategoriaMasUsadaDTO(c.nombreCategoria, COUNT(r)) " +
            "FROM MusicaRelajacion r " +
            "JOIN r.musicaCategoria c " +
            "WHERE r.playlist IS NOT NULL " +
            "GROUP BY c.nombreCategoria " +
            "ORDER BY COUNT(r) DESC")
    public List<CategoriaMasUsadaDTO> top5CategoriasMasUsadas(Pageable pageable);

}
