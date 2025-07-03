package pe.edu.upc.tfcreo.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.Dtos.MaterialMeditacionDTO;
import pe.edu.upc.tfcreo.Dtos.PorcentajeDTO;
import pe.edu.upc.tfcreo.Dtos.ProgresoMaterialMediDTO;
import pe.edu.upc.tfcreo.Entity.ProgresoMaterialMedi;
import pe.edu.upc.tfcreo.ServicesInterface.ProgresoMaterialMediInterface;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@CrossOrigin(origins = {"*", "http://localhost:4200","http://18.224.80.144/"}, allowedHeaders = "*")
@RequestMapping("/ProgresoMaterialMedi")
public class ProgresoMaterialMediController {
    @Autowired
    private ProgresoMaterialMediInterface progresoMaterialMediInterface;
    //insertar
    @PostMapping
    //@PreAuthorize("hasAnyAuthority('ADMIN','JOVENESPROFESIONALES')")
    public void insertar(@RequestBody ProgresoMaterialMediDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        ProgresoMaterialMedi progresomaterialMedi = modelMapper.map(dto, ProgresoMaterialMedi.class);
        progresoMaterialMediInterface.insertarProgresoMaterialMedi(progresomaterialMedi);
    }

    //modificar
    @PutMapping
    //@PreAuthorize("hasAnyAuthority('ADMIN','JOVENESPROFESIONALES')")
    public void editar(@RequestBody ProgresoMaterialMediDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        ProgresoMaterialMedi progresomaterialMedi = modelMapper.map(dto, ProgresoMaterialMedi.class);
        progresoMaterialMediInterface.updateProgresoMaterialMedi(progresomaterialMedi);

    }

    //delete
    @DeleteMapping("/{id}")
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") int id) {
        progresoMaterialMediInterface.eliminarProgresoMaterialMedi(id);
    }

    //listar
    @GetMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    public List<ProgresoMaterialMediDTO> List() {
        return progresoMaterialMediInterface.listarProgresoMaterialMedi().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ProgresoMaterialMediDTO.class);
        }).collect(Collectors.toList());
    }

    //Porcentaje de progreso
    @GetMapping("/progreso/{id}")
    //@PreAuthorize("hasAnyAuthority('ADMIN','JOVENESPROFESIONALES')")
    public PorcentajeDTO obtenerProgresoMaterialDTO(@PathVariable int id) {
        double porcentaje = progresoMaterialMediInterface.calcularPorcentajeProgreso(id);

        PorcentajeDTO porcentajeDTO = new PorcentajeDTO(id, porcentaje);

        return porcentajeDTO;
    }

    //Lista de materiales completados
    @GetMapping("/materialcompleta/{id}")
    //@PreAuthorize("hasAnyAuthority('ADMIN','JOVENESPROFESIONALES')")
    public List<ProgresoMaterialMediDTO> ListMusicaCompleto(@PathVariable int id) {
        return progresoMaterialMediInterface.quantityMaterialCompletadosBySesion(id).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ProgresoMaterialMediDTO.class);
        }).collect(Collectors.toList());
    }
    //Buscar sesion por ID
    @GetMapping("/{id}")
    public ProgresoMaterialMediDTO buscarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        ProgresoMaterialMediDTO dto = m.map(progresoMaterialMediInterface.listId(id), ProgresoMaterialMediDTO.class);
        return dto;
    }
}
