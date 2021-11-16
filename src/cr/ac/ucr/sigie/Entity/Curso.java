package cr.ac.ucr.sigie.Entity;

import java.util.ArrayList;

public class Curso {

    private int cursoId;
    private String nombre;
    private int ciclo;
    private String sigla;
    private int creditos;
    private String objetivoGeneral;
    private int anoEnQueSeImparte;
    private int horasTeoria;
    private int horasPractica;
    private int horasLaboratorio;
    private int horasTeoriaPractica;
    private ArrayList<Curso> electivos;
    private ArrayList<Curso> requisitos;
    private ArrayList<Curso> correquisitos;
    private Area area;
    private ArrayList<ResultadoAprendizaje> resultadoAprendizaje;
    private ArrayList<ItemDescripcion> itemesDescripcion;
    private ArrayList<ReferenciaBibliografica> referencias;
    private Modalidad modalidad;
    private ArrayList<Contenido> contenidos;
    private ArrayList<UnidadAcademica> unidadAcademicaPropetarias;
    private ArrayList<Enfasis> enfasis;



    public Curso() {
        this.cursoId = 0;
        this.nombre = "";
        this.ciclo = 0;
        this.sigla = "";
        this.creditos = 0;
        this.objetivoGeneral = "";
        this.anoEnQueSeImparte = 0;
        this.horasTeoria = 0;
        this.horasPractica = 0;
        this.horasLaboratorio = 0;
        this.horasTeoriaPractica = 0;
        this.electivos = null;
        this.requisitos = null;
        this.correquisitos = null;
        this.area = null;
        this.resultadoAprendizaje = null;
        this.itemesDescripcion = null;
        this.referencias = null;
        this.modalidad = null;
        this.contenidos = null;
        this.unidadAcademicaPropetarias = null;
        this.enfasis = null;
    }


    public Curso(int cursoId, String nombre, int ciclo, String sigla, int creditos, String objetivoGeneral, int anoEnQueSeImparte, int horasTeoria, int horasPractica, int horasLaboratorio, int horasTeoriaPractica, ArrayList<Curso> electivos, ArrayList<Curso> requisitos, ArrayList<Curso> correquisitos, Area area, ArrayList<ResultadoAprendizaje> resultadoAprendizaje, ArrayList<ItemDescripcion> itemesDescripcion, ArrayList<ReferenciaBibliografica> referencias, Modalidad modalidad, ArrayList<Contenido> contenidos, ArrayList<UnidadAcademica> unidadAcademicaPropetarias, ArrayList<Enfasis> enfasis) {
        this.cursoId = cursoId;
        this.nombre = nombre;
        this.ciclo = ciclo;
        this.sigla = sigla;
        this.creditos = creditos;
        this.objetivoGeneral = objetivoGeneral;
        this.anoEnQueSeImparte = anoEnQueSeImparte;
        this.horasTeoria = horasTeoria;
        this.horasPractica = horasPractica;
        this.horasLaboratorio = horasLaboratorio;
        this.horasTeoriaPractica = horasTeoriaPractica;
        this.electivos = electivos;
        this.requisitos = requisitos;
        this.correquisitos = correquisitos;
        this.area = area;
        this.resultadoAprendizaje = resultadoAprendizaje;
        this.itemesDescripcion = itemesDescripcion;
        this.referencias = referencias;
        this.modalidad = modalidad;
        this.contenidos = contenidos;
        this.unidadAcademicaPropetarias = unidadAcademicaPropetarias;
        this.enfasis = enfasis;
    }

    public int getCursoId() {
        return cursoId;
    }

    public void setCursoId(int cursoId) {
        this.cursoId = cursoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getObjetivoGeneral() {
        return objetivoGeneral;
    }

    public void setObjetivoGeneral(String objetivoGeneral) {
        this.objetivoGeneral = objetivoGeneral;
    }

    public int getAnoEnQueSeImparte() {
        return anoEnQueSeImparte;
    }

    public void setAnoEnQueSeImparte(int anoEnQueSeImparte) {
        this.anoEnQueSeImparte = anoEnQueSeImparte;
    }

    public int getHorasTeoria() {
        return horasTeoria;
    }

    public void setHorasTeoria(int horasTeoria) {
        this.horasTeoria = horasTeoria;
    }

    public int getHorasPractica() {
        return horasPractica;
    }

    public void setHorasPractica(int horasPractica) {
        this.horasPractica = horasPractica;
    }

    public int getHorasLaboratorio() {
        return horasLaboratorio;
    }

    public void setHorasLaboratorio(int horasLaboratorio) {
        this.horasLaboratorio = horasLaboratorio;
    }

    public int getHorasTeoriaPractica() {
        return horasTeoriaPractica;
    }

    public void setHorasTeoriaPractica(int horasTeoriaPractica) {
        this.horasTeoriaPractica = horasTeoriaPractica;
    }

    public ArrayList<Curso> getElectivos() {
        return electivos;
    }

    public void setElectivos(ArrayList<Curso> electivos) {
        this.electivos = electivos;
    }

    public ArrayList<Curso> getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(ArrayList<Curso> requisitos) {
        this.requisitos = requisitos;
    }

    public ArrayList<Curso> getCorrequisitos() {
        return correquisitos;
    }

    public void setCorrequisitos(ArrayList<Curso> correquisitos) {
        this.correquisitos = correquisitos;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public ArrayList<ResultadoAprendizaje> getResultadoAprendizaje() {
        return resultadoAprendizaje;
    }

    public void setResultadoAprendizaje(ArrayList<ResultadoAprendizaje> resultadoAprendizaje) {
        this.resultadoAprendizaje = resultadoAprendizaje;
    }

    public ArrayList<ItemDescripcion> getItemesDescripcion() {
        return itemesDescripcion;
    }

    public void setItemesDescripcion(ArrayList<ItemDescripcion> itemesDescripcion) {
        this.itemesDescripcion = itemesDescripcion;
    }

    public ArrayList<ReferenciaBibliografica> getReferencias() {
        return referencias;
    }

    public void setReferencias(ArrayList<ReferenciaBibliografica> referencias) {
        this.referencias = referencias;
    }

    public Modalidad getModalidad() {
        return modalidad;
    }

    public void setModalidad(Modalidad modalidad) {
        this.modalidad = modalidad;
    }

    public ArrayList<Contenido> getContenidos() {
        return contenidos;
    }

    public void setContenidos(ArrayList<Contenido> contenidos) {
        this.contenidos = contenidos;
    }

    public ArrayList<UnidadAcademica> getUnidadAcademicaPropetarias() {
        return unidadAcademicaPropetarias;
    }

    public void setUnidadAcademicaPropetarias(ArrayList<UnidadAcademica> unidadAcademicaPropetarias) {
        this.unidadAcademicaPropetarias = unidadAcademicaPropetarias;
    }
}
