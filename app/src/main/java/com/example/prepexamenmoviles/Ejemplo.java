package com.example.prepexamenmoviles;

public class Ejemplo {

    String titulo;
    String subtitulo;
    int numero;

    public Ejemplo() {
    }

    public Ejemplo(String titulo, String subtitulo, int numero) {
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + "\n" +
                "Subtitulo: " + subtitulo + "\n" +
                "Numero: " + numero;
    }
}
