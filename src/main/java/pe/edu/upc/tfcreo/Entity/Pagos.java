package pe.edu.upc.tfcreo.Entity;

import jakarta.persistence.*;


import java.time.LocalDate;


@Entity
@Table(name = "Pagos")
public class Pagos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPagos;

    @Column(name = "tipoPago", nullable = false, length = 50)
    private String tipoPago;

    @Column(name = "fechaPago", nullable = false)
    private LocalDate fechaPago;

    @ManyToOne
    @JoinColumn(name = "idusuario")
    private Users users;

    public Pagos() {}

    public Pagos(LocalDate fechaPago, int idPagos, String tipoPago, Users users) {
        this.fechaPago = fechaPago;
        this.idPagos = idPagos;
        this.tipoPago = tipoPago;
        this.users = users;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public int getIdPagos() {
        return idPagos;
    }

    public void setIdPagos(int idPagos) {
        this.idPagos = idPagos;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public Users getUsuario() {
        return users;
    }

    public void setUsuario(Users users) {
        this.users = users;
    }
}
