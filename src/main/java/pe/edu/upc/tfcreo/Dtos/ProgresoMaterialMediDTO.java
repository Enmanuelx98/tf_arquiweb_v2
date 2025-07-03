package pe.edu.upc.tfcreo.Dtos;

import pe.edu.upc.tfcreo.Entity.MaterialMeditacion;
import pe.edu.upc.tfcreo.Entity.SesionTerapia;

import java.time.LocalDate;

public class ProgresoMaterialMediDTO {
    private int idProgresoMaterialMedi;
    private LocalDate fechacompletado;
    private Boolean completado;
    private SesionTerapia sesionTerapia;
    private MaterialMeditacion materialMeditacion;

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
