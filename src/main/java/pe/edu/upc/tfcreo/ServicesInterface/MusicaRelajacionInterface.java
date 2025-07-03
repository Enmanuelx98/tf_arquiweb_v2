package pe.edu.upc.tfcreo.ServicesInterface;

import pe.edu.upc.tfcreo.Dtos.CategoriaMasUsadaDTO;
import pe.edu.upc.tfcreo.Entity.MusicaRelajacion;
import java.util.List;

public interface MusicaRelajacionInterface {
    public void insertarMusicaRelax(MusicaRelajacion musicarelajacion);
    public void updateMusicaRelax(MusicaRelajacion musicarelajacion);
    public void eliminarMusicaRelax(int id);
    public List<MusicaRelajacion> listarMusicaRelax();
    public List<CategoriaMasUsadaDTO> obtenerTop5CategoriasMasUsadas();

}
