package cr.ac.ucr.sigie.Entity;

import java.util.ArrayList;
import java.util.List;

public class PlanEstudio {


    private int planEstudioId;
    private String nombre;
    private int anoAprovacion;
    private  int cantidadCiclos;
    private  int codigoCarrera;
    private String nombreCarrera;
    private List<UnidadAcademica> unidadAcademicaPropietarias;
    private List<Enfasis> enfasis;
    private List<ItemPerfilSalida> itemesPerfilSalida;


    public PlanEstudio() {
        this.planEstudioId = 0;
        this.nombre = "";
        this.anoAprovacion = 0;
        this.cantidadCiclos = 0;
        this.codigoCarrera = 0;
        this.nombreCarrera = "";
        this.unidadAcademicaPropietarias = new ArrayList<UnidadAcademica>();
        this.enfasis = new ArrayList<Enfasis>();
        this.itemesPerfilSalida = new ArrayList<ItemPerfilSalida>();
    }

    public PlanEstudio(int planEstudioId, String nombre, int anoAprovacion, int cantidadCiclos, int codigoCarrera, String nombreCarrera, List<UnidadAcademica> unidadAcademicaPropietarias, List<Enfasis> enfasis) {
        this.planEstudioId = planEstudioId;
        this.nombre = nombre;
        this.anoAprovacion = anoAprovacion;
        this.cantidadCiclos = cantidadCiclos;
        this.codigoCarrera = codigoCarrera;
        this.nombreCarrera = nombreCarrera;
        this.unidadAcademicaPropietarias = unidadAcademicaPropietarias;
        this.enfasis = enfasis;
    }

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

    public List<ItemPerfilSalida> getItemesPerfilSalida() {
        return itemesPerfilSalida;
    }

    public void setItemesPerfilSalida(List<ItemPerfilSalida> itemesPerfilSalida) {
        this.itemesPerfilSalida = itemesPerfilSalida;
    }
}
