package pe.edu.upc.tfcreo.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.Dtos.PagosDTO;
import pe.edu.upc.tfcreo.Entity.Pagos;
import pe.edu.upc.tfcreo.ServicesInterface.PagosServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = {"*", "http://localhost:4200","http://18.224.80.144/"}, allowedHeaders = "*")
@RequestMapping("/Pagos")
public class PagosController {
    @Autowired
    private PagosServiceInterface pagosService;
    //insertar
    @PostMapping
    //@PreAuthorize("hasAnyAuthority('ADMIN','JOVENESPROFESIONALES')")
    public void insertar(@RequestBody PagosDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Pagos pagos = modelMapper.map(dto, Pagos.class);
        pagosService.insertarPagos(pagos);
    }

    //modificar
    @PutMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void editar(@RequestBody PagosDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Pagos pagos = modelMapper.map(dto, Pagos.class);
        pagosService.updatePagos(pagos);

    }

    //delete
    @DeleteMapping("/{id}")
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") int id) {
        pagosService.eliminarPagos(id);
    }

    //listar
    @GetMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    public List<PagosDTO> List() {
        return pagosService.listarPagos().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PagosDTO.class);
        }).collect(Collectors.toList());
    }
}
