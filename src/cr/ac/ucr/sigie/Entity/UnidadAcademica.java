package cr.ac.ucr.sigie.Entity;

import java.util.ArrayList;
import java.util.List;

public class UnidadAcademica {

   private int unidadAcademicaId;
   private String tipoUnidadAcademica;
   private List<Curso> curosPropios;
    private List<PlanEstudio> planEstudios;


    public UnidadAcademica() {
        this.unidadAcademicaId = 0;
        this.tipoUnidadAcademica = "";
        this.curosPropios = new ArrayList<Curso>();
        this.planEstudios = new ArrayList<PlanEstudio>();
    }


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
