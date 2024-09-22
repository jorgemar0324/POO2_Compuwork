
import java.time.LocalDate;

/**
 *
 * @author Jorge Mario Rivas
 */
public class Persona {
    private int cedula;
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String email;
    private String telefono;
    private String direccion;

    public Persona(int cedula, String nombre, String apellidos, LocalDate fechaNacimiento, String email, String telefono, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    // Getters y Setters
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

}
   
