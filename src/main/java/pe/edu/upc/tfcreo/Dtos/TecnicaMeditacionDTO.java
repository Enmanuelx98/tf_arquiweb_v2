package pe.edu.upc.tfcreo.Dtos;


import pe.edu.upc.tfcreo.Entity.Terapia;


public class TecnicaMeditacionDTO {
    private int idTecnicaMeditacion;
    private String nombreTecnicaMeditacion;
    private String descripcionTecnicaMeditacion;
    private Terapia terapia;

    public String getDescripcionTecnicaMeditacion() {
        return descripcionTecnicaMeditacion;
    }

    public void setDescripcionTecnicaMeditacion(String descripcionTecnicaMeditacion) {
        this.descripcionTecnicaMeditacion = descripcionTecnicaMeditacion;
    }

    public int getIdTecnicaMeditacion() {
        return idTecnicaMeditacion;
    }

    public void setIdTecnicaMeditacion(int idTecnicaMeditacion) {
        this.idTecnicaMeditacion = idTecnicaMeditacion;
    }

    public String getNombreTecnicaMeditacion() {
        return nombreTecnicaMeditacion;
    }

    public void setNombreTecnicaMeditacion(String nombreTecnicaMeditacion) {
        this.nombreTecnicaMeditacion = nombreTecnicaMeditacion;
    }

    public Terapia getTerapia() {
        return terapia;
    }

    public void setTerapia(Terapia terapia) {
        this.terapia = terapia;
    }
}
