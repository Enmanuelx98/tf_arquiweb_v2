package pe.edu.upc.tfcreo.Dtos;


import pe.edu.upc.tfcreo.Entity.Pagos;


public class TarjetaDTO {
    private int idTarjeta;
    private String nombreTitularTarjeta;
    private String numeroTarjeta;
    private String cvvTarjeta;
    private String fechacaducidadTarjeta;
    private Pagos pagos;

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
