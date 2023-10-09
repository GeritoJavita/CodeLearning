import java.time.LocalDate;
import java.time.Period;

public class Alumnos {

    private String Nombre;
    private LocalDate fechaCumpleaños;

    public Alumnos(String nombre, LocalDate fechaCumpleaños) {
        this.Nombre = nombre;
        this.fechaCumpleaños = fechaCumpleaños;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public LocalDate getFechaCumpleaños() {
        return fechaCumpleaños;
    }

    public int getEdad() {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaCumpleaños, fechaActual);
        return periodo.getYears();
    }
}
