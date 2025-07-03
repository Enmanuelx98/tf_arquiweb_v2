package pe.edu.upc.tfcreo.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.Dtos.MaterialMeditacionDTO;
import pe.edu.upc.tfcreo.Dtos.PorcentajeDTO;
import pe.edu.upc.tfcreo.Dtos.ProgresovideosTRDTO;
import pe.edu.upc.tfcreo.Entity.ProgresovideosTR;
import pe.edu.upc.tfcreo.ServicesInterface.ProgresovideosTRInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = {"*", "http://localhost:4200","http://18.224.80.144/"}, allowedHeaders = "*")
@RequestMapping("/ProgresovideosTR")
public class ProgresovideosTRController {
    @Autowired
    private ProgresovideosTRInterface progresovideosTRInterface;
    //insertar
    @PostMapping
    //@PreAuthorize("hasAnyAuthority('ADMIN','JOVENESPROFESIONALES')")
    public void insertar(@RequestBody ProgresovideosTRDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        ProgresovideosTR progresovideosTR = modelMapper.map(dto, ProgresovideosTR.class);
        progresovideosTRInterface.insertarProgresoVideosTR(progresovideosTR);
    }

    //modificar
    @PutMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void editar(@RequestBody ProgresovideosTRDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        ProgresovideosTR progresovideosTR = modelMapper.map(dto, ProgresovideosTR.class);
        progresovideosTRInterface.updateProgresoVideosTR(progresovideosTR);

    }

    //delete
    @DeleteMapping("/{id}")
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") int id) {
        progresovideosTRInterface.eliminarProgresoVideosTR(id);
    }

    //listar
    @GetMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    public List<ProgresovideosTRDTO> List() {
        return progresovideosTRInterface.listarProgresoVideosTR().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ProgresovideosTRDTO.class);
        }).collect(Collectors.toList());
    }

    //Porcentaje de progreso
    @GetMapping("/progreso/{id}")
    //@PreAuthorize("hasAnyAuthority('ADMIN','JOVENESPROFESIONALES')")
    public PorcentajeDTO obtenerProgresoDTO(@PathVariable int id) {
        double porcentaje = progresovideosTRInterface.calcularPorcentajeProgreso(id);

        PorcentajeDTO porcentajeDTO = new PorcentajeDTO(id, porcentaje);
        return porcentajeDTO;
    }

    //Lista de videos completados
    @GetMapping("/videocompleto/{id}")
    //@PreAuthorize("hasAnyAuthority('ADMIN','JOVENESPROFESIONALES')")
    public List<ProgresovideosTRDTO> ListVideoCompleto(@PathVariable int id) {
        return progresovideosTRInterface.quantityVideosCompletadosBySesion(id).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ProgresovideosTRDTO.class);
        }).collect(Collectors.toList());
    }
    //Buscar sesion por ID
    @GetMapping("/{id}")
    public ProgresovideosTRDTO buscarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        ProgresovideosTRDTO dto = m.map(progresovideosTRInterface.listId(id), ProgresovideosTRDTO.class);
        return dto;
    }
}
