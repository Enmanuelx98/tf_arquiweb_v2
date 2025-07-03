package pe.edu.upc.tfcreo.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.Dtos.BilleteraElectronicaDTO;
import pe.edu.upc.tfcreo.Dtos.TerapiaDTO;
import pe.edu.upc.tfcreo.Entity.Terapia;
import pe.edu.upc.tfcreo.ServicesImple.TerapiaServiceImple;
import pe.edu.upc.tfcreo.ServicesInterface.TerapiaServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = {"*", "http://localhost:4200","http://18.224.80.144/"}, allowedHeaders = "*")
@RequestMapping("/terapia")
public class TerapiaController {
    @Autowired
    private TerapiaServiceInterface terapiaService;
    //insertar
    @PostMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void insertar(@RequestBody TerapiaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Terapia terapia = modelMapper.map(dto, Terapia.class);
        terapiaService.insertarTerapia(terapia);
    }

    //modificar
    @PutMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void editar(@RequestBody TerapiaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Terapia terapia = modelMapper.map(dto, Terapia.class);
        terapiaService.updateTerapia(terapia);

    }

    //delete
    @DeleteMapping("/{id}")
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") int id) {
        terapiaService.eliminarTerapia(id);
    }

    //listar
    @GetMapping
    //@PreAuthorize("hasAnyAuthority('ADMIN','JOVENESPROFESIONALES')")
    public List<TerapiaDTO> List() {
        return terapiaService.listarTerapia().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, TerapiaDTO.class);
        }).collect(Collectors.toList());
    }
    //Buscar por ID
    @GetMapping("/{id}")
    public TerapiaDTO buscarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        TerapiaDTO dto = m.map(terapiaService.listId(id), TerapiaDTO.class);
        return dto;
    }
}

