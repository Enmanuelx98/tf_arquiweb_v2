package pe.edu.upc.tfcreo.Dtos;


import pe.edu.upc.tfcreo.Entity.Terapia;
import pe.edu.upc.tfcreo.Entity.Users;

import java.time.LocalDate;

public class SesionTerapiaDTO {
    private int idSesion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Boolean completado;
    private Users users;
    private Terapia terapia;

    public Boolean getCompletado() {
        return completado;
    }

    public void setCompletado(Boolean completado) {
        this.completado = completado;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getIdSesion() {
        return idSesion;
    }

    public void setIdSesion(int idSesion) {
        this.idSesion = idSesion;
    }

    public Terapia getTerapia() {
        return terapia;
    }

    public void setTerapia(Terapia terapia) {
        this.terapia = terapia;
    }

    public Users getUsuario() {
        return users;
    }

    public void setUsuario(Users users) {
        this.users = users;
    }
}
