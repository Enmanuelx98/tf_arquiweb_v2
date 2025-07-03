package pe.edu.upc.tfcreo.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "users")
public class Users implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 30, unique = true)
    private String username;

    @Column(length = 200)
    private String password;

    private Boolean enabled;

    @Column(name = "correousuario", nullable = false, length = 50)
    private String correousuario;

    @Column(name = "fechanacimientousuario", nullable = false)
    private LocalDate fechanacimientousuario;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    @JsonManagedReference
    private List<Role> roles;

    public Users(){}

    public Users(String correousuario, Boolean enabled, LocalDate fechanacimientousuario, int id, String password, List<Role> roles, String username) {
        this.correousuario = correousuario;
        this.enabled = enabled;
        this.fechanacimientousuario = fechanacimientousuario;
        this.id = id;
        this.password = password;
        this.roles = roles;
        this.username = username;
    }

    public String getCorreousuario() {
        return correousuario;
    }

    public void setCorreousuario(String correousuario) {
        this.correousuario = correousuario;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public LocalDate getFechanacimientousuario() {
        return fechanacimientousuario;
    }

    public void setFechanacimientousuario(LocalDate fechanacimientousuario) {
        this.fechanacimientousuario = fechanacimientousuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
