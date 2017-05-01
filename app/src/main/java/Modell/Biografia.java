package Modell;

/**
 * Created by USUARIO on 29/04/2017.
 */

public class Biografia {

    String id_biografia, ponente, datos, img;

    public Biografia(String id_biografia, String ponente, String datos, String img) {
        this.id_biografia = id_biografia;
        this.ponente = ponente;
        this.datos = datos;
        this.img = img;
    }

    public String getId_biografia() {
        return id_biografia;
    }

    public void setId_biografia(String id_biografia) {
        this.id_biografia = id_biografia;
    }

    public String getPonente() {
        return ponente;
    }

    public void setPonente(String ponente) {
        this.ponente = ponente;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return this.ponente +", "+ this.datos +", "+ this.img;
    }
}
