package pe.edu.upc.tfcreo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "TipoMaterial")
public class TipoMaterial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoMaterial;

    @Column(name = "nombreTipoMaterial", nullable = false, length = 50)
    private String nombreTipoMaterial; //videos, documentos, musica

    public TipoMaterial() {}

    public TipoMaterial(int idTipoMaterial, String nombreTipoMaterial) {
        this.idTipoMaterial = idTipoMaterial;
        this.nombreTipoMaterial = nombreTipoMaterial;
    }

    public int getIdTipoMaterial() {
        return idTipoMaterial;
    }

    public void setIdTipoMaterial(int idTipoMaterial) {
        this.idTipoMaterial = idTipoMaterial;
    }

    public String getNombreTipoMaterial() {
        return nombreTipoMaterial;
    }

    public void setNombreTipoMaterial(String nombreTipoMaterial) {
        this.nombreTipoMaterial = nombreTipoMaterial;
    }
}
