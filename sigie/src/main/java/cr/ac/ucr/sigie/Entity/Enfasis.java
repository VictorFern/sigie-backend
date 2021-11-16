package cr.ac.ucr.sigie.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Enfasis implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int enfasisId;

    @Column(name = "nombre", unique = false, length = 30, nullable = false)
    private String nombre;

    @ElementCollection
    @CollectionTable(name="Curso", joinColumns = @JoinColumn(name="cursoId"))
    @Column(name = "cursos", unique = false, nullable = false)
    private List<Curso> cursos;

    public Enfasis() {}

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
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
