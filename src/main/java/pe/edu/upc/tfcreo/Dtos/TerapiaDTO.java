package pe.edu.upc.tfcreo.Dtos;


public class TerapiaDTO {
    private int idTerapia;
    private String tipoTerapia;
    private String descripcionTerapia;

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
