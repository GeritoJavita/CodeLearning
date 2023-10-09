import java.util.ArrayList;
import java.util.List;

class Metodos {
   /*Metodo para obtener la cantidad de estudiantes o objetos de alumno de la lista  */
    public static int ObtenerCantidad(List<Alumnos> estudiantes) {
        return estudiantes.size();
    }
/*Para calcular el promedio devulve un double, con parametros de un objeto de lista Alumnos
Se obtiene la fecha actual, y se crea una varibale local para el total de edades */
    public static double calcularPromedioEdad(List<Alumnos> estudiantes) {
        
        int sumaEdades = 0;
/*Se crea el for Each que recorrera del objeto Alumnos cada elemento del tipo estudiante
pero en este caso solo para obtener el metodo edad, que se suma en cada iteracion*/
        for (Alumnos estudiante : estudiantes) {
            
            int edad = estudiante.getEdad();
            sumaEdades += edad;
        }

        return sumaEdades / estudiantes.size();
    }

    /*para hallar los estudiantes que se encuentran menor al promedio se recorre nuevamente
    en un for each, pero la lista que retorna es de tipo string, para usar el metodo .add sin ningun problema
    
    */
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
