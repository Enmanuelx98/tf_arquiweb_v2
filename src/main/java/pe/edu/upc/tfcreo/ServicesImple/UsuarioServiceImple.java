package pe.edu.upc.tfcreo.ServicesImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.Entity.Users;
import pe.edu.upc.tfcreo.Repository.UsuarioRepository;
import pe.edu.upc.tfcreo.ServicesInterface.UsuarioServiceInterface;

import java.util.List;
@Service
public class UsuarioServiceImple implements UsuarioServiceInterface {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void insertarUsuario(Users users) {
        usuarioRepository.save(users);
    }

    @Override
    public void updateUsuario(Users users) {
        usuarioRepository.save(users);
    }

    @Override
    public void eliminarUsuario(int id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public List<Users> listarUsuario() {
        return usuarioRepository.findAll();
    }

    @Override
    public Users buscarUsuariobyusername(String username) {
        return usuarioRepository.findOneByUsername(username);
    }
}
