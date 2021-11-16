package cr.ac.ucr.sigie.Entity;

import java.util.ArrayList;

public class TipoItemPerfilEntrada {

    private int idTipo;
    private String nombreTipo;
    private ArrayList<ItemPerfilEntrada> itemesPerfilEntrada;

    public TipoItemPerfilEntrada() {
        this.idTipo = 0;
        this.nombreTipo = "";
        this.itemesPerfilEntrada = null;
    }


    public TipoItemPerfilEntrada(int idTipo, String nombreTipo, ArrayList<ItemPerfilEntrada> itemesPerfilEntrada) {
        this.idTipo = idTipo;
        this.nombreTipo = nombreTipo;
        this.itemesPerfilEntrada = itemesPerfilEntrada;
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

    public ArrayList<ItemPerfilEntrada> getItemesPerfilEntrada() {
        return itemesPerfilEntrada;
    }

    public void setItemesPerfilEntrada(ArrayList<ItemPerfilEntrada> itemesPerfilEntrada) {
        this.itemesPerfilEntrada = itemesPerfilEntrada;
    }
}
