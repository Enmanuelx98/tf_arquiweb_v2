package pe.edu.upc.tfcreo.Dtos;

public class CantidadTecnicaMeditacionPorTipoTerapiaDTO {
    private String tipoTerapia;
    private int cantidadTecnicaMeditacion;

    public String getTipoTerapia() {
        return tipoTerapia;
    }

    public void setTipoTerapia(String tipoTerapia) {
        this.tipoTerapia = tipoTerapia;
    }

    public int getCantidadTecnicaMeditacion() {
        return cantidadTecnicaMeditacion;
    }

    public void setCantidadTecnicaMeditacion(int cantidadTecnicaMeditacion) {
        this.cantidadTecnicaMeditacion = cantidadTecnicaMeditacion;
    }
}
