package Modell;

/**
 * Created by USUARIO on 29/04/2017.
 */

public class Mensajes {

    String id_mensajes, id, mensaje, n_remitente, t_remitente, receptor, estado;

    public Mensajes(String id_mensajes, String id, String mensaje, String n_remitente, String t_remitente, String receptor, String estado) {
        this.id_mensajes = id_mensajes;
        this.id = id;
        this.mensaje = mensaje;
        this.n_remitente = n_remitente;
        this.t_remitente = t_remitente;
        this.receptor = receptor;
        this.estado = estado;
    }

    public String getId_mensajes() {
        return id_mensajes;
    }

    public void setId_mensajes(String id_mensajes) {
        this.id_mensajes = id_mensajes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getN_remitente() {
        return n_remitente;
    }

    public void setN_remitente(String n_remitente) {
        this.n_remitente = n_remitente;
    }

    public String getT_remitente() {
        return t_remitente;
    }

    public void setT_remitente(String t_remitente) {
        this.t_remitente = t_remitente;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return this.mensaje +", "+ this.n_remitente +", "+ this.t_remitente +", "+ this.receptor +", "+ this.estado;
    }
}
