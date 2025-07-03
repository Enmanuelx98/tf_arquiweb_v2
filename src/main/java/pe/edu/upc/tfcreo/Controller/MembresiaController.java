package pe.edu.upc.tfcreo.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.Dtos.MaterialMeditacionDTO;
import pe.edu.upc.tfcreo.Dtos.MembresiaDTO;
import pe.edu.upc.tfcreo.Entity.Membresia;
import pe.edu.upc.tfcreo.ServicesInterface.MembresiaServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = {"*", "http://localhost:4200","http://18.224.80.144/"}, allowedHeaders = "*")
@RequestMapping("/membresia")
public class MembresiaController {
    @Autowired
    private MembresiaServiceInterface membresiaService;
    //insertar
    @PostMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void insertar(@RequestBody MembresiaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Membresia membresia = modelMapper.map(dto, Membresia.class);
        membresiaService.insertarMembresia(membresia);
    }

    //modificar
    @PutMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void editar(@RequestBody MembresiaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Membresia membresia = modelMapper.map(dto, Membresia.class);
        membresiaService.updateMembresia(membresia);

    }

    //delete
    @DeleteMapping("/{id}")
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") int id) {
        membresiaService.eliminarMembresia(id);
    }

    //listar
    @GetMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    public List<MembresiaDTO> List() {
        return membresiaService.listarMembresia().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, MembresiaDTO.class);
        }).collect(Collectors.toList());
    }
    //Buscar sesion por ID
    @GetMapping("/{id}")
    public MembresiaDTO buscarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        MembresiaDTO dto = m.map(membresiaService.listId(id), MembresiaDTO.class);
        return dto;
    }
}
