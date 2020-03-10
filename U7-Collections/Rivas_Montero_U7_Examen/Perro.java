package com.company;

import java.util.HashSet;
import java.util.Set;

public class Perro {
    Set<String> perros = new HashSet<>();

    private String nombre;
    private int edad;
    private int peso;
    private boolean vacunado;
    private String propietario;
    private String raza;

    public Perro(String nombre, int edad, int peso, boolean vacunado, String propietario, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.vacunado = vacunado;
        this.propietario = propietario;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro:" +
                "Nombre = " + nombre + '\'' +
                "Edad = " + edad + "\n" +
                "Peso = " + peso + "\n" +
                "Vacunado = " + vacunado + "\n" +
                "Propietario = " + propietario + "\n" +
                "Raza = " + raza;
    }
}