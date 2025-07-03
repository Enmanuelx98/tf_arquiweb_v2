package pe.edu.upc.tfcreo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfcreo.Entity.MusicaCategoria;

import java.util.List;

@Repository
public interface MusicaCategoriaRepository extends JpaRepository<MusicaCategoria, Integer> {
  @Query("SELECT m FROM MusicaCategoria m ORDER BY m.nombreCategoria ASC")
  public List<MusicaCategoria> ListarCategoriaOrdenadas();

}
