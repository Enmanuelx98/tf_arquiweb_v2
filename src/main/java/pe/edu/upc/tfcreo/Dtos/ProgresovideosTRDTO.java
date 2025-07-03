package pe.edu.upc.tfcreo.Dtos;

import pe.edu.upc.tfcreo.Entity.SesionTerapia;
import pe.edu.upc.tfcreo.Entity.VideosTecnicasRespiracion;

import java.time.LocalDate;

public class ProgresovideosTRDTO {
    private int idProgresovideosTR;
    private LocalDate fechacompletado;
    private Boolean completado;
    private SesionTerapia sesionTerapia;
    private VideosTecnicasRespiracion videosTecnicasRespiracion;

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
