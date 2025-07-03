package pe.edu.upc.tfcreo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Playlist")
public class Playlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPlaylist;

    @Column(name = "nombrePlaylist", nullable = false, length = 50)
    private String nombrePlaylist;

    public Playlist() {}

    public Playlist(int idPlaylist, String nombrePlaylist) {
        this.idPlaylist = idPlaylist;
        this.nombrePlaylist = nombrePlaylist;
    }

    public int getIdPlaylist() {
        return idPlaylist;
    }

    public void setIdPlaylist(int idPlaylist) {
        this.idPlaylist = idPlaylist;
    }

    public String getNombrePlaylist() {
        return nombrePlaylist;
    }

    public void setNombrePlaylist(String nombrePlaylist) {
        this.nombrePlaylist = nombrePlaylist;
    }
}
