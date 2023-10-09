import java.util.List;

public class Operar {
    public static void LlenarLista() {
        ListaEstudiantes listaEstudiantes = new ListaEstudiantes();
        Cadena guardarCadena = new Cadena();
        Alumnos estudiante;
        System.out.println("Si desea finalizar, escriba la palabra fin");
        while (true) {
            estudiante = GetDato.capturarEstudiante(guardarCadena);
            if (estudiante.getNombre().equalsIgnoreCase("fin")) {
                break;
            }
            listaEstudiantes.agregarEstudiante(estudiante);
        }
    

    
       
        Numero guardarEntero = new Numero();
        List<Alumnos> estudiantes = listaEstudiantes.getEstudiantes();
        double promedio = Metodos.calcularPromedioEdad(estudiantes);
        
        List<String> estudiantesFiltrados = Metodos.ObtenerEstudiantesMenoresAlPromedio(estudiantes, promedio);
        guardarEntero.setA(estudiantesFiltrados.size());
       
        // Establecer el promedio de edad en guardarCadena
        guardarCadena.setX("Promedio de Edad: " + promedio + " Número de estudiantes con edad menor o igual al promedio + 1 mes: " + guardarEntero.getA() +"\n" + //
                "son: "+ estudiantesFiltrados+"\n" +" Total de estudiantes:" + Metodos.ObtenerCantidad(estudiantes));
        System.out.println(guardarCadena.getX());
    }
}
