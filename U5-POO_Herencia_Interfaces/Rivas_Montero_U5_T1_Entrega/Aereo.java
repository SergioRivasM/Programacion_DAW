package POO_Garaje;

public abstract class Aereo extends Vehiculo {
    private int altitud;
    private int codigo;

    public Aereo(String nombre, int numpers, int altitud, int codigo) {
        super(nombre, numpers);
        this.altitud = altitud;
        this.codigo = codigo;
    }

    public int getAltitud() {
        return altitud;
    }

    public void setAltitud(int altitud) {
        this.altitud = altitud;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Altitud = " + altitud + "\n" +
                "Código = " + codigo + "\n";
    }
}