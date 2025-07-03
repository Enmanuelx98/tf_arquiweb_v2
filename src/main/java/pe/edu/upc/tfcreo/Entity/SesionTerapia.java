package pe.edu.upc.tfcreo.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Sesionterapia")
public class SesionTerapia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSesion;

    @Column(name = "fechaInicio", nullable = false)
    private LocalDate fechaInicio;

    @Column(name = "fechaFin")
    private LocalDate fechaFin;

    @Column(name = "completado", nullable = false)
    private Boolean completado;

    @ManyToOne
    @JoinColumn(name = "idusuario")
    private Users users;
    @ManyToOne
    @JoinColumn(name = "idterapia")
    private Terapia terapia;

    public SesionTerapia() {}

    public SesionTerapia(Boolean completado, LocalDate fechaFin, LocalDate fechaInicio, int idSesion, Terapia terapia, Users users) {
        this.completado = completado;
        this.fechaFin = fechaFin;
        this.fechaInicio = fechaInicio;
        this.idSesion = idSesion;
        this.terapia = terapia;
        this.users = users;
    }

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
