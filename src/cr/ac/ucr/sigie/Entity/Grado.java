package cr.ac.ucr.sigie.Entity;

import java.util.ArrayList;
import java.util.List;

public class Grado {
    private int idGrado;
    private String nombre;
    private int totalCreditosMaximo;
    private int totalCreditosMinimo;
    private List<PlanEstudio> planesEstudio;

    public Grado() {
        this.planesEstudio = new ArrayList<PlanEstudio>();
    }

    public Grado(int idGrado, String nombre, int totalCreditosMaximo, int totalCreditosMinimo) {
        this.idGrado = idGrado;
        this.nombre = nombre;
        this.totalCreditosMaximo = totalCreditosMaximo;
        this.totalCreditosMinimo = totalCreditosMinimo;
    }

    public int getIdGrado() {
        return idGrado;
    }

    public void setIdGrado(int idGrado) {
        this.idGrado = idGrado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTotalCreditosMaximo() {
        return totalCreditosMaximo;
    }

    public void setTotalCreditosMaximo(int totalCreditosMaximo) {
        this.totalCreditosMaximo = totalCreditosMaximo;
    }

    public int getTotalCreditosMinimo() {
        return totalCreditosMinimo;
    }

    public void setTotalCreditosMinimo(int totalCreditosMinimo) {
        this.totalCreditosMinimo = totalCreditosMinimo;
    }

    public List<PlanEstudio> getPlanesEstudio() {
        return planesEstudio;
    }

    public void setPlanesEstudio(List<PlanEstudio> planesEstudio) {
        this.planesEstudio = planesEstudio;
    }
}
