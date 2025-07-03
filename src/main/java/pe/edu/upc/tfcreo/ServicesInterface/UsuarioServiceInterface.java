package pe.edu.upc.tfcreo.ServicesInterface;

import pe.edu.upc.tfcreo.Entity.Users;

import java.util.List;

public interface UsuarioServiceInterface {
    public void insertarUsuario(Users users);
    public void updateUsuario(Users users);
    public void eliminarUsuario(int id);
    public List<Users> listarUsuario();
    public Users buscarUsuariobyusername(String username);
}
