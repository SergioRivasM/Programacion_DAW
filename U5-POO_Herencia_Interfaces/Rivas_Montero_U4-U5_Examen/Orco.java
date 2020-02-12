package POO_RPG;

public class Orco extends Personaje implements Atacar{
    private int tonelaje;

    public int getTonelaje() {
        return tonelaje;
    }

    public void setTonelaje(int tonelaje) {
        this.tonelaje = tonelaje;
    }

    public Orco(String nombre, int energia, int ataque, int defensa, boolean encantado, int tonelaje) {
        super(nombre, energia, ataque, defensa, encantado);
        this.tonelaje = tonelaje;
    }

    @Override
    public String toString() {
        return super.toString() + "Tonelaje = " +tonelaje+ '\n';
    }

    public String atacarPersonaje(String nombre) {
        return getNombre() + " ATACANDO";
    }
}
