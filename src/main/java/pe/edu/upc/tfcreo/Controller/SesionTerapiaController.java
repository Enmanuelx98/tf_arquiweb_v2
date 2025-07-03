package pe.edu.upc.tfcreo.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.Dtos.SesionTerapiaDTO;
import pe.edu.upc.tfcreo.Dtos.TerapiamoresesionHU;
import pe.edu.upc.tfcreo.Dtos.UsermoresesionHU;
import pe.edu.upc.tfcreo.Entity.SesionTerapia;
import pe.edu.upc.tfcreo.ServicesInterface.SesionTerapiaInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = {"*", "http://localhost:4200","http://18.224.80.144/"}, allowedHeaders = "*")
@RequestMapping("/SesionTerapia")
public class SesionTerapiaController {
    @Autowired
    private SesionTerapiaInterface sesionTerapiaInterface;
    //insertar
    @PostMapping
    //@PreAuthorize("hasAnyAuthority('ADMIN','JOVENESPROFESIONALES')")
    public void insertar(@RequestBody SesionTerapiaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        SesionTerapia sesion = modelMapper.map(dto, SesionTerapia.class);
        sesionTerapiaInterface.insertarSesionTerapia(sesion);
    }

    //modificar
    @PutMapping
    //@PreAuthorize("hasAnyAuthority('ADMIN')")
    public void editar(@RequestBody SesionTerapiaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        SesionTerapia sesion = modelMapper.map(dto, SesionTerapia.class);
        sesionTerapiaInterface.updateSesionTerapia(sesion);

    }

    //delete
    @DeleteMapping("/{id}")
    //@PreAuthorize("hasAnyAuthority('ADMIN','JOVENESPROFESIONALES')")
    public void eliminar(@PathVariable("id") int id) {
        sesionTerapiaInterface.eliminarSesionTerapia(id);
    }

    //listar
    @GetMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    public List<SesionTerapiaDTO> List() {
        return sesionTerapiaInterface.listarSesionTerapia().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, SesionTerapiaDTO.class);
        }).collect(Collectors.toList());
    }

    //Buscar sesion por ID
    @GetMapping("/{id}")
    public SesionTerapiaDTO buscarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        SesionTerapiaDTO dto = m.map(sesionTerapiaInterface.listId(id), SesionTerapiaDTO.class);
        return dto;
    }

    //listarsesiones por usuario
    @GetMapping("/sesionUsuario/{id}")
    //@PreAuthorize("hasAnyAuthority('ADMIN','JOVENESPROFESIONALES')")
    public List<SesionTerapiaDTO> ListsesionUsuario(@PathVariable("id") int id) {
        return sesionTerapiaInterface.quantitySesionesbyUsuario(id).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, SesionTerapiaDTO.class);
        }).collect(Collectors.toList());
    }
    //listarsesiones completadas del usuario
    @GetMapping("/sesionCompletoUsuario/{id}")
    //@PreAuthorize("hasAnyAuthority('ADMIN','JOVENESPROFESIONALES')")
    public List<SesionTerapiaDTO> ListsesionCompletoUsuario(@PathVariable("id") int id) {
        return sesionTerapiaInterface.quantitySesionesCompletobyUsuario(id).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, SesionTerapiaDTO.class);
        }).collect(Collectors.toList());
    }
    //usuario con mas sesiones
    @GetMapping("/usuariomoresesiones")
    //@PreAuthorize("hasAuthority('ADMIN')")
    public List<UsermoresesionHU> Usuariomoresesiones() {
        List<UsermoresesionHU> dtoLista = new ArrayList<>();
        List<String[]> fila=sesionTerapiaInterface.usermoresesiones();
        for(String[]columna:fila){
            UsermoresesionHU dto = new UsermoresesionHU();
            dto.setIduser(Integer.parseInt(columna[0]));
            dto.setNombreusername(columna[1]);
            dto.setQuantitysesion(Integer.parseInt(columna[2]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }

    //terapia con mas sesiones
    @GetMapping("/terapiamoreused")
    //@PreAuthorize("hasAuthority('ADMIN')")
    public List<TerapiamoresesionHU> Terapiamoreused() {
        List<TerapiamoresesionHU> dtoLista = new ArrayList<>();
        List<String[]> fila=sesionTerapiaInterface.terapiamoresesesions();
        for(String[]columna:fila){
            TerapiamoresesionHU dto = new TerapiamoresesionHU();
            dto.setIdterapia(Integer.parseInt(columna[0]));
            dto.setNameterapia(columna[1]);
            dto.setQuantitysesion(Integer.parseInt(columna[2]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
