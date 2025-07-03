package pe.edu.upc.tfcreo.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.Dtos.PorcentajeDTO;
import pe.edu.upc.tfcreo.Dtos.ProgresomusicaSDTO;
import pe.edu.upc.tfcreo.Entity.ProgresomusicaS;
import pe.edu.upc.tfcreo.ServicesInterface.ProgresomusicaSInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = {"*", "http://localhost:4200","http://18.224.80.144/"}, allowedHeaders = "*")
@RequestMapping("/ProgresomusicaS")
public class ProgresomusicaSController {
    @Autowired
    private ProgresomusicaSInterface progresomusicaSInterface;
    //insertar
    @PostMapping
    //@PreAuthorize("hasAnyAuthority('ADMIN','JOVENESPROFESIONALES')")
    public void insertar(@RequestBody ProgresomusicaSDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        ProgresomusicaS progresomusicaS = modelMapper.map(dto, ProgresomusicaS.class);
        progresomusicaSInterface.insertarProgresoMusica(progresomusicaS);
    }

    //modificar
    @PutMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void editar(@RequestBody ProgresomusicaSDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        ProgresomusicaS progresomusicaS = modelMapper.map(dto, ProgresomusicaS.class);
        progresomusicaSInterface.updateProgresoMusica(progresomusicaS);

    }

    //delete
    @DeleteMapping("/{id}")
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") int id) {
        progresomusicaSInterface.eliminarProgresoMusica(id);
    }

    //listar
    @GetMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    public List<ProgresomusicaSDTO> List() {
        return progresomusicaSInterface.listarProgresoMusica().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ProgresomusicaSDTO.class);
        }).collect(Collectors.toList());
    }

    //Porcentaje de progreso
    @GetMapping("/progreso/{id}")
    //@PreAuthorize("hasAnyAuthority('ADMIN','JOVENESPROFESIONALES')")
    public PorcentajeDTO obtenerProgresoMusicaDTO(@PathVariable int id) {
        double porcentaje = progresomusicaSInterface.calcularPorcentajeProgreso(id);

        PorcentajeDTO porcentajeDTO = new PorcentajeDTO(id, porcentaje);

        return porcentajeDTO;
    }

    //Lista de musica completados
    @GetMapping("/musicacompleta/{id}")
    //@PreAuthorize("hasAnyAuthority('ADMIN','JOVENESPROFESIONALES')")
    public List<ProgresomusicaSDTO> ListMusicaCompleto(@PathVariable int id) {
        return progresomusicaSInterface.quantityMusicaCompletoBySesion(id).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ProgresomusicaSDTO.class);
        }).collect(Collectors.toList());
    }
}
