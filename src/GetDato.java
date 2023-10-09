import java.time.LocalDate;
import java.util.Scanner;
class GetDato {
    public static int CapturarOpcion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el índice:");
        return scanner.nextInt();
    }

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
        System.out.println("Ingrese la Fecha de nacimiento de: " + texto.getX() + " AAAA-MM-DD:");
        String fechaCumpleañosStr = scanner.next();
        LocalDate fechaCumpleaños = LocalDate.parse(fechaCumpleañosStr);
        return new Alumnos(texto.getX(), fechaCumpleaños);
    }
}    