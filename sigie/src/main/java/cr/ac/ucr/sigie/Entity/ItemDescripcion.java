package cr.ac.ucr.sigie.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class ItemDescripcion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDescripcion;

    @Column(name = "ordenDescripcion", unique = false, nullable = false)
    private int ordenDescripcion;

    @Column(name = "detalleDescripcion", length = 500, unique = false, nullable = false)
    private String detalleDescripcion;

    public ItemDescripcion() {}

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
