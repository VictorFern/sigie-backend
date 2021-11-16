package cr.ac.ucr.sigie.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Contenido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContenido;

    @Column(name = "tema", unique = false, length = 30, nullable = false)
    private String tema;

    @Column(name = "ordenContenido", unique = false, nullable = false)
    private int ordenContenido;

    @ElementCollection
    @CollectionTable(name="SubContenido", joinColumns = @JoinColumn(name="idSubContenido"))
    @Column(name = "subContenidos", unique = false, nullable = true)
    private List<SubContenido> subContenidos;

    public Contenido() {}

    public int getIdContenido() {
        return idContenido;
    }

    public void setIdContenido(int idContenido) {
        this.idContenido = idContenido;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getOrdenContenido() {
        return ordenContenido;
    }

    public void setOrdenContenido(int ordenContenido) {
        this.ordenContenido = ordenContenido;
    }

    public List<SubContenido> getsubContenidos() {
        return subContenidos;
    }

    public void setsubContenidos(List<SubContenido> subContenidos) {
        this.subContenidos = subContenidos;
    }
}
