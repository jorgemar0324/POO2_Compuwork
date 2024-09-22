/**
 *
 * @author Jorge Mario Rivas-
 */


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        GestionSistema gestionsistema = new GestionSistema();

        // Crear departamentos
        Departamento produccion = new Departamento("001", "Producción");
        Departamento sistemas = new Departamento("002", "Sistemas");

        gestionsistema.agregarDepartamento(produccion);
        gestionsistema.agregarDepartamento(sistemas);

        // Crear empleados con fechas usando LocalDate
        Empleado emp1 = new Empleado(1234, "Juan", "Pérez", LocalDate.of(1980, 1, 1), "juan@gmail.com", "3007605044", "Calle A", 5000000.0, LocalDate.of(2022, 12, 1), "Activo", "Temporal");
        Empleado emp2 = new Empleado(12345, "Ana", "García", LocalDate.of(1990, 1, 1), "ana@gmail.com", "310445555", "Calle B", 1300000.0, LocalDate.of(2024, 1, 25), "Activo", "Indefinido");
        Empleado emp3 = new Empleado(123456, "Carlos", "Ramírez", LocalDate.of(1985, 1, 1), "carlos@gmail.com", "3019804345", "Calle C", 1800000.0, LocalDate.of(1999, 9, 11), "Activo", "Termino fijo");
        Empleado emp4 = new Empleado(1234567, "María", "Fernández", LocalDate.of(1995, 1, 1), "maria@gmail.com", "3045786789", "Calle D", 1950000.0, LocalDate.of(2010, 8, 30), "Activo", "Termino fijo");
        Empleado emp5 = new Empleado(12345678, "Luis", "Méndez", LocalDate.of(1992, 1, 1), "luis@gmail.com", "3001023454", "Calle E", 2700000.0, LocalDate.of(2022, 11, 24), "Activo", "Temporal");

        // Agregar empleados al sistema
        gestionsistema.agregarEmpleado(emp1);
        gestionsistema.agregarEmpleado(emp2);
        gestionsistema.agregarEmpleado(emp3);
        gestionsistema.agregarEmpleado(emp4);
        gestionsistema.agregarEmpleado(emp5);
        
        

        // Asignar empleados a departamentos
        emp1.asignarDepartamento(produccion);
        emp2.asignarDepartamento(sistemas);
        emp3.asignarDepartamento(produccion);
        emp4.asignarDepartamento(sistemas);
        emp5.asignarDepartamento(produccion);

        // Eliminar un empleado
        gestionsistema.eliminarEmpleado(emp5);
        
        gestionsistema.mostrarEmpleados();
        
// Calificar empleados
        Evaluacion eval1 = new Evaluacion(LocalDate.now(), 85); 
        Evaluacion eval2 = new Evaluacion(LocalDate.now(), 90); 
        gestionsistema.calificarEmpleado(emp1, eval1);
        gestionsistema.calificarEmpleado(emp2, eval2);

        // Generar reporte de desempeño
        gestionsistema.generarReporteDesempeno();
    }
}
