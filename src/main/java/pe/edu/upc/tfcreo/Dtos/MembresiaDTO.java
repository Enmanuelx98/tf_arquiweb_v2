package pe.edu.upc.tfcreo.Dtos;


import pe.edu.upc.tfcreo.Entity.Users;

import java.time.LocalDate;


public class MembresiaDTO {
    private int idMembresia;
    private LocalDate fechainicioMembresia;
    private LocalDate fechafinalMembresia;
    private Boolean estadoMembresia;
    private Users users;

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
