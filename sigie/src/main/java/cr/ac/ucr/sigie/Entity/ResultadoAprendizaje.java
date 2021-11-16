package cr.ac.ucr.sigie.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class ResultadoAprendizaje implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idResultado;

    @Column(name = "sentenciaResultado", unique = false, length = 500, nullable = false)
    private String sentenciaResultado;

    public ResultadoAprendizaje() {}

    public int getIdResultado() {
        return idResultado;
    }

    public void setIdResultado(int idResultado) {
        this.idResultado = idResultado;
    }

    public String getSentenciaResultado() {
        return sentenciaResultado;
    }

    public void setSentenciaResultado(String sentenciaResultado) {
        this.sentenciaResultado = sentenciaResultado;
    }
}
