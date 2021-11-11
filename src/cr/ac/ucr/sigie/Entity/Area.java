package cr.ac.ucr.sigie.Entity;

public class Area {
    
    private int areaid;
    private String nombre;

    public Area() {
        this.areaid = 0;
        this.nombre = "";
    }

    public Area(int areaid, String nombre) {
        this.areaid = areaid;
        this.nombre = nombre;
    }

    public int getAreaid() {
        return areaid;
    }

    public void setAreaid(int areaid) {
        this.areaid = areaid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
