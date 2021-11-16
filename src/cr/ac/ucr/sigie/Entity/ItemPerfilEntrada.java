package cr.ac.ucr.sigie.Entity;

public class ItemPerfilEntrada {


    private int idTipoPerfilEntrada;
    private String descripcion;
    private PlanEstudio planEstudio;
    private TipoItemPerfilEntrada tipoItemPerfilEntrada;


    public ItemPerfilEntrada() {
        this.idTipoPerfilEntrada = 0;
        this.descripcion = "";
        this.planEstudio = null;
        this.tipoItemPerfilEntrada = null;
    }


    public ItemPerfilEntrada(int idTipoPerfilEntrada, String descripcion, PlanEstudio planEstudio, TipoItemPerfilEntrada tipoItemPerfilEntrada) {
        this.idTipoPerfilEntrada = idTipoPerfilEntrada;
        this.descripcion = descripcion;
        this.planEstudio = planEstudio;
        this.tipoItemPerfilEntrada = tipoItemPerfilEntrada;
    }

    public int getIdTipoPerfilEntrada() {
        return idTipoPerfilEntrada;
    }

    public void setIdTipoPerfilEntrada(int idTipoPerfilEntrada) {
        this.idTipoPerfilEntrada = idTipoPerfilEntrada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public PlanEstudio getPlanEstudio() {
        return planEstudio;
    }

    public void setPlanEstudio(PlanEstudio planEstudio) {
        this.planEstudio = planEstudio;
    }

    public TipoItemPerfilEntrada getTipoItemPerfilEntrada() {
        return tipoItemPerfilEntrada;
    }

    public void setTipoItemPerfilEntrada(TipoItemPerfilEntrada tipoItemPerfilEntrada) {
        this.tipoItemPerfilEntrada = tipoItemPerfilEntrada;
    }
}
