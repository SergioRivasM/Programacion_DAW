package com.company;

public class Propietario {
    private String nombre;
    private String apellidos;
    private int num;
    private String pais;

    public Propietario(String nombre, String apellidos, int num, String pais) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.num = num;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Propietario:" +
                "Nombre = " + nombre + "\n" +
                "Apellidos = " + apellidos + "\n" +
                "Número socio = " + num +
                "Pais = " + pais;
    }
}