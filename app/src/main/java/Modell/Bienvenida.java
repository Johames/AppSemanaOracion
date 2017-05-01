package Modell;

/**
 * Created by USUARIO on 29/04/2017.
 */

public class Bienvenida {

    String id_bienvenida, bienvenida, director, datos, img;

    public Bienvenida(String id_bienvenida, String bienvenida, String director, String datos, String img) {
        this.id_bienvenida = id_bienvenida;
        this.bienvenida = bienvenida;
        this.director = director;
        this.datos = datos;
        this.img = img;
    }

    public String getId_bienvenida() {
        return id_bienvenida;
    }

    public void setId_bienvenida(String id_bienvenida) {
        this.id_bienvenida = id_bienvenida;
    }

    public String getBienvenida() {
        return bienvenida;
    }

    public void setBienvenida(String bienvenida) {
        this.bienvenida = bienvenida;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
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
        return this.bienvenida +", "+ this.director +", "+ this.datos +", "+ this.img;
    }
}
