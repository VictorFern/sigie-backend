package cr.ac.ucr.sigie.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class SubContenido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSubContenido;

    @Column(name = "subContenido", unique = false, length = 500, nullable = false)
    private String subContenido;

    @Column(name = "ordenSubContenido", unique = false, nullable = false)
    private int ordenSubContenido;

    public SubContenido() {}

    public int getIdSubContenido() {
        return idSubContenido;
    }

    public void setIdSubContenido(int idSubContenido) {
        this.idSubContenido = idSubContenido;
    }

    public String getSubContenido() {
        return subContenido;
    }

    public void setSubContenido(String subContenido) {
        this.subContenido = subContenido;
    }

    public int getOrdenSubContenido() {
        return ordenSubContenido;
    }

    public void setOrdenSubContenido(int ordenSubContenido) {
        this.ordenSubContenido = ordenSubContenido;
    }
}
