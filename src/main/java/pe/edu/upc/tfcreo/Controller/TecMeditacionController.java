package pe.edu.upc.tfcreo.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfcreo.Dtos.BilleteraElectronicaDTO;
import pe.edu.upc.tfcreo.Dtos.CantidadTecnicaMeditacionPorTipoTerapiaDTO;
import pe.edu.upc.tfcreo.Dtos.TecnicaMeditacionDTO;
import pe.edu.upc.tfcreo.Dtos.TecnicaMeditacionPorTipoTerapiaDTO;
import pe.edu.upc.tfcreo.Entity.TecnicaMeditacion;
import pe.edu.upc.tfcreo.ServicesInterface.TecMeditacionServiceInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = {"*", "http://localhost:4200","http://18.224.80.144/"}, allowedHeaders = "*")
@RequestMapping("/TecMeditacion")
public class TecMeditacionController {
    @Autowired
    private TecMeditacionServiceInterface tecMeditacionService;
    //insertar
    @PostMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void insertar(@RequestBody TecnicaMeditacionDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        TecnicaMeditacion tecnicaMeditacion = modelMapper.map(dto, TecnicaMeditacion.class);
        tecMeditacionService.insertarTecMeditacion(tecnicaMeditacion);
    }

    //modificar
    @PutMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void editar(@RequestBody TecnicaMeditacionDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        TecnicaMeditacion tecnicaMeditacion = modelMapper.map(dto, TecnicaMeditacion.class);
        tecMeditacionService.updateTecMeditacion(tecnicaMeditacion);

    }

    //delete
    @DeleteMapping("/{id}")
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") int id) {
        tecMeditacionService.eliminarTecMeditacion(id);
    }

    //listar
    @GetMapping
    //@PreAuthorize("hasAnyAuthority('ADMIN','JOVENESPROFESIONALES')")
    public List<TecnicaMeditacionDTO> List() {
        return tecMeditacionService.listarTecMeditacion().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, TecnicaMeditacionDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/buscarTecnicasMeditacionesPorTiposTerapias")
    //@PreAuthorize("hasAuthority('ADMIN')")
    public List<TecnicaMeditacionPorTipoTerapiaDTO> tecnicaMeditacionPorTipoTerapia(){
        List<TecnicaMeditacionPorTipoTerapiaDTO> dtotecnicaMeditacionPorTipoTerapiaList = new ArrayList<>();
        List<String[]> fila = tecMeditacionService.tecnicaMeditacionPorTipoTerapia();
        for(String[]columna : fila){
            TecnicaMeditacionPorTipoTerapiaDTO dtoTecnicaMeditacionPorTipoTerapia = new TecnicaMeditacionPorTipoTerapiaDTO();
            dtoTecnicaMeditacionPorTipoTerapia.setNombreTecnicaMeditacion(columna[0]);
            dtoTecnicaMeditacionPorTipoTerapia.setTipoTerapia(columna[1]);
            dtotecnicaMeditacionPorTipoTerapiaList.add(dtoTecnicaMeditacionPorTipoTerapia);
        }
        return dtotecnicaMeditacionPorTipoTerapiaList;
    }

    @GetMapping("/cantidadesTecnicasMeditacionesPorTiposTerapias")
    //@PreAuthorize("hasAuthority('ADMIN')")
    public List<CantidadTecnicaMeditacionPorTipoTerapiaDTO> cantidadTecnicaMeditacionPorTipoTerapia(){
        List<CantidadTecnicaMeditacionPorTipoTerapiaDTO> dtocantidadTecnicaMeditacionPorTipoTerapiaList = new ArrayList<>();
        List<String[]> fila = tecMeditacionService.cantidadTecnicasMeditacionPorTipoTerapia();
        for(String[]columna : fila){
            CantidadTecnicaMeditacionPorTipoTerapiaDTO dtocantidadTecnicaMeditacionPorTipoTerapia = new CantidadTecnicaMeditacionPorTipoTerapiaDTO();
            dtocantidadTecnicaMeditacionPorTipoTerapia.setTipoTerapia(columna[0]);
            dtocantidadTecnicaMeditacionPorTipoTerapia.setCantidadTecnicaMeditacion(Integer.parseInt(columna[1]));
            dtocantidadTecnicaMeditacionPorTipoTerapiaList.add(dtocantidadTecnicaMeditacionPorTipoTerapia);
        }
        return dtocantidadTecnicaMeditacionPorTipoTerapiaList;
    }
    //Buscar por ID
    @GetMapping("/{id}")
    public TecnicaMeditacionDTO buscarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        TecnicaMeditacionDTO dto = m.map(tecMeditacionService.listId(id), TecnicaMeditacionDTO.class);
        return dto;
    }
}
