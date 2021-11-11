package cr.ac.ucr.sigie.Entity;

public class Modalidad {
    private int modalidadId;
    private String tipoModalidad;

    public Modalidad() {

    }

    public Modalidad(int modalidadId, String tipoModalidad) {
        this.modalidadId = modalidadId;
        this.tipoModalidad = tipoModalidad;
    }

    public int getModalidadId() {
        return modalidadId;
    }

    public void setModalidadId(int modalidadId) {
        this.modalidadId = modalidadId;
    }

    public String getTipoModalidad() {
        return tipoModalidad;
    }

    public void setTipoModalidad(String tipoModalidad) {
        this.tipoModalidad = tipoModalidad;
    }
}
