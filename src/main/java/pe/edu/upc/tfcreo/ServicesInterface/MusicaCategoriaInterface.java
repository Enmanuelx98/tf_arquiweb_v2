package pe.edu.upc.tfcreo.ServicesInterface;

import pe.edu.upc.tfcreo.Entity.MusicaCategoria;
import java.util.List;

public interface MusicaCategoriaInterface {
    public void insertarMusicaCategoria(MusicaCategoria musicacategoria);
    public void updateMusicaCategoria(MusicaCategoria musicacategoria);
    public void eliminarMusicaCategoria(int id);
    public List<MusicaCategoria> listarMusicaCategoria();
    public List<MusicaCategoria> ListarCategoriaOrdenadas();

}
