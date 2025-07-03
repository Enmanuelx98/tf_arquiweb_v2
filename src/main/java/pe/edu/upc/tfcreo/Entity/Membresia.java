package pe.edu.upc.tfcreo.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Membresia")
public class Membresia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMembresia;

    @Column(name = "fechainicioMembresia", nullable = false)
    private LocalDate fechainicioMembresia;

    @Column(name = "fechafinalMembresia")
    private LocalDate fechafinalMembresia;

    @Column(name = "estadoMembresia", nullable = false)
    private Boolean estadoMembresia;

    @ManyToOne
    @JoinColumn(name = "idusuario")
    private Users users;

    public Membresia() {}

    public Membresia(Boolean estadoMembresia, LocalDate fechafinalMembresia, LocalDate fechainicioMembresia, int idMembresia, Users users) {
        this.estadoMembresia = estadoMembresia;
        this.fechafinalMembresia = fechafinalMembresia;
        this.fechainicioMembresia = fechainicioMembresia;
        this.idMembresia = idMembresia;
        this.users = users;
    }

    public Boolean getEstadoMembresia() {
        return estadoMembresia;
    }

    public void setEstadoMembresia(Boolean estadoMembresia) {
        this.estadoMembresia = estadoMembresia;
    }

    public LocalDate getFechafinalMembresia() {
        return fechafinalMembresia;
    }

    public void setFechafinalMembresia(LocalDate fechafinalMembresia) {
        this.fechafinalMembresia = fechafinalMembresia;
    }

    public LocalDate getFechainicioMembresia() {
        return fechainicioMembresia;
    }

    public void setFechainicioMembresia(LocalDate fechainicioMembresia) {
        this.fechainicioMembresia = fechainicioMembresia;
    }

    public int getIdMembresia() {
        return idMembresia;
    }

    public void setIdMembresia(int idMembresia) {
        this.idMembresia = idMembresia;
    }

    public Users getUsuario() {
        return users;
    }

    public void setUsuario(Users users) {
        this.users = users;
    }
}
