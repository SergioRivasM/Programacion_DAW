package com.company;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;

public class Concurso {
    Map<String, Perro> raza = new HashMap<>();

    String perro;
    String nombre;
    String localidad;

    public Concurso(String perro, String nombre, String localidad) {
        this.perro = perro;
        this.nombre = nombre;
        this.localidad = localidad;
    }

    public void disqualifyDog() {

    }

    public void ownerDogs(int num) {

    }

    public void perrosPorPeso(String raza){
        LinkedList<Integer> listaPeso = new LinkedList<>();

        Collections.sort(listaPeso);
        System.out.println(listaPeso);

        Collections.reverse(listaPeso);
        System.out.println(listaPeso);
    }

    public void perrosPorEdad(String raza){
        LinkedList<Integer> listaEdad = new LinkedList<>();

        Collections.sort(listaEdad);
        System.out.println(listaEdad);

        Collections.reverse(listaEdad);
        System.out.println(listaEdad);
    }

    public void cargarPerros(){
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("perros.dat"));

            while (true) {
                Perro p = (Perro) ois.readObject();

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}