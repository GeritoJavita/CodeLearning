import java.time.LocalDate;
import java.time.Period;
/*Clase alumnos contiene  como atributos Nombre, y fechaCumpleaños */
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
/*En este metodo lo que se hace es calcular la edad entre la fecha de nacimiento y la actual
lo que devuelve es un valor entero */
    public int getEdad() {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaCumpleaños, fechaActual);
        return periodo.getYears();
    }
}
