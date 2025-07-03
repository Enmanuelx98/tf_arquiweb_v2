package pe.edu.upc.tfcreo.Dtos;


import pe.edu.upc.tfcreo.Entity.Pagos;

public class BilleteraElectronicaDTO {
    private int idBilleteraElectronica;
    private String companiaBilleteraElectronica;
    private String imagenQRBilleteraElectronica;
    private String evidenciaBilleteraElectronica;
    private Pagos pagos;

    public Pagos getPagos() {
        return pagos;
    }

    public void setPagos(Pagos pagos) {
        this.pagos = pagos;
    }

    public String getImagenQRBilleteraElectronica() {
        return imagenQRBilleteraElectronica;
    }

    public void setImagenQRBilleteraElectronica(String imagenQRBilleteraElectronica) {
        this.imagenQRBilleteraElectronica = imagenQRBilleteraElectronica;
    }

    public int getIdBilleteraElectronica() {
        return idBilleteraElectronica;
    }

    public void setIdBilleteraElectronica(int idBilleteraElectronica) {
        this.idBilleteraElectronica = idBilleteraElectronica;
    }

    public String getEvidenciaBilleteraElectronica() {
        return evidenciaBilleteraElectronica;
    }

    public void setEvidenciaBilleteraElectronica(String evidenciaBilleteraElectronica) {
        this.evidenciaBilleteraElectronica = evidenciaBilleteraElectronica;
    }

    public String getCompaniaBilleteraElectronica() {
        return companiaBilleteraElectronica;
    }

    public void setCompaniaBilleteraElectronica(String companiaBilleteraElectronica) {
        this.companiaBilleteraElectronica = companiaBilleteraElectronica;
    }
}
