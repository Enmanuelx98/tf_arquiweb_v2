package pe.edu.upc.tfcreo.Dtos;

public class TecnicaMeditacionPorTipoTerapiaDTO {
    private String nombreTecnicaMeditacion;
    private String tipoTerapia;

    public String getNombreTecnicaMeditacion() {
        return nombreTecnicaMeditacion;
    }

    public void setNombreTecnicaMeditacion(String nombreTecnicaMeditacion) {
        this.nombreTecnicaMeditacion = nombreTecnicaMeditacion;
    }

    public String getTipoTerapia() {
        return tipoTerapia;
    }

    public void setTipoTerapia(String tipoTerapia) {
        this.tipoTerapia = tipoTerapia;
    }
}

