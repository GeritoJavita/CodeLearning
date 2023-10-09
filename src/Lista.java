import java.util.ArrayList;
import java.util.List;

class ListaEstudiantes {
    private List<Alumnos> estudiantes = new ArrayList<>();

    public void agregarEstudiante(Alumnos estudiante) {
        estudiantes.add(estudiante);
    }

    public List<Alumnos> getEstudiantes() {
        return estudiantes;
    }
}
