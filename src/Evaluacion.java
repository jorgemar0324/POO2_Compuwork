
import java.time.LocalDate;


/**
 *
 * @author Jorge Mario Rivas
 */
public class Evaluacion {
    private LocalDate fechaEvaluacion;
    private int calificacion; // Se califica en una escala de 0 a 100

    
    // Metodo para agregar evaluacion con control para que sea de 0 a 100
    public Evaluacion(LocalDate fechaEvaluacion, int calificacion) {
        if (calificacion < 0 || calificacion > 100) {
            throw new IllegalArgumentException("La calificación debe estar entre 0 y 100.");
        }
        this.fechaEvaluacion = fechaEvaluacion;
        this.calificacion = calificacion;
    }

    public LocalDate getFechaEvaluacion() {
        return fechaEvaluacion;
    }

    public void setFechaEvaluacion(LocalDate fechaEvaluacion) {
        this.fechaEvaluacion = fechaEvaluacion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        if (calificacion < 0 || calificacion > 100) {
            throw new IllegalArgumentException("La calificación debe estar entre 0 y 100.");
        }
        this.calificacion = calificacion;
    }
}

