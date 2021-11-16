package cr.ac.ucr.sigie.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class ReferenciaBibliografica implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReferencia;

    @Column(name = "referencia", unique = false, length = 100, nullable = false)
    private String referencia;

    public ReferenciaBibliografica() {}

    public int getIdReferencia() {
        return idReferencia;
    }

    public void setIdReferencia(int idReferencia) {
        this.idReferencia = idReferencia;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
}
