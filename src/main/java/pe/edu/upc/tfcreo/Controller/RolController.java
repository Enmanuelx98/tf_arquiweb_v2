package pe.edu.upc.tfcreo.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.Dtos.MaterialMeditacionDTO;
import pe.edu.upc.tfcreo.Dtos.RoleDTO;
import pe.edu.upc.tfcreo.Entity.Role;
import pe.edu.upc.tfcreo.ServicesInterface.RolSeriveInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = {"*", "http://localhost:4200","http://18.224.80.144/"}, allowedHeaders = "*")
@RequestMapping("/rol")
public class RolController {
    @Autowired
    private RolSeriveInterface rolSerive;

    //insertar
    @PostMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void insertar(@RequestBody RoleDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Role role = modelMapper.map(dto, Role.class);
        rolSerive.insertarRol(role);
    }

    //modificar
    @PutMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void editar(@RequestBody RoleDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Role role = modelMapper.map(dto, Role.class);
        rolSerive.updateRol(role);

    }

    //delete
    @DeleteMapping("/{id}")
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") int id) {
        rolSerive.eliminarRol(id);
    }

    //listar
    @GetMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    public List<RoleDTO> List() {
        return rolSerive.listarRol().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, RoleDTO.class);
        }).collect(Collectors.toList());
    }
    //Buscar sesion por ID
    @GetMapping("/{id}")
    public RoleDTO buscarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        RoleDTO dto = m.map(rolSerive.listId(id), RoleDTO.class);
        return dto;
    }
}
