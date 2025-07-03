package pe.edu.upc.tfcreo.ServicesInterface;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.tfcreo.Entity.SesionTerapia;

import java.util.List;

public interface SesionTerapiaInterface {
    public void insertarSesionTerapia(SesionTerapia sesionT);
    public void updateSesionTerapia(SesionTerapia sesionT);
    public void eliminarSesionTerapia(int id);
    public List<SesionTerapia> listarSesionTerapia();
    public List<SesionTerapia> quantitySesionesbyUsuario(int u);
    public List<SesionTerapia> quantitySesionesCompletobyUsuario(int u2);
    public List<String[]> usermoresesiones();
    public List<String[]> terapiamoresesesions();
}
