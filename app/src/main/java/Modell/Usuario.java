package Modell;

/**
 * Created by USUARIO on 29/04/2017.
 */

public class Usuario {

    String id_usuario, id_user, id_per, usuario, password, estado;

    public Usuario(String id_usuario, String id_user, String id_per, String usuario, String password, String estado) {
        this.id_usuario = id_usuario;
        this.id_user = id_user;
        this.id_per = id_per;
        this.usuario = usuario;
        this.password = password;
        this.estado = estado;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getId_per() {
        return id_per;
    }

    public void setId_per(String id_per) {
        this.id_per = id_per;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return this.usuario +", "+ this.password +", "+ this.estado;
    }

}
