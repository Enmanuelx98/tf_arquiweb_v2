package pe.edu.upc.tfcreo.Entity;

import jakarta.persistence.*;


@Entity
@Table(name = "Terapia")
public class Terapia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTerapia;

    @Column(name = "tipoTerapia", nullable = false, length = 50)
    private String tipoTerapia;

    @Column(name = "descripcionTerapia", nullable = false, length = 200)
    private String descripcionTerapia;

    public Terapia() {}

    public Terapia(String descripcionTerapia, int idTerapia, String tipoTerapia) {
        this.descripcionTerapia = descripcionTerapia;
        this.idTerapia = idTerapia;
        this.tipoTerapia = tipoTerapia;
    }

    public String getDescripcionTerapia() {
        return descripcionTerapia;
    }

    public void setDescripcionTerapia(String descripcionTerapia) {
        this.descripcionTerapia = descripcionTerapia;
    }

    public int getIdTerapia() {
        return idTerapia;
    }

    public void setIdTerapia(int idTerapia) {
        this.idTerapia = idTerapia;
    }

    public String getTipoTerapia() {
        return tipoTerapia;
    }

    public void setTipoTerapia(String tipoTerapia) {
        this.tipoTerapia = tipoTerapia;
    }

}
