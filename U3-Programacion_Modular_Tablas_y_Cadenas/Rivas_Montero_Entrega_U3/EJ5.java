package ENTREGA_U3;

public class EJ5 {
    public static void main(String[] args) {
        int[] tabla = {129,456,707,597,214,777,982};

        System.out.println("El número aleatorio elegido de la tabla es el "+aleatorioDeArray(tabla));
    }

    public static int aleatorioDeArray(int[] a) {
        int random = (int)(Math.random()*a.length);

        return a[random];
    }
}