package POO_RPG;

public class Enano extends Personaje implements Atacar{
    private int altura;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Enano(String nombre, int energia, int ataque, int defensa, boolean encantado, int altura) {
        super(nombre, energia, ataque, defensa, encantado);
        this.altura = altura;
    }

    @Override
    public String toString() {
        return super.toString() + "Altura = " +altura+ '\n';
    }

    public String atacarPersonaje(String nombre) {
        return getNombre() + " ATACANDO";
    }
}
