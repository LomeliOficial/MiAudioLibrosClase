package com.example.chema_pc.miaudiolibrosclase.modelo;

/**
 * Created by Chema-pc on 15/09/2016.
 */
public class BookInfo {
    String Nombre;
    String Autor;
    int resourceImg;

    public BookInfo(String nombre, String autor, int resourceImg, String url) {
        Nombre = nombre;
        Autor = autor;
        this.resourceImg = resourceImg;
        this.url = url;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getResourceImg() {
        return resourceImg;
    }

    public void setResourceImg(int resourceImg) {
        this.resourceImg = resourceImg;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    String url;
}
