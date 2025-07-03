package pe.edu.upc.tfcreo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Tecnicameditacion")
public class TecnicaMeditacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTecnicaMeditacion;

    @Column(name = "nombreTecnicaMeditacion", nullable = false, length = 50)
    private String nombreTecnicaMeditacion; //de que trata la tecnica

    @Column(name = "descripcionTecnicaMeditacion", nullable = false, length = 200)
    private String descripcionTecnicaMeditacion;

    @ManyToOne
    @JoinColumn(name = "idterapia")
    private Terapia terapia;

    public TecnicaMeditacion() {}

    public TecnicaMeditacion(String descripcionTecnicaMeditacion, int idTecnicaMeditacion, String nombreTecnicaMeditacion, Terapia terapia) {
        this.descripcionTecnicaMeditacion = descripcionTecnicaMeditacion;
        this.idTecnicaMeditacion = idTecnicaMeditacion;
        this.nombreTecnicaMeditacion = nombreTecnicaMeditacion;
        this.terapia = terapia;
    }

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
