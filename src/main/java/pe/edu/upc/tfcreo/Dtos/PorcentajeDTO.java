package pe.edu.upc.tfcreo.Dtos;

public class PorcentajeDTO {
    private int idsesion;
    private double porcentaje;

    public PorcentajeDTO(){}

    public PorcentajeDTO(int idsesion, double porcentaje) {
        this.idsesion = idsesion;
        this.porcentaje = porcentaje;
    }

    public int getIdsesion() {
        return idsesion;
    }

    public void setIdsesion(int idsesion) {
        this.idsesion = idsesion;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
}
