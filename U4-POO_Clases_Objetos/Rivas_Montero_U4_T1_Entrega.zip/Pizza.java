package POO_Pizzeria;

/**
 * @author Sergio Rivas Montero
 */

/**
 * Atributos de la clase.
 */
public class Pizza {
    public enum Size {mediana,familiar};
    private Size size;
    private Ingrediente[] ingredientes = new Ingrediente[3];
    private int numIngredientes;

    /**
     * Constructor de la clase.
     */
    public Pizza() {
        numIngredientes = 0;
        Ingrediente i = new Ingrediente();
        this.ingredientes[numIngredientes] = i;
        numIngredientes++;

        Ingrediente i2 = new Ingrediente("Jamón",500);
        this.ingredientes[numIngredientes] = i2;
        numIngredientes++;
        this.size = Size.familiar;
    }

    /**
     * Constructor de la clase, en el que metemos los ingredientes en sus posiciones.
     * @param size
     * @param ingredientes
     */
    public Pizza(Size size, Ingrediente[] ingredientes) {
        for (int i = 0; i < ingredientes.length; i++) {
            if (i < 3) {
                this.ingredientes[i] = ingredientes[i];
                numIngredientes++;
            }
        }
        //this.ingredientes = ingredientes;
        this.size = size;
    }

    /**
     * Método para contar los ingredientes de la pizza (no devuelve nada).
     */
    public void contarIngredientes() {
        for (int i = 0; i < ingredientes.length; i++) {
            if (numIngredientes < 3);
            numIngredientes++;
        }
    }

    /**
     * Método boolean para añadir ingredientes en las posiciones correspondientes del array
     * de ingredientes (devuelve true si son menos de 3 ingredientes, en caso contrario devuelve false).
     * @param ingrediente
     * @return
     */
    public boolean addIngrediente(Ingrediente ingrediente) {
        if (numIngredientes == 3) {
            return false;
        } else {
            for (int i = 0; i < ingredientes.length; i++) {
                this.ingredientes[i] = ingredientes[i];
                numIngredientes++;
            }
        }
        return true;
    }

    /**
     * Método que muestra información de la pizza (tamaño e ingredientes).
     */
    public void mostrarInfo() {
        for (int i = 0; i < ingredientes.length; i++) {

        }
    }
}