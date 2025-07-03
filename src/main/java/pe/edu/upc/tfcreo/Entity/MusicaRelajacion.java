package pe.edu.upc.tfcreo.Entity;

import jakarta.persistence.*;


@Entity
@Table(name = "Musicarelajacion")
public class MusicaRelajacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMusica;

    @Column(name = "nombreMusica", nullable = false, length = 50)
    private String nombreMusica;

    @Column(name = "linkMusica", nullable = false, length = 200)
    private String linkMusica;

    @Column(name = "descripcionMusica", nullable = false, length = 200)
    private String descripcionMusica;

    @ManyToOne
    @JoinColumn(name = "idterapia")
    private Terapia terapia;
    
    @ManyToOne
    @JoinColumn(name = "idplaylist")
    private Playlist playlist;

    @ManyToOne
    @JoinColumn(name = "idmusicaCategoria")
    private MusicaCategoria musicaCategoria;

    public MusicaRelajacion() {}

    public MusicaRelajacion(String descripcionMusica, int idMusica, String linkMusica, MusicaCategoria musicaCategoria, String nombreMusica, Terapia terapia, Playlist playlist) {
        this.descripcionMusica = descripcionMusica;
        this.idMusica = idMusica;
        this.linkMusica = linkMusica;
        this.musicaCategoria = musicaCategoria;
        this.nombreMusica = nombreMusica;
        this.terapia = terapia;
        this.playlist = playlist;
    }

    public String getDescripcionMusica() {
        return descripcionMusica;
    }

    public void setDescripcionMusica(String descripcionMusica) {
        this.descripcionMusica = descripcionMusica;
    }

    public int getIdMusica() {
        return idMusica;
    }

    public void setIdMusica(int idMusica) {
        this.idMusica = idMusica;
    }

    public String getLinkMusica() {
        return linkMusica;
    }

    public void setLinkMusica(String linkMusica) {
        this.linkMusica = linkMusica;
    }

    public MusicaCategoria getMusicaCategoria() {
        return musicaCategoria;
    }

    public void setMusicaCategoria(MusicaCategoria musicaCategoria) {
        this.musicaCategoria = musicaCategoria;
    }

    public String getNombreMusica() {
        return nombreMusica;
    }

    public void setNombreMusica(String nombreMusica) {
        this.nombreMusica = nombreMusica;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }

    public Terapia getTerapia() {
        return terapia;
    }

    public void setTerapia(Terapia terapia) {
        this.terapia = terapia;
    }
}
