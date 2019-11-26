package ENTREGA_U3;

import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int personas = 0;
        int [] ocupacion = {3,2,0,2,4,1,0,2,1,1};
        boolean hueco= false;

        System.out.println("¿Cuántos son? (Introduzca -1 para salir del programa");
        personas = teclado.nextInt();

        while (personas != -1) {
            while (personas > 4) {
                System.out.println("Lo siento, no admitimos grupos de 6, haga grupos de 4 personas\n" +
                        "como máximo e intente de nuevo");
                System.out.println("¿Cuántos son? (Introduzca -1 para salir del programa)");
                personas = teclado.nextInt();
            }

            if (personas == -1) {
                System.out.println("Gracias. Hasta pronto.");
            }

            for (int i = 0; i < ocupacion.length; i++) {
                if (ocupacion[i] == 0) {
                    System.out.println("Por favor, siéntense en la mesa número " + (i + 1));
                    ocupacion[i] = personas;
                    break;
                }

                if (ocupacion[i] + personas < 4) {
                    System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número " + (i + 1));
                    ocupacion[i] += personas;
                    break;
                }
            }
        }
    }
}
