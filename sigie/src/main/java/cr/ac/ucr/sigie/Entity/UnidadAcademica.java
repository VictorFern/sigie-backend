package cr.ac.ucr.sigie.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class UnidadAcademica implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int unidadAcademicaId;

    @Column(name = "tipoUnidadAcademica", unique = false, length = 50, nullable = false)
    private String tipoUnidadAcademica;

    @ElementCollection
    @CollectionTable(name="Curso", joinColumns = @JoinColumn(name="cursoId"))
    @Column(name = "curosPropios", unique = false, nullable = true)
    private List<Curso> curosPropios;

    @ElementCollection
    @CollectionTable(name="PlanEstudio", joinColumns = @JoinColumn(name="planEstudioId"))
    @Column(name = "planEstudios", unique = false, nullable = true)
    private List<PlanEstudio> planEstudios;

    public UnidadAcademica() {}

    public List<Curso> getCurosPropios() {
        return curosPropios;
    }

    public void setCurosPropios(List<Curso> curosPropios) {
        this.curosPropios = curosPropios;
    }

    public List<PlanEstudio> getPlanEstudios() {
        return planEstudios;
    }

    public void setPlanEstudios(List<PlanEstudio> planEstudios) {
        this.planEstudios = planEstudios;
    }

    public UnidadAcademica(int unidadAcademicaId, String tipoUnidadAcademica, List<Curso> curosPropios, List<PlanEstudio> planEstudios) {
        this.unidadAcademicaId = unidadAcademicaId;
        this.tipoUnidadAcademica = tipoUnidadAcademica;
        this.curosPropios = curosPropios;
        this.planEstudios = planEstudios;
    }

    public int getUnidadAcademicaId() {
        return unidadAcademicaId;
    }

    public void setUnidadAcademicaId(int unidadAcademicaId) {
        this.unidadAcademicaId = unidadAcademicaId;
    }

    public String getTipoUnidadAcademica() {
        return tipoUnidadAcademica;
    }

    public void setTipoUnidadAcademica(String tipoUnidadAcademica) {
        this.tipoUnidadAcademica = tipoUnidadAcademica;
    }
}
