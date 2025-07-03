package pe.edu.upc.tfcreo.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.Dtos.CategoriaMasUsadaDTO;
import pe.edu.upc.tfcreo.Dtos.MusicaRelajacionDTO;
import pe.edu.upc.tfcreo.Entity.MusicaRelajacion;
import pe.edu.upc.tfcreo.ServicesInterface.MusicaRelajacionInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = {"*", "http://localhost:4200","http://18.224.80.144/"}, allowedHeaders = "*")
@RequestMapping("/musicarelax")
public class MusicaRelajacionController {
    @Autowired
    private MusicaRelajacionInterface musicaRelajacionservice;
    @PostMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void insertar(@RequestBody MusicaRelajacionDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        MusicaRelajacion musicarelajacion = modelMapper.map(dto, MusicaRelajacion.class);
        musicaRelajacionservice.insertarMusicaRelax(musicarelajacion);
    }

    //modificar
    @PutMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void editar(@RequestBody MusicaRelajacionDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        MusicaRelajacion musicarelajacion = modelMapper.map(dto, MusicaRelajacion.class);
        musicaRelajacionservice.updateMusicaRelax(musicarelajacion);

    }

    //delete
    @DeleteMapping("/{id}")
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") int id) {
        musicaRelajacionservice.eliminarMusicaRelax(id);
    }

    //listar
    @GetMapping
    //@PreAuthorize("hasAnyAuthority('ADMIN','JOVENESPROFESIONALES')")
    public List<MusicaRelajacionDTO> List() {
        return musicaRelajacionservice.listarMusicaRelax().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, MusicaRelajacionDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/top-categorias")
    //@PreAuthorize("hasAnyRole('ADMIN','JOVENESPROFESIONALES')")
    public List<CategoriaMasUsadaDTO> obtenerTopCategorias() {
        return musicaRelajacionservice.obtenerTop5CategoriasMasUsadas();
    }


}

