package POO_RPG;

public class Mago extends Hombre{
    private int longbarba;

    public int getLongbarba() {
        return longbarba;
    }

    public void setLongbarba(int longbarba) {
        this.longbarba = longbarba;
    }

    public Mago(String nombre, int energia, int ataque, int defensa, boolean encantado, int longbarba) {
        super(nombre, energia, ataque, defensa, encantado);
        this.longbarba = longbarba;
    }

    @Override
    public String toString() {
        return super.toString() + "Longitud barba = " +longbarba+ '\n';
    }

    public boolean encantar(String nombre) {
        if (isEncantado() == false) {
            return true;
        }
        return isEncantado();
    }

    public boolean desencantar(String nombre) {
        if (isEncantado() == true) {
            return false;
        }
        return isEncantado();
    }
}