package POO_Garaje;

import INT_Instituto.Profesor;

public abstract class Terrestre extends Vehiculo implements Comparable {
    private String matricula;
    private int aniofab;
    private Color color;

    public Terrestre(String nombre, int numpers, String matricula, int aniofab, Color color) {
        super(nombre, numpers);
        this.matricula = matricula;
        this.aniofab = aniofab;
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAniofab() {
        return aniofab;
    }

    public void setAniofab(int aniofab) {
        this.aniofab = aniofab;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Matrícula = " + matricula + '\n' +
                "Año de fabricación = " + aniofab + "\n" +
                "Color = " + color + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Terrestre terrestre = (Terrestre) o;
        return getMatricula().equals(terrestre.getMatricula());
    }

    @Override
    public int compareTo(Object o) {
        Terrestre p = (Terrestre) o;
        return getMatricula().compareTo(p.getMatricula());
    }
}