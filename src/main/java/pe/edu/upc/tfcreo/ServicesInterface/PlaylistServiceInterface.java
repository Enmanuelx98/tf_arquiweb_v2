package pe.edu.upc.tfcreo.ServicesInterface;

import pe.edu.upc.tfcreo.Entity.Playlist;

import java.util.List;

public interface PlaylistServiceInterface {
    public void insertarPlaylist(Playlist playlist);
    public void updatePlaylist(Playlist playlist);
    public void eliminarPlaylist(int id);
    public List<Playlist> listarPlaylist();
}
