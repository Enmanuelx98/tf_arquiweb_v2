package pe.edu.upc.tfcreo.ServicesImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.Entity.MusicaCategoria;
import pe.edu.upc.tfcreo.Repository.MusicaCategoriaRepository;
import pe.edu.upc.tfcreo.ServicesInterface.MusicaCategoriaInterface;

import java.util.List;
@Service
public class MusicaCategoriaImple implements MusicaCategoriaInterface {
    @Autowired
    private MusicaCategoriaRepository musicaCategoriaRepository;
    @Override
    public void insertarMusicaCategoria(MusicaCategoria musicacategoria) {
        musicaCategoriaRepository.save(musicacategoria);
    }

    @Override
    public void updateMusicaCategoria(MusicaCategoria musicacategoria) {
        musicaCategoriaRepository.save(musicacategoria);

    }

    @Override
    public void eliminarMusicaCategoria(int id) {
        musicaCategoriaRepository.deleteById(id);
    }

    @Override
    public List<MusicaCategoria> listarMusicaCategoria() {
        return musicaCategoriaRepository.findAll();
    }
      @Override
    public List<MusicaCategoria> ListarCategoriaOrdenadas(){
        return  musicaCategoriaRepository.ListarCategoriaOrdenadas();
    }
}
