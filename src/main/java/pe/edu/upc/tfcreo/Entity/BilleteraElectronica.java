package pe.edu.upc.tfcreo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Billeteraelectronica")
public class BilleteraElectronica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBilleteraElectronica;

    @Column(name = "tipoPago", nullable = false, length = 50)
    private String companiaBilleteraElectronica;

    @Column(name = "imagenQRBilleteraElectronica", nullable = false, length = 200)
    private String imagenQRBilleteraElectronica;

    @Column(name = "evidenciaBilleteraElectronica", nullable = false, length = 200)
    private String evidenciaBilleteraElectronica;

    @ManyToOne
    @JoinColumn(name = "idpagos")
    private Pagos pagos;

    public BilleteraElectronica() {}

    public BilleteraElectronica(String companiaBilleteraElectronica, String evidenciaBilleteraElectronica, int idBilleteraElectronica, String imagenQRBilleteraElectronica, Pagos pagos) {
        this.companiaBilleteraElectronica = companiaBilleteraElectronica;
        this.evidenciaBilleteraElectronica = evidenciaBilleteraElectronica;
        this.idBilleteraElectronica = idBilleteraElectronica;
        this.imagenQRBilleteraElectronica = imagenQRBilleteraElectronica;
        this.pagos = pagos;
    }

    public String getCompaniaBilleteraElectronica() {
        return companiaBilleteraElectronica;
    }

    public void setCompaniaBilleteraElectronica(String companiaBilleteraElectronica) {
        this.companiaBilleteraElectronica = companiaBilleteraElectronica;
    }

    public String getEvidenciaBilleteraElectronica() {
        return evidenciaBilleteraElectronica;
    }

    public void setEvidenciaBilleteraElectronica(String evidenciaBilleteraElectronica) {
        this.evidenciaBilleteraElectronica = evidenciaBilleteraElectronica;
    }

    public int getIdBilleteraElectronica() {
        return idBilleteraElectronica;
    }

    public void setIdBilleteraElectronica(int idBilleteraElectronica) {
        this.idBilleteraElectronica = idBilleteraElectronica;
    }

    public String getImagenQRBilleteraElectronica() {
        return imagenQRBilleteraElectronica;
    }

    public void setImagenQRBilleteraElectronica(String imagenQRBilleteraElectronica) {
        this.imagenQRBilleteraElectronica = imagenQRBilleteraElectronica;
    }

    public Pagos getPagos() {
        return pagos;
    }

    public void setPagos(Pagos pagos) {
        this.pagos = pagos;
    }
}
