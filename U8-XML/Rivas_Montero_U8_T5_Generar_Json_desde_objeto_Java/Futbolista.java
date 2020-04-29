package JSON_Seleccion;

import java.util.List;

public class Futbolista {
    private int dorsal;
    private String nombre;
    private List posicion;
    private String equipo;

    public Futbolista(int dorsal, String nombre, List posicion, String equipo) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.posicion = posicion;
        this.equipo = equipo;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List getPosicion() {
        return posicion;
    }

    public void setPosicion(List posicion) {
        this.posicion = posicion;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
}