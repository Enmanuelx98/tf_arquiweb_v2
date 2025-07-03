package pe.edu.upc.tfcreo.Dtos;

public class CategoriaMasUsadaDTO {
    private String nombreCategoria;
    private Long cantidadUsos;

    public CategoriaMasUsadaDTO() {
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public Long getCantidadUsos() {
        return cantidadUsos;
    }

    public void setCantidadUsos(Long cantidadUsos) {
        this.cantidadUsos = cantidadUsos;
    }
    public CategoriaMasUsadaDTO(String nombreCategoria, Long cantidadUsos) {
        this.nombreCategoria = nombreCategoria;
        this.cantidadUsos = cantidadUsos;
    }
}
