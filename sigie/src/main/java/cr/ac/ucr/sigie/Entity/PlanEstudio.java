package cr.ac.ucr.sigie.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class PlanEstudio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int planEstudioId;

    @Column(name = "nombre", unique = false, length = 30, nullable = false)
    private String nombre;

    @Column(name = "anoAprovacion", unique = false, nullable = false)
    private int anoAprovacion;

    @Column(name = "cantidadCiclos", unique = false, nullable = false)
    private  int cantidadCiclos;

    @Column(name = "codigoCarrera", unique = false, nullable = false)
    private  int codigoCarrera;

    @Column(name = "nombreCarrera", unique = false, length = 100, nullable = false)
    private String nombreCarrera;

    @ElementCollection
    @CollectionTable(name="UnidadAcademica", joinColumns = @JoinColumn(name="unidadAcademicaId"))
    @Column(name = "unidadAcademicaPropietarias", unique = false, nullable = true)
    private List<UnidadAcademica> unidadAcademicaPropietarias;

    @ElementCollection
    @CollectionTable(name="Enfasis", joinColumns = @JoinColumn(name="enfasisId"))
    @Column(name = "enfasis", unique = false, nullable = true)
    private List<Enfasis> enfasis;

    public PlanEstudio() {}

    public int getPlanEstudioId() {
        return planEstudioId;
    }

    public void setPlanEstudioId(int planEstudioId) {
        this.planEstudioId = planEstudioId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnoAprovacion() {
        return anoAprovacion;
    }

    public void setAnoAprovacion(int anoAprovacion) {
        this.anoAprovacion = anoAprovacion;
    }

    public int getCantidadCiclos() {
        return cantidadCiclos;
    }

    public void setCantidadCiclos(int cantidadCiclos) {
        this.cantidadCiclos = cantidadCiclos;
    }

    public int getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(int codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public List<UnidadAcademica> getUnidadAcademicaPropietarias() {
        return unidadAcademicaPropietarias;
    }

    public void setUnidadAcademicaPropietarias(List<UnidadAcademica> unidadAcademicaPropietarias) {
        this.unidadAcademicaPropietarias = unidadAcademicaPropietarias;
    }

    public List<Enfasis> getEnfasis() {
        return enfasis;
    }

    public void setEnfasis(List<Enfasis> enfasis) {
        this.enfasis = enfasis;
    }
}
