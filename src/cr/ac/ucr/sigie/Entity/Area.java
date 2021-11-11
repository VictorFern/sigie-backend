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

    public Area(int areaid, String nombre) {
        this.areaid = areaid;
        this.nombre = nombre;
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
