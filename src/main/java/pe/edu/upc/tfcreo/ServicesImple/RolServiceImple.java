package pe.edu.upc.tfcreo.ServicesImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.Entity.ProgresovideosTR;
import pe.edu.upc.tfcreo.Entity.Role;
import pe.edu.upc.tfcreo.Entity.Users;
import pe.edu.upc.tfcreo.Repository.RolRepository;
import pe.edu.upc.tfcreo.ServicesInterface.RolSeriveInterface;

import java.util.List;
@Service
public class RolServiceImple implements RolSeriveInterface {
    @Autowired
    private RolRepository rolRepository;
    @Override
    public void insertarRol(Role role) {
        rolRepository.save(role);
    }

    @Override
    public void updateRol(Role role) {
        rolRepository.save(role);
    }

    @Override
    public void eliminarRol(int id) {

        Role role = rolRepository.findById(id).orElseThrow();
        Users user = role.getUser();
        user.getRoles().remove(role); // elimina de la lista
        rolRepository.delete(role); // luego eliminas el rol

    }

    @Override
    public List<Role> listarRol() {
        return rolRepository.findAll();
    }

    @Override
    public Role listId(int id) {
        return rolRepository.findById(id).orElse(new Role());

    }

}
