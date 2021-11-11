package cr.ac.ucr.sigie.Entity;

public class Modalidad {
    private int modalidadId;
    private String tipoModalidad;
    private List<Curso> cursos;

    public Modalidad() {
        this.cursos = new ArrayList<Curso>();
    }

    public Modalidad(int modalidadId, String tipoModalidad, List<Curso> cursos) {
        this.modalidadId = modalidadId;
        this.tipoModalidad = tipoModalidad;
        this.cursos = cursos;
    }

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
