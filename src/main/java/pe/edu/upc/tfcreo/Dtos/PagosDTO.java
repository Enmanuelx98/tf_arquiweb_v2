package pe.edu.upc.tfcreo.Dtos;


import pe.edu.upc.tfcreo.Entity.Users;

import java.time.LocalDate;


public class PagosDTO {
    private int idPagos;
    private String tipoPago;
    private LocalDate fechaPago;
    private Users users;

    public Users getUsuario() {
        return users;
    }

    public void setUsuario(Users users) {
        this.users = users;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public int getIdPagos() {
        return idPagos;
    }

    public void setIdPagos(int idPagos) {
        this.idPagos = idPagos;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }
}
