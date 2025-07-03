package pe.edu.upc.tfcreo.ServicesImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.Entity.Playlist;
import pe.edu.upc.tfcreo.Repository.PlaylistRepository;
import pe.edu.upc.tfcreo.ServicesInterface.PlaylistServiceInterface;

import java.util.List;
@Service
public class PlaylistServiceImple implements PlaylistServiceInterface {
    @Autowired
    private PlaylistRepository playlistRepository;
    @Override
    public void insertarPlaylist(Playlist playlist) {
        playlistRepository.save(playlist);
    }

    @Override
    public void updatePlaylist(Playlist playlist) {
        playlistRepository.save(playlist);

    }

    @Override
    public void eliminarPlaylist(int id) {
        playlistRepository.deleteById(id);

    }

    @Override
    public List<Playlist> listarPlaylist() {
        return playlistRepository.findAll();

    }
}
