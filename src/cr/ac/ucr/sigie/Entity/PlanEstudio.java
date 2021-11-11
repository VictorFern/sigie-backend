package cr.ac.ucr.sigie.Entity;

public class PlanEstudio {


    private int planEstudioId;
    private String nombre;
    private int anoAprovacion;
    private  int cantidadCiclos;
    private  int codigoCarrera;
    private String nombreCarrera;


    public PlanEstudio() {
        this.planEstudioId = 0;
        this.nombre = "";
        this.anoAprovacion = 0;
        this.cantidadCiclos = 0;
        this.codigoCarrera = 0;
        this.nombreCarrera = "";
    }

    public PlanEstudio(int planEstudioId, String nombre, int anoAprovacion, int cantidadCiclos, int codigoCarrera, String nombreCarrera) {
        this.planEstudioId = planEstudioId;
        this.nombre = nombre;
        this.anoAprovacion = anoAprovacion;
        this.cantidadCiclos = cantidadCiclos;
        this.codigoCarrera = codigoCarrera;
        this.nombreCarrera = nombreCarrera;
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
}
