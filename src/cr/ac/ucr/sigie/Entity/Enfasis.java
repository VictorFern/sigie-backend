package cr.ac.ucr.sigie.Entity;

import java.util.ArrayList;
import java.util.List;

public class Enfasis {
    private int enfasisId;
    private String nombre;
    private List<Curso> cursos;

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public Enfasis() {
        this.cursos = new ArrayList<Curso>();
    }

    public Enfasis(int enfasisId, String nombre) {
        this.enfasisId = enfasisId;
        this.nombre = nombre;
    }

    public int getEnfasisId() {
        return enfasisId;
    }

    public void setEnfasisId(int enfasisId) {
        this.enfasisId = enfasisId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
