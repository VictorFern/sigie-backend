package cr.ac.ucr.sigie.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Area implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int areaid;

    @Column(name = "nombre", unique = false, length = 30, nullable = false)
    private String nombre;

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "area",
            orphanRemoval = true)
    private List<Curso> cursos;

    public Area() {}

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
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
