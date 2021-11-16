package cr.ac.ucr.sigie.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Modalidad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int modalidadId;

    @Column(name = "tipoModalidad", unique = false, length = 30, nullable = false)
    private String tipoModalidad;

    @ElementCollection
    @CollectionTable(name="Curso", joinColumns = @JoinColumn(name="cursoId"))
    @Column(name = "cursos", unique = false, nullable = true)
    private List<Curso> cursos;

    public Modalidad() {}

    public int getModalidadId() {
        return modalidadId;
    }

    public void setModalidadId(int modalidadId) {
        this.modalidadId = modalidadId;
    }

    public String getTipoModalidad() {
        return tipoModalidad;
    }

    public void setTipoModalidad(String tipoModalidad) {
        this.tipoModalidad = tipoModalidad;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

}
