package pe.edu.upc.tfcreo.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.Dtos.MaterialMeditacionDTO;
import pe.edu.upc.tfcreo.Entity.MaterialMeditacion;
import pe.edu.upc.tfcreo.ServicesInterface.MateMeditacionServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = {"*", "http://localhost:4200","http://18.224.80.144/"}, allowedHeaders = "*")
@RequestMapping("/MateMeditacion")
public class MateMeditacionController {
    @Autowired
    private MateMeditacionServiceInterface mateMeditacionService;
    //insertar
    @PostMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void insertar(@RequestBody MaterialMeditacionDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        MaterialMeditacion materialMeditacion = modelMapper.map(dto, MaterialMeditacion.class);
        mateMeditacionService.insertarMateMeditacion(materialMeditacion);
    }

    //modificar
    @PutMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void editar(@RequestBody MaterialMeditacionDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        MaterialMeditacion materialMeditacion = modelMapper.map(dto, MaterialMeditacion.class);
        mateMeditacionService.updateMateMeditacion(materialMeditacion);

    }

    //delete
    @DeleteMapping("/{id}")
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") int id) {
        mateMeditacionService.eliminarMateMeditacion(id);
    }

    //listar
    @GetMapping
    //@PreAuthorize("hasAnyAuthority('ADMIN','JOVENESPROFESIONALES')")
    public List<MaterialMeditacionDTO> List() {
        return mateMeditacionService.listarMateMeditacion().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, MaterialMeditacionDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/buscar-por-nombre/{nombre}")
    //@PreAuthorize("hasAnyAuthority('ADMIN', 'PREMIUN', 'FREE')")
    public List<MaterialMeditacionDTO> buscarMaterialPorNombre(@PathVariable("nombre") String nombre) {
        return mateMeditacionService.buscarmaterialnombre(nombre).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, MaterialMeditacionDTO.class);
        }).collect(Collectors.toList());

    }

    
}
