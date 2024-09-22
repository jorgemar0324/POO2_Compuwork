

/**
 *
 * @author Jorge Mario Rivas
 */
import java.time.LocalDate;
import java.util.ArrayList;

public class Empleado extends Persona {
    private double salario;
    private LocalDate fechaIngreso;
    private String estadoEmpleado;
    private String tipoEmpleado;
    private Departamento departamento;
    private ArrayList<Evaluacion> evaluaciones;

    public Empleado(int cedula, String nombre, String apellidos, LocalDate fechaNacimiento, String email, String telefono, String direccion, double salario, LocalDate fechaIngreso, String estadoEmpleado, String tipoEmpleado) {
        super(cedula, nombre, apellidos, fechaNacimiento, email, telefono, direccion);
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
        this.estadoEmpleado = estadoEmpleado;
        this.tipoEmpleado = tipoEmpleado;
        this.departamento = null; // Inicialmente no asignado a un departamento
        this.evaluaciones = new ArrayList<>(); // Inicializamos la lista de evaluaciones
    }

    public Empleado(int cedula, String nombre, String apellidos, LocalDate fechaNacimiento, String email, String telefono, String direccion) {
        super(cedula, nombre, apellidos, fechaNacimiento, email, telefono, direccion);
    }

    public Empleado(double salario, LocalDate fechaIngreso, String estadoEmpleado, String tipoEmpleado, Departamento departamento, ArrayList<Evaluacion> evaluaciones, int cedula, String nombre, String apellidos, LocalDate fechaNacimiento, String email, String telefono, String direccion) {
        super(cedula, nombre, apellidos, fechaNacimiento, email, telefono, direccion);
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
        this.estadoEmpleado = estadoEmpleado;
        this.tipoEmpleado = tipoEmpleado;
        this.departamento = departamento;
        this.evaluaciones = evaluaciones;
    }
    
    
    
    // Getters y Setters
    

    public void agregarEvaluacion(Evaluacion evaluacion) {
        this.evaluaciones.add(evaluacion);
    }

    public ArrayList<Evaluacion> getEvaluaciones() {
        return evaluaciones;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getEstadoEmpleado() {
        return estadoEmpleado;
    }

    public void setEstadoEmpleado(String estadoEmpleado) {
        this.estadoEmpleado = estadoEmpleado;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void asignarDepartamento(Departamento departamento) {
        this.departamento = departamento;
        departamento.agregarEmpleado(this);
    }

    public void eliminarDepartamento() {
        if (this.departamento != null) {
            this.departamento.eliminarEmpleado(this);
            this.departamento = null;
        }
    }
}
