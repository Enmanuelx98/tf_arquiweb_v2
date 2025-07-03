package pe.edu.upc.tfcreo.ServicesInterface;

import pe.edu.upc.tfcreo.Entity.Role;

import java.util.List;

public interface RolSeriveInterface {
    public void insertarRol(Role role);
    public void updateRol(Role role);
    public void eliminarRol(int id);
    public List<Role> listarRol();
}
