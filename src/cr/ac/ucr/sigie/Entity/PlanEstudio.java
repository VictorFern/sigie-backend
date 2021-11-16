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
    private ArrayList<UnidadAcademica> unidadAcademicaPropietarias;
    private ArrayList<Enfasis> enfasis;
    private ArrayList<ItemPerfilSalida> itemesPerfilSalida;
    private ArrayList<ItemPerfilEntrada> itemesPerfilEntrada;
    private Grado grado;


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
        this.itemesPerfilEntrada = new ArrayList<ItemPerfilEntrada>();
        this.grado = null;
    }

    public PlanEstudio(int planEstudioId, String nombre, int anoAprovacion, int cantidadCiclos, int codigoCarrera, String nombreCarrera, ArrayList<UnidadAcademica> unidadAcademicaPropietarias, ArrayList<Enfasis> enfasis, ArrayList<ItemPerfilSalida> itemesPerfilSalida, ArrayList<ItemPerfilEntrada> itemesPerfilEntrada, Grado grado) {
        this.planEstudioId = planEstudioId;
        this.nombre = nombre;
        this.anoAprovacion = anoAprovacion;
        this.cantidadCiclos = cantidadCiclos;
        this.codigoCarrera = codigoCarrera;
        this.nombreCarrera = nombreCarrera;
        this.unidadAcademicaPropietarias = unidadAcademicaPropietarias;
        this.enfasis = enfasis;
        this.itemesPerfilSalida = itemesPerfilSalida;
        this.itemesPerfilEntrada = itemesPerfilEntrada;
        this.grado = grado;
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

    public void setUnidadAcademicaPropietarias(ArrayList<UnidadAcademica> unidadAcademicaPropietarias) {
        this.unidadAcademicaPropietarias = unidadAcademicaPropietarias;
    }

    public List<Enfasis> getEnfasis() {
        return enfasis;
    }

    public void setEnfasis(ArrayList<Enfasis> enfasis) {
        this.enfasis = enfasis;
    }

    public List<ItemPerfilSalida> getItemesPerfilSalida() {
        return itemesPerfilSalida;
    }

    public void setItemesPerfilSalida(ArrayList<ItemPerfilSalida> itemesPerfilSalida) {
        this.itemesPerfilSalida = itemesPerfilSalida;
    }

    public ArrayList<ItemPerfilEntrada> getItemesPerfilEntrada() {
        return itemesPerfilEntrada;
    }

    public void setItemesPerfilEntrada(ArrayList<ItemPerfilEntrada> itemesPerfilEntrada) {
        this.itemesPerfilEntrada = itemesPerfilEntrada;
    }

    public Grado getGrado() {
        return grado;
    }

    public void setGrado(Grado grado) {
        this.grado = grado;
    }
}
