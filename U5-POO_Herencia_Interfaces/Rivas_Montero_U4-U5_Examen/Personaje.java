package POO_RPG;

import java.util.Objects;

public abstract class Personaje {
   private String nombre;
   private int energia;
   private int ataque;
   private int defensa;
   private boolean encantado;

    public Personaje(String nombre, int energia, int ataque, int defensa, boolean encantado) {
        this.nombre = nombre;
        this.energia = energia;
        this.ataque = ataque;
        this.defensa = defensa;
        this.encantado = encantado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public boolean isEncantado() {
        return encantado;
    }

    public void setEncantado(boolean encantado) {
        this.encantado = encantado;
    }

    @Override
    public String toString() {
        return "Nombre = " +nombre+ '\n' +
                "Energía = " +energia+ '\n' +
                "Ataque = " +ataque+ '\n' +
                "Defensa = " +defensa+ '\n' +
                "Encantado = " +encantado+ '\n';
    }

    public void mostrarEstado() {


    }
}