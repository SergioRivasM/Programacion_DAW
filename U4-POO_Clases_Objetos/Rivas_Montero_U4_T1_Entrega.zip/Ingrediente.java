package POO_Pizzeria;

/**
 * @author Sergio Rivas Montero
 */

/**
 * Atributos de la clase.
 */
public class Ingrediente {
    private String nombre;
    private int calorias;

    /**
     * Constructor por defecto de la clase.
     */
    public Ingrediente() {
        this.nombre = "Queso";
        this.calorias = 250;
    }

    /**
     * Constructor de la clase.
     * @param nombre
     * @param calorias
     */
    public Ingrediente(String nombre, int calorias) {
        this.nombre = nombre;
        this.calorias = calorias;
    }

    /**
     * Get del atributo nombre.
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set del atributo nombre.
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Get del atributo calorias.
     * @return
     */
    public int getCalorias() {
        return calorias;
    }

    /**
     * Set del atributo calorias.
     * @param calorias
     */
    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
}