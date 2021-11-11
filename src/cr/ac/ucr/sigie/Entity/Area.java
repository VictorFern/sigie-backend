package cr.ac.ucr.sigie.Entity;

import java.util.ArrayList;
import java.util.List;

public class Area {
    
    private int areaid;
    private String nombre;
    private List<Curso> cursos;

    public Area() {
        this.areaid = 0;
        this.nombre = "";
        this.cursos = new ArrayList<Curso>();
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public Area(int areaid, String nombre, List<Curso> cursos) {
        this.areaid = areaid;
        this.nombre = nombre;
        this.cursos = cursos;
    }

    public int getAreaid() {
        return areaid;
    }

    public void setAreaid(int areaid) {
        this.areaid = areaid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
