package cr.ac.ucr.sigie.Entity;

public class ResultadoAprendizaje {

    private int idResultado;
    private String sentenciaResultado;


    public ResultadoAprendizaje() {
        this.idResultado = 0;
        this.sentenciaResultado = "";
    }


    public ResultadoAprendizaje(int idResultado, String sentenciaResultado) {
        this.idResultado = idResultado;
        this.sentenciaResultado = sentenciaResultado;
    }

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
