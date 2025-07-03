package pe.edu.upc.tfcreo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Videostecnicasrespiracion")
public class VideosTecnicasRespiracion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVideosTecnicasRespiracion;

    @Column(name = "nombreRespiracion", nullable = false, length = 50)
    private String nombreRespiracion;

    @Column(name = "descripcionRespiracion", nullable = false, length = 200)
    private String descripcionRespiracion;

    @Column(name = "linkRespiracion", nullable = false, length = 200)
    private String linkRespiracion;

    @ManyToOne
    @JoinColumn(name = "idterapia")
    private Terapia terapia;

    public VideosTecnicasRespiracion() {}

    public VideosTecnicasRespiracion(String descripcionRespiracion, int idVideosTecnicasRespiracion, String linkRespiracion, String nombreRespiracion, Terapia terapia) {
        this.descripcionRespiracion = descripcionRespiracion;
        this.idVideosTecnicasRespiracion = idVideosTecnicasRespiracion;
        this.linkRespiracion = linkRespiracion;
        this.nombreRespiracion = nombreRespiracion;
        this.terapia = terapia;
    }

    public String getDescripcionRespiracion() {
        return descripcionRespiracion;
    }

    public void setDescripcionRespiracion(String descripcionRespiracion) {
        this.descripcionRespiracion = descripcionRespiracion;
    }

    public int getIdVideosTecnicasRespiracion() {
        return idVideosTecnicasRespiracion;
    }

    public void setIdVideosTecnicasRespiracion(int idVideosTecnicasRespiracion) {
        this.idVideosTecnicasRespiracion = idVideosTecnicasRespiracion;
    }

    public String getLinkRespiracion() {
        return linkRespiracion;
    }

    public void setLinkRespiracion(String linkRespiracion) {
        this.linkRespiracion = linkRespiracion;
    }

    public String getNombreRespiracion() {
        return nombreRespiracion;
    }

    public void setNombreRespiracion(String nombreRespiracion) {
        this.nombreRespiracion = nombreRespiracion;
    }

    public Terapia getTerapia() {
        return terapia;
    }

    public void setTerapia(Terapia terapia) {
        this.terapia = terapia;
    }
}
