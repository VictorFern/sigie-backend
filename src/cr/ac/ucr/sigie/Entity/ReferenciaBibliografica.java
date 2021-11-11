package cr.ac.ucr.sigie.Entity;

public class ReferenciaBibliografica {
    private int idReferencia;
    private String referencia;

    public ReferenciaBibliografica() {
    }

    public ReferenciaBibliografica(int idReferencia, String referencia) {
        this.idReferencia = idReferencia;
        this.referencia = referencia;
    }

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
