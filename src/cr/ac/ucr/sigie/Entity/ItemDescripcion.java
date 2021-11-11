package cr.ac.ucr.sigie.Entity;

public class ItemDescripcion {
    private int idDescripcion,ordenDescripcion;
    private String detalleDescripcion;

    public ItemDescripcion() {
    }

    public ItemDescripcion(int idDescripcion, int ordenDescripcion, String detalleDescripcion) {
        this.idDescripcion = idDescripcion;
        this.ordenDescripcion = ordenDescripcion;
        this.detalleDescripcion = detalleDescripcion;
    }

    public int getIdDescripcion() {
        return idDescripcion;
    }

    public void setIdDescripcion(int idDescripcion) {
        this.idDescripcion = idDescripcion;
    }

    public int getOrdenDescripcion() {
        return ordenDescripcion;
    }

    public void setOrdenDescripcion(int ordenDescripcion) {
        this.ordenDescripcion = ordenDescripcion;
    }

    public String getDetalleDescripcion() {
        return detalleDescripcion;
    }

    public void setDetalleDescripcion(String detalleDescripcion) {
        this.detalleDescripcion = detalleDescripcion;
    }

}
