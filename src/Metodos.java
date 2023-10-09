import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

class Metodos {
   
    public static int ObtenerCantidad(List<Alumnos> estudiantes) {
        return estudiantes.size();
    }

    public static double calcularPromedioEdad(List<Alumnos> estudiantes) {
        LocalDate fechaActual = LocalDate.now();
        int sumaEdades = 0;

        for (Alumnos estudiante : estudiantes) {
            LocalDate fechaNacimiento = estudiante.getFechaCumpleaños();
            int edad = Period.between(fechaNacimiento, fechaActual).getYears();
            sumaEdades += edad;
        }

        return sumaEdades / estudiantes.size();
    }

    public static List<String> ObtenerEstudiantesMenoresAlPromedio(List<Alumnos> estudiantes, double promedio) {
        List<String> infoEstudiantesMenores = new ArrayList<>();
        for (Alumnos estudiante : estudiantes) {
            if (estudiante.getEdad() <= (promedio + 1)) { 
                Cadena capturarCadena =new Cadena();
            capturarCadena.setX(estudiante.getNombre() +" con "+ estudiante.getEdad()+ " años") ;
                infoEstudiantesMenores.add(capturarCadena.getX());
            }
        }
        return infoEstudiantesMenores;
    }
    
}
