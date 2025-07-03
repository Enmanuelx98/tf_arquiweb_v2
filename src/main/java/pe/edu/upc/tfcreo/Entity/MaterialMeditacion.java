package pe.edu.upc.tfcreo.Entity;

import jakarta.persistence.*;


@Entity
@Table(name = "Materialmeditacion")
public class MaterialMeditacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMaterialMeditacion;

    @Column(name = "nombreMaterialMeditacion", nullable = false, length = 200)
    private String nombreMaterialMeditacion; //del video, mmusica, documento que pertenece a la tecnica de meditacion

    @Column(name = "urlMaterialMeditacion", nullable = false, length = 200)
    private String urlMaterialMeditacion;

    @Column(name = "descripcionMaterialMeditacion", nullable = false, length = 200)
    private String descripcionMaterialMeditacion;

    @ManyToOne
    @JoinColumn(name = "idtecnicaMeditacion")
    private TecnicaMeditacion tecnicaMeditacion;

    @ManyToOne
    @JoinColumn(name = "idtipoMaterial")
    private TipoMaterial tipoMaterial;

    public MaterialMeditacion() {}

    public MaterialMeditacion(String descripcionMaterialMeditacion, int idMaterialMeditacion, String nombreMaterialMeditacion, TecnicaMeditacion tecnicaMeditacion, TipoMaterial tipoMaterial, String urlMaterialMeditacion) {
        this.descripcionMaterialMeditacion = descripcionMaterialMeditacion;
        this.idMaterialMeditacion = idMaterialMeditacion;
        this.nombreMaterialMeditacion = nombreMaterialMeditacion;
        this.tecnicaMeditacion = tecnicaMeditacion;
        this.tipoMaterial = tipoMaterial;
        this.urlMaterialMeditacion = urlMaterialMeditacion;
    }

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
