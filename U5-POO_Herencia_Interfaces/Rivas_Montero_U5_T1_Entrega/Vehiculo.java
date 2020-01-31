package POO_Garaje;

public abstract class Vehiculo {
    private String nombre;
    private int numpers;

    public Vehiculo(String nombre, int numpers) {
        this.nombre = nombre;
        this.numpers = numpers;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumpers() {
        return numpers;
    }

    public void setNumpers(int numpers) {
        this.numpers = numpers;
    }

    @Override
    public String toString() {
        return "Nombre = " + nombre + '\n' +
                "Número de personas = " + numpers + "\n";
    }
}