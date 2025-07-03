package pe.edu.upc.tfcreo.Dtos;


import pe.edu.upc.tfcreo.Entity.TecnicaMeditacion;
import pe.edu.upc.tfcreo.Entity.TipoMaterial;


public class MaterialMeditacionDTO {
    private int idMaterialMeditacion;
    private String nombreMaterialMeditacion;
    private String urlMaterialMeditacion;
    private String descripcionMaterialMeditacion;
    private TecnicaMeditacion tecnicaMeditacion;
    private TipoMaterial tipoMaterial;

    public String getDescripcionMaterialMeditacion() {
        return descripcionMaterialMeditacion;
    }

    public void setDescripcionMaterialMeditacion(String descripcionMaterialMeditacion) {
        this.descripcionMaterialMeditacion = descripcionMaterialMeditacion;
    }

    public int getIdMaterialMeditacion() {
        return idMaterialMeditacion;
    }

    public void setIdMaterialMeditacion(int idMaterialMeditacion) {
        this.idMaterialMeditacion = idMaterialMeditacion;
    }

    public String getNombreMaterialMeditacion() {
        return nombreMaterialMeditacion;
    }

    public void setNombreMaterialMeditacion(String nombreMaterialMeditacion) {
        this.nombreMaterialMeditacion = nombreMaterialMeditacion;
    }

    public TecnicaMeditacion getTecnicaMeditacion() {
        return tecnicaMeditacion;
    }

    public void setTecnicaMeditacion(TecnicaMeditacion tecnicaMeditacion) {
        this.tecnicaMeditacion = tecnicaMeditacion;
    }

    public TipoMaterial getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(TipoMaterial tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public String getUrlMaterialMeditacion() {
        return urlMaterialMeditacion;
    }

    public void setUrlMaterialMeditacion(String urlMaterialMeditacion) {
        this.urlMaterialMeditacion = urlMaterialMeditacion;
    }
}

