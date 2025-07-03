package pe.edu.upc.tfcreo.Dtos;

public class UsermoresesionHU {
    private int iduser;
    private String nombreusername;
    private int quantitysesion;

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getNombreusername() {
        return nombreusername;
    }

    public void setNombreusername(String nombreusername) {
        this.nombreusername = nombreusername;
    }

    public int getQuantitysesion() {
        return quantitysesion;
    }

    public void setQuantitysesion(int quantitysesion) {
        this.quantitysesion = quantitysesion;
    }
}
