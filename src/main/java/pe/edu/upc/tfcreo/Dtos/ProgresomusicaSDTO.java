package pe.edu.upc.tfcreo.Dtos;

import pe.edu.upc.tfcreo.Entity.MusicaRelajacion;
import pe.edu.upc.tfcreo.Entity.SesionTerapia;

import java.time.LocalDate;

public class ProgresomusicaSDTO {
    private int idProgresomusicaS;
    private LocalDate fechacompletado;
    private Boolean completado;
    private SesionTerapia sesionTerapia;
    private MusicaRelajacion musicaRelajacion;

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

    public int getIdProgresomusicaS() {
        return idProgresomusicaS;
    }

    public void setIdProgresomusicaS(int idProgresomusicaS) {
        this.idProgresomusicaS = idProgresomusicaS;
    }

    public MusicaRelajacion getMusicaRelajacion() {
        return musicaRelajacion;
    }

    public void setMusicaRelajacion(MusicaRelajacion musicaRelajacion) {
        this.musicaRelajacion = musicaRelajacion;
    }

    public SesionTerapia getSesionTerapia() {
        return sesionTerapia;
    }

    public void setSesionTerapia(SesionTerapia sesionTerapia) {
        this.sesionTerapia = sesionTerapia;
    }
}
