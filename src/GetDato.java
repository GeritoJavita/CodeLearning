import java.time.LocalDate;
import java.util.Scanner;
class GetDato {
    public static int CapturarOpcion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el índice:");
        return scanner.nextInt();
    }
/* Capturar estudiante, tiene como parametros un objeto de tipo
cadena que es el que guarda los mensajes tipo string
en este caso para guardar el nombre */
    public static Alumnos capturarEstudiante(Cadena texto) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre del estudiante: ");
        String nombre = scanner.nextLine();
        texto.setX(nombre);

      /*   String genero;
        while (true) {
            System.out.print("Género del estudiante (F para femenino, M para masculino): ");
            genero = scanner.nextLine().trim();
            texto.setX(genero);
            if (genero.equalsIgnoreCase("F") || genero.equalsIgnoreCase("M")) {
                break;
            } else {
                System.out.println("Género no válido. Por favor, ingresa 'F' o 'M'.");
            }
        }
*/      

/*Para la fecha de nacimiento se llama la funcion .parse pra convertir en un objeto
localdatetime cualquier cadena de texto ingresada */
        System.out.println("Ingrese la Fecha de nacimiento de: " + texto.getX() + " AAAA-MM-DD:");
        String fechaCumpleañosStr = scanner.next();
        LocalDate fechaCumpleaños = LocalDate.parse(fechaCumpleañosStr);

        /*Los paramentos que regresa son del objeto alumno creado, donde se obtiene 
        el nombre y su fecha de cumpleaños o nacimiento */
        return new Alumnos(texto.getX(), fechaCumpleaños);
    }
}    