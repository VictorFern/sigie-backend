package cr.ac.ucr.sigie.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.List;

@Entity
public class Curso implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cursoId;

    @Column(name = "nombre", unique = false, length = 30, nullable = false)
    private String nombre;

    @Column(name = "ciclo", unique = false, nullable = false)
    private int ciclo;

    @Column(name = "sigla", unique = false, length = 10, nullable = false)
    private String sigla;

    @Column(name = "creditos", unique = false, nullable = false)
    private int creditos;

    @Column(name = "objetivoGeneral", unique = false, length = 500, nullable = false)
    private String objetivoGeneral;

    @Column(name = "anoEnQueSeImparte", unique = false, nullable = false)
    private int anoEnQueSeImparte;

    @Column(name = "horasTeoria", unique = false, nullable = false)
    private int horasTeoria;

    @Column(name = "horasPractica", unique = false, nullable = false)
    private int horasPractica;

    @Column(name = "horasLaboratorio", unique = false, nullable = false)
    private int horasLaboratorio;

    @Column(name = "horasTeoriaPractica", unique = false, nullable = false)
    private int horasTeoriaPractica;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "areaid")
    private Area area;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "modalidadId")
    private Modalidad modalidad;

    @ElementCollection
    @CollectionTable(name="Curso", joinColumns=@JoinColumn(name="cursoId"))
    @Column(name = "electivos", unique = false, nullable = false)
    private List<Curso> electivos;

    @ElementCollection
    @CollectionTable(name="Curso", joinColumns = @JoinColumn(name="cursoId"))
    @Column(name = "requisitos", unique = false, nullable = true)
    private List<Curso> requisitos;

    @ElementCollection
    @CollectionTable(name="Curso", joinColumns = @JoinColumn(name="cursoId"))
    @Column(name = "correquisitos", unique = false, nullable = true)
    private List<Curso> correquisitos;

    @ElementCollection
    @CollectionTable(name="ResultadoAprendizaje", joinColumns = @JoinColumn(name="idResultado"))
    @Column(name = "resultadoAprendizaje", unique = false, nullable = true)
    private List<ResultadoAprendizaje> resultadoAprendizaje;

    @ElementCollection
    @CollectionTable(name="ItemDescripcion", joinColumns = @JoinColumn(name="idDescripcion"))
    @Column(name = "itemesDescripcion", unique = false, nullable = true)
    private List<ItemDescripcion> itemesDescripcion;

    @ElementCollection
    @CollectionTable(name="ReferenciaBibliografica", joinColumns = @JoinColumn(name="idReferencia"))
    @Column(name = "referencias", unique = false, nullable = true)
    private List<ReferenciaBibliografica> referencias;

    @ElementCollection
    @CollectionTable(name="Contenido", joinColumns = @JoinColumn(name="idContenido"))
    @Column(name = "contenidos", unique = false, nullable = true)
    private List<Contenido> contenidos;

    @ElementCollection
    @CollectionTable(name="UnidadAcademica", joinColumns = @JoinColumn(name="unidadAcademicaId"))
    @Column(name = "unidadAcademicaPropetarias", unique = false, nullable = true)
    private List<UnidadAcademica> unidadAcademicaPropetarias;

    @ElementCollection
    @CollectionTable(name="Enfasis", joinColumns = @JoinColumn(name="enfasisId"))
    @Column(name = "enfasis", unique = false, nullable = true)
    private List<Enfasis> enfasis;

    public Curso() {}

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

    public List<Curso> getElectivos() {
        return electivos;
    }

    public void setElectivos(List<Curso> electivos) {
        this.electivos = electivos;
    }

    public List<Curso> getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(List<Curso> requisitos) {
        this.requisitos = requisitos;
    }

    public List<Curso> getCorrequisitos() {
        return correquisitos;
    }

    public void setCorrequisitos(List<Curso> correquisitos) {
        this.correquisitos = correquisitos;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public List<ResultadoAprendizaje> getResultadoAprendizaje() {
        return resultadoAprendizaje;
    }

    public void setResultadoAprendizaje(List<ResultadoAprendizaje> resultadoAprendizaje) {
        this.resultadoAprendizaje = resultadoAprendizaje;
    }

    public List<ItemDescripcion> getItemesDescripcion() {
        return itemesDescripcion;
    }

    public void setItemesDescripcion(List<ItemDescripcion> itemesDescripcion) {
        this.itemesDescripcion = itemesDescripcion;
    }

    public List<ReferenciaBibliografica> getReferencias() {
        return referencias;
    }

    public void setReferencias(List<ReferenciaBibliografica> referencias) {
        this.referencias = referencias;
    }

    public Modalidad getModalidad() {
        return modalidad;
    }

    public void setModalidad(Modalidad modalidad) {
        this.modalidad = modalidad;
    }

    public List<Contenido> getContenidos() {
        return contenidos;
    }

    public void setContenidos(List<Contenido> contenidos) {
        this.contenidos = contenidos;
    }

    public List<UnidadAcademica> getUnidadAcademicaPropetarias() {
        return unidadAcademicaPropetarias;
    }

    public void setUnidadAcademicaPropetarias(List<UnidadAcademica> unidadAcademicaPropetarias) {
        this.unidadAcademicaPropetarias = unidadAcademicaPropetarias;
    }
}
