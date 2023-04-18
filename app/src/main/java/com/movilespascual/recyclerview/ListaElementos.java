package com.movilespascual.recyclerview;

public class ListaElementos {
    public  String color, name, ciudad, estado, correo;

    public ListaElementos(String color, String name, String ciudad, String estado, String mail) {
        this.color = color;
        this.name = name;
        this.ciudad = ciudad;
        this.estado = estado;
        this.correo = mail;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMail() {
        return correo;
    }

    public void setMail(String mail) {
        this.correo = mail;
    }

    public String getLetra() {
        String laPrimera= name.substring(0, 1);
        return laPrimera;
    }
}
