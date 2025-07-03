package pe.edu.upc.tfcreo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Tarjeta")
public class Tarjeta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTarjeta;

    @Column(name = "nombreTitularTarjeta", nullable = false, length = 50)
    private String nombreTitularTarjeta;

    @Column(name = "numeroTarjeta", nullable = false, length = 50)
    private String numeroTarjeta;

    @Column(name = "cvvTarjeta", nullable = false, length = 50)
    private String cvvTarjeta;

    @Column(name = "fechacaducidadTarjeta", nullable = false, length = 50)
    private String fechacaducidadTarjeta;

    @ManyToOne
    @JoinColumn(name = "idpagos")
    private Pagos pagos;

    public Tarjeta() {}

    public Tarjeta(String cvvTarjeta, String fechacaducidadTarjeta, int idTarjeta, String nombreTitularTarjeta, String numeroTarjeta, Pagos pagos) {
        this.cvvTarjeta = cvvTarjeta;
        this.fechacaducidadTarjeta = fechacaducidadTarjeta;
        this.idTarjeta = idTarjeta;
        this.nombreTitularTarjeta = nombreTitularTarjeta;
        this.numeroTarjeta = numeroTarjeta;
        this.pagos = pagos;
    }

    public String getCvvTarjeta() {
        return cvvTarjeta;
    }

    public void setCvvTarjeta(String cvvTarjeta) {
        this.cvvTarjeta = cvvTarjeta;
    }

    public String getFechacaducidadTarjeta() {
        return fechacaducidadTarjeta;
    }

    public void setFechacaducidadTarjeta(String fechacaducidadTarjeta) {
        this.fechacaducidadTarjeta = fechacaducidadTarjeta;
    }

    public int getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public String getNombreTitularTarjeta() {
        return nombreTitularTarjeta;
    }

    public void setNombreTitularTarjeta(String nombreTitularTarjeta) {
        this.nombreTitularTarjeta = nombreTitularTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public Pagos getPagos() {
        return pagos;
    }

    public void setPagos(Pagos pagos) {
        this.pagos = pagos;
    }
}
