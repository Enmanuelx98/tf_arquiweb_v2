package pe.edu.upc.tfcreo.ServicesImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.Dtos.CategoriaMasUsadaDTO;
import pe.edu.upc.tfcreo.Entity.MusicaRelajacion;
import pe.edu.upc.tfcreo.Repository.MusicaRelajacionRepository;
import pe.edu.upc.tfcreo.ServicesInterface.MusicaRelajacionInterface;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;

@Service
public class MusicaRelajacionImple implements MusicaRelajacionInterface  {
    @Autowired
    private MusicaRelajacionRepository musicaRelajacionRepository;
    @Override
    public void insertarMusicaRelax(MusicaRelajacion musicarelajacion) {
        musicaRelajacionRepository.save(musicarelajacion);
    }

    @Override
    public void updateMusicaRelax(MusicaRelajacion musicarelajacion) {
        musicaRelajacionRepository.save(musicarelajacion);

    }

    @Override
    public void eliminarMusicaRelax(int id) {
        musicaRelajacionRepository.deleteById(id);
    }

    @Override
    public List<MusicaRelajacion> listarMusicaRelax() {
        return musicaRelajacionRepository.findAll();
    }

    @Override
    public List<CategoriaMasUsadaDTO> obtenerTop5CategoriasMasUsadas() {
        Pageable topFive = PageRequest.of(0,5);
        return musicaRelajacionRepository.top5CategoriasMasUsadas( topFive);
    }
}
