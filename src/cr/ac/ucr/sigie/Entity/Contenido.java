package cr.ac.ucr.sigie.Entity;

import java.util.ArrayList;
import java.util.List;

public class Contenido {
    private int idContenido;
    private String tema;
    private int ordenContenido;
    private List<SubContenido> idSubContenidos;

    public Contenido() {
        this.idSubContenidos = new ArrayList<SubContenido>();
    }

    public Contenido(int idContenido, String tema, int ordenContenido, List<SubContenido> idSubContenidos) {
        this.idContenido = idContenido;
        this.tema = tema;
        this.ordenContenido = ordenContenido;
        this.idSubContenidos = idSubContenidos;
    }

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

    public List<SubContenido> getIdSubContenidos() {
        return idSubContenidos;
    }

    public void setIdSubContenidos(List<SubContenido> idSubContenidos) {
        this.idSubContenidos = idSubContenidos;
    }
}
