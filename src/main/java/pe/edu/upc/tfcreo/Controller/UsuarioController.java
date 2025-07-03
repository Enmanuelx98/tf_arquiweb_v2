package pe.edu.upc.tfcreo.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.Dtos.BilleteraElectronicaDTO;
import pe.edu.upc.tfcreo.Dtos.UsersDTO;
import pe.edu.upc.tfcreo.Dtos.UsuarionopassDTO;
import pe.edu.upc.tfcreo.Entity.Role;
import pe.edu.upc.tfcreo.Entity.Users;
import pe.edu.upc.tfcreo.ServicesInterface.RolSeriveInterface;
import pe.edu.upc.tfcreo.ServicesInterface.UsuarioServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = {"*", "http://localhost:4200","http://18.224.80.144/"}, allowedHeaders = "*")
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioServiceInterface usuarioService;
    @Autowired
    private RolSeriveInterface rolSerive;
    //insertar
    @PostMapping("/insertarusuario")
    public void insertar(@RequestBody UsersDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Users users = modelMapper.map(dto, Users.class);

        // Encriptar la contraseña antes de guardar
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String hashedPassword = encoder.encode(users.getPassword());
        users.setPassword(hashedPassword);
        usuarioService.insertarUsuario(users);

        Users usuarioRol=usuarioService.buscarUsuariobyusername(users.getUsername());
        Role roleAsignado= new Role();
        roleAsignado.setRol("JOVENESPROFESIONALES");
        roleAsignado.setUser(usuarioRol);
        rolSerive.insertarRol(roleAsignado);

    }

    //modificar
    @PutMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void editar(@RequestBody UsersDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Users users = modelMapper.map(dto, Users.class);
        usuarioService.updateUsuario(users);

    }

    //delete
    @DeleteMapping("/{id}")
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") int id) {
        usuarioService.eliminarUsuario(id);
    }

    //listar
    @GetMapping(produces = "application/json")
    //@PreAuthorize("hasAnyAuthority('ADMIN','JOVENESPROFESIONALES')")
    public List<UsuarionopassDTO> List() {
        return usuarioService.listarUsuario().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UsuarionopassDTO.class);
        }).collect(Collectors.toList());
    }
    //Buscar por ID
    @GetMapping("/{id}")
    public UsersDTO buscarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        UsersDTO dto = m.map(usuarioService.listId(id), UsersDTO.class);
        return dto;
    }
}
