package pe.edu.upc.tfcreo.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Progresomusicas")
public class ProgresomusicaS {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProgresomusicaS;

    @Column(name = "fechacompletado")
    private LocalDate fechacompletado;

    @Column(name = "completado", nullable = false)
    private Boolean completado;

    @ManyToOne
    @JoinColumn(name = "idsesionTerapia")
    private SesionTerapia sesionTerapia;
    @ManyToOne
    @JoinColumn(name = "idmusicaRelajacion")
    private MusicaRelajacion musicaRelajacion;

    public ProgresomusicaS() {}

    public ProgresomusicaS(Boolean completado, LocalDate fechacompletado, int idProgresomusicaS, MusicaRelajacion musicaRelajacion, SesionTerapia sesionTerapia) {
        this.completado = completado;
        this.fechacompletado = fechacompletado;
        this.idProgresomusicaS = idProgresomusicaS;
        this.musicaRelajacion = musicaRelajacion;
        this.sesionTerapia = sesionTerapia;
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
