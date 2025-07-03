package pe.edu.upc.tfcreo.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "ProgresoMaterialMedi")
public class ProgresoMaterialMedi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProgresoMaterialMedi;

    @Column(name = "fechacompletado")
    private LocalDate fechacompletado;

    @Column(name = "completado", nullable = false)
    private Boolean completado;

    @ManyToOne
    @JoinColumn(name = "idsesionTerapia")
    private SesionTerapia sesionTerapia;

    @ManyToOne
    @JoinColumn(name = "idmaterialMeditacion")
    private MaterialMeditacion materialMeditacion;

    public ProgresoMaterialMedi() {}

    public ProgresoMaterialMedi(Boolean completado, LocalDate fechacompletado, int idProgresoMaterialMedi, MaterialMeditacion materialMeditacion, SesionTerapia sesionTerapia) {
        this.completado = completado;
        this.fechacompletado = fechacompletado;
        this.idProgresoMaterialMedi = idProgresoMaterialMedi;
        this.materialMeditacion = materialMeditacion;
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

    public int getIdProgresoMaterialMedi() {
        return idProgresoMaterialMedi;
    }

    public void setIdProgresoMaterialMedi(int idProgresoMaterialMedi) {
        this.idProgresoMaterialMedi = idProgresoMaterialMedi;
    }

    public MaterialMeditacion getMaterialMeditacion() {
        return materialMeditacion;
    }

    public void setMaterialMeditacion(MaterialMeditacion materialMeditacion) {
        this.materialMeditacion = materialMeditacion;
    }

    public SesionTerapia getSesionTerapia() {
        return sesionTerapia;
    }

    public void setSesionTerapia(SesionTerapia sesionTerapia) {
        this.sesionTerapia = sesionTerapia;
    }
}
