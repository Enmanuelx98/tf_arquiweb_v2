package pe.edu.upc.tfcreo.ServicesInterface;

import pe.edu.upc.tfcreo.Entity.VideosTecnicasRespiracion;

import java.util.List;

public interface VideosTecRespiracionInterface {
    public void insertarVideosTecRespiracion(VideosTecnicasRespiracion videosTecRespiracion);
    public void updateVideosTecRespiracion(VideosTecnicasRespiracion videosTecRespiracion);
    public void eliminarVideosTecRespiracion(int id);
    public List<VideosTecnicasRespiracion> listarVideosTecRespiracion();
}
