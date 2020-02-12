package POO_RPG;

public class Guerrero extends Hombre implements Atacar{
    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Guerrero(String nombre, int energia, int ataque, int defensa, boolean encantado, int edad) {
        super(nombre, energia, ataque, defensa, encantado);
        this.edad = edad;
    }

    @Override
    public String toString() {
        return super.toString() + "Edad = " +edad+ '\n';
    }

    public String atacarPersonaje(String nombre) {
        return getNombre() + " ATACANDO";
    }
}