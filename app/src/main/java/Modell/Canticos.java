package Modell;

/**
 * Created by USUARIO on 29/04/2017.
 */

public class Canticos {

    String id_cantico, numero, titulo, letra;

    public Canticos(String id_cantico, String numero, String titulo, String letra) {
        this.id_cantico = id_cantico;
        this.numero = numero;
        this.titulo = titulo;
        this.letra = letra;
    }

    public String getId_cantico() {
        return id_cantico;
    }

    public void setId_cantico(String id_cantico) {
        this.id_cantico = id_cantico;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return this.numero +", "+ this.titulo +", "+ this.letra;
    }
}
