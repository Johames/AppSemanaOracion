package Modell;

/**
 * Created by USUARIO on 29/04/2017.
 */

public class Contactos {

    String id_contactos, id, nombre, telefono, datos, img;

    public Contactos(String id_contactos, String id, String nombre, String telefono, String datos, String img) {
        this.id_contactos = id_contactos;
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.datos = datos;
        this.img = img;
    }

    public String getId_contactos() {
        return id_contactos;
    }

    public void setId_contactos(String id_contactos) {
        this.id_contactos = id_contactos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
        return this.nombre +", "+ this.telefono +", "+ this.datos +", "+ this.img;
    }
}
