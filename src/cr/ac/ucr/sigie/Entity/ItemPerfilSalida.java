package cr.ac.ucr.sigie.Entity;

import java.util.ArrayList;
import java.util.List;

public class ItemPerfilSalida {
    private int idPerfilSalida;
    private String descripcion;
    private List<TipoItemPerfilSalida> tiposPerfilSalida;

    public ItemPerfilSalida() {
        this.tiposPerfilSalida = new ArrayList<TipoItemPerfilSalida>();
    }

    public ItemPerfilSalida(int idPerfilSalida, String descripcion, List<TipoItemPerfilSalida> tiposPerfilSalida) {
        this.idPerfilSalida = idPerfilSalida;
        this.descripcion = descripcion;
        this.tiposPerfilSalida = tiposPerfilSalida;
    }

    public int getIdPerfilSalida() {
        return idPerfilSalida;
    }

    public void setIdPerfilSalida(int idPerfilSalida) {
        this.idPerfilSalida = idPerfilSalida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<TipoItemPerfilSalida> getTiposPerfilSalida() {
        return tiposPerfilSalida;
    }

    public void setTiposPerfilSalida(List<TipoItemPerfilSalida> tiposPerfilSalida) {
        this.tiposPerfilSalida = tiposPerfilSalida;
    }
}
