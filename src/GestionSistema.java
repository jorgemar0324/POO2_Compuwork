
/**
 *
 * @author Jorge Mario Rivas
 */

import java.util.ArrayList;

public class GestionSistema {
    private ArrayList<Empleado> empleados;
    private ArrayList<Departamento> departamentos;

    public GestionSistema() {
        empleados = new ArrayList<>();
        departamentos = new ArrayList<>();
    }

    // Método para agregar un empleado al ArrayList
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("Empleado agregado: " + empleado.getNombre() + " " + empleado.getApellidos());
    }

    // Método para eliminar un empleado del ArrayList
    public void eliminarEmpleado(Empleado empleado) {
        empleados.remove(empleado);
        empleado.eliminarDepartamento(); // Eliminar también su asignación de departamento
        System.out.println("Empleado eliminado: " + empleado.getNombre() + " " + empleado.getApellidos());
    }

    // Método para agregar un departamento al ArrayList
    public void agregarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
        System.out.println("Departamento agregado: " + departamento.getNombre());
    }

    // Método para asignar una calificación a un empleado
    public void calificarEmpleado(Empleado empleado, Evaluacion evaluacion) {
        empleado.agregarEvaluacion(evaluacion);
        System.out.println("Calificación agregada a " + empleado.getNombre() + " " + empleado.getApellidos() +
                           ": " + evaluacion.getCalificacion() + " en la fecha " + evaluacion.getFechaEvaluacion());
    }

    // Método para generar el reporte de desempeño de todos los empleados
    public void generarReporteDesempeno() {
        System.out.println("Reporte de Desempeño de Empleados:");
        for (Empleado empleado : empleados) {
            System.out.println("Empleado: " + empleado.getNombre() + " " + empleado.getApellidos());
            ArrayList<Evaluacion> evaluaciones = empleado.getEvaluaciones();
            if (evaluaciones.isEmpty()) {
                System.out.println("  Sin evaluaciones registradas.");
            } else {
                for (Evaluacion evaluacion : evaluaciones) {
                    System.out.println("  Fecha de evaluación: " + evaluacion.getFechaEvaluacion());
                    System.out.println("  Calificación: " + evaluacion.getCalificacion());
                }
            }
        }
    }

    // Método para mostrar todos los empleados
    public void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("Lista de empleados:");
            for (Empleado empleado : empleados) {
                System.out.println(empleado.getNombre() + " " + empleado.getApellidos() + " - Departamento: " +
                        (empleado.getDepartamento() != null ? empleado.getDepartamento().getNombre() : "Sin asignar"));
            }
        }
    }

    // Método para mostrar todos los departamentos
    public void mostrarDepartamentos() {
        if (departamentos.isEmpty()) {
            System.out.println("No hay departamentos registrados.");
        } else {
            System.out.println("Lista de departamentos:");
            for (Departamento departamento : departamentos) {
                System.out.println(departamento.getNombre() + " - Código: " + departamento.getCodigo());
            }
        }
    }
}
