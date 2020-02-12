package POO_RPG;

public class Elfo extends Personaje implements Atacar{
    private Tipo tipo;

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Elfo(String nombre, int energia, int ataque, int defensa, boolean encantado, Tipo tipo) {
        super(nombre, energia, ataque, defensa, encantado);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "Tipo = " +tipo+ '\n';
    }

    public String atacarPersonaje(String nombre) {
        return getNombre() + " ATACANDO";
    }
}