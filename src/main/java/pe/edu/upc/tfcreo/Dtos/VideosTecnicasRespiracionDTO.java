package pe.edu.upc.tfcreo.Dtos;

import pe.edu.upc.tfcreo.Entity.Terapia;

public class VideosTecnicasRespiracionDTO {
    private int idVideosTecnicasRespiracion;
    private String nombreRespiracion;
    private String descripcionRespiracion;
    private String linkRespiracion;
    private Terapia terapia;

    public String getDescripcionRespiracion() {
        return descripcionRespiracion;
    }

    public void setDescripcionRespiracion(String descripcionRespiracion) {
        this.descripcionRespiracion = descripcionRespiracion;
    }

    public int getIdVideosTecnicasRespiracion() {
        return idVideosTecnicasRespiracion;
    }

    public void setIdVideosTecnicasRespiracion(int idVideosTecnicasRespiracion) {
        this.idVideosTecnicasRespiracion = idVideosTecnicasRespiracion;
    }

    public String getLinkRespiracion() {
        return linkRespiracion;
    }

    public void setLinkRespiracion(String linkRespiracion) {
        this.linkRespiracion = linkRespiracion;
    }

    public String getNombreRespiracion() {
        return nombreRespiracion;
    }

    public void setNombreRespiracion(String nombreRespiracion) {
        this.nombreRespiracion = nombreRespiracion;
    }

    public Terapia getTerapia() {
        return terapia;
    }

    public void setTerapia(Terapia terapia) {
        this.terapia = terapia;
    }
}
