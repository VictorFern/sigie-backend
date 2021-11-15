package cr.ac.ucr.sigie.Entity;

import java.util.ArrayList;
import java.util.List;

public class TipoItemPerfilSalida {
    private int idTipo;
    private String nombreTipo;


    public TipoItemPerfilSalida() {

    }

    public TipoItemPerfilSalida(int idTipo, String nombreTipo) {
        this.idTipo = idTipo;
        this.nombreTipo = nombreTipo;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

}
