package cr.ac.ucr.sigie.Entity;

public class UnidadAcademica {

   private int unidadAcademicaId;
   private String tipoUnidadAcademica;


    public UnidadAcademica() {
        this.unidadAcademicaId = 0;
        this.tipoUnidadAcademica = "";
    }


    public UnidadAcademica(int unidadAcademicaId, String tipoUnidadAcademica) {
        this.unidadAcademicaId = unidadAcademicaId;
        this.tipoUnidadAcademica = tipoUnidadAcademica;
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
