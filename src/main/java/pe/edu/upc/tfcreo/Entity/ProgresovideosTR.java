package pe.edu.upc.tfcreo.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "ProgresovideosTR")
public class ProgresovideosTR {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProgresovideosTR;

    @Column(name = "fechacompletado")
    private LocalDate fechacompletado;

    @Column(name = "completado", nullable = false)
    private Boolean completado;

    @ManyToOne
    @JoinColumn(name = "idsesionTerapia")
    private SesionTerapia sesionTerapia;
    @ManyToOne
    @JoinColumn(name = "idvideosTecnicasRespiracion")
    private VideosTecnicasRespiracion videosTecnicasRespiracion;

    public ProgresovideosTR() {}

    public ProgresovideosTR(Boolean completado, LocalDate fechacompletado, int idProgresovideosTR, SesionTerapia sesionTerapia, VideosTecnicasRespiracion videosTecnicasRespiracion) {
        this.completado = completado;
        this.fechacompletado = fechacompletado;
        this.idProgresovideosTR = idProgresovideosTR;
        this.sesionTerapia = sesionTerapia;
        this.videosTecnicasRespiracion = videosTecnicasRespiracion;
    }

    public Boolean getCompletado() {
        return completado;
    }

    public void setCompletado(Boolean completado) {
        this.completado = completado;
    }

    public LocalDate getFechacompletado() {
        return fechacompletado;
    }

    public void setFechacompletado(LocalDate fechacompletado) {
        this.fechacompletado = fechacompletado;
    }

    public int getIdProgresovideosTR() {
        return idProgresovideosTR;
    }

    public void setIdProgresovideosTR(int idProgresovideosTR) {
        this.idProgresovideosTR = idProgresovideosTR;
    }

    public SesionTerapia getSesionTerapia() {
        return sesionTerapia;
    }

    public void setSesionTerapia(SesionTerapia sesionTerapia) {
        this.sesionTerapia = sesionTerapia;
    }

    public VideosTecnicasRespiracion getVideosTecnicasRespiracion() {
        return videosTecnicasRespiracion;
    }

    public void setVideosTecnicasRespiracion(VideosTecnicasRespiracion videosTecnicasRespiracion) {
        this.videosTecnicasRespiracion = videosTecnicasRespiracion;
    }
}
