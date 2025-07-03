package pe.edu.upc.tfcreo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfcreo.Entity.Users;
@Repository
public interface UsuarioRepository extends JpaRepository<Users, Integer> {
    public Users findOneByUsername(String username);
}
