package pe.edu.upc.tfcreo.Entity;

import jakarta.persistence.*;



@Entity
@Table(name = "Musicacategoria")
public class MusicaCategoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMusicaCategoria;

    @Column(name = "nombreCategoria", nullable = false, length = 50)
    private String nombreCategoria;

    public MusicaCategoria() {}

    public MusicaCategoria(int idMusicaCategoria, String nombreCategoria) {
        this.idMusicaCategoria = idMusicaCategoria;
        this.nombreCategoria = nombreCategoria;
    }

    public int getIdMusicaCategoria() {
        return idMusicaCategoria;
    }

    public void setIdMusicaCategoria(int idMusicaCategoria) {
        this.idMusicaCategoria = idMusicaCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
}
