package cr.ac.ucr.sigie.Entity;

public class SubContenido {
    private int idSubContenido;
    private String subContenido;
    private int ordenSubContenido;

    public SubContenido() {
    }

    public SubContenido(int idSubContenido, String subContenido, int ordenSubContenido) {
        this.idSubContenido = idSubContenido;
        this.subContenido = subContenido;
        this.ordenSubContenido = ordenSubContenido;
    }

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
