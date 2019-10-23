package PracticaJava;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        int altura;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la altura");

        altura = teclado.nextInt();

        while (altura < 3 || altura % 2 == 0) {
            System.out.println("El número debe ser impar y mayor que 3. Introduce de nuevo la altura de la figura");
            altura = teclado.nextInt();
        }

        //PARTE DE ARRIBA
        for (int i = 0; i < (altura / 2) + 1; i++) {
            //pinta los espacios
            for (int j = 0; j < (altura / 2) - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                //pinta los asteriscos
                if (j == 0) {
                    System.out.print("*     *");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //PARTE DE ABAJO
        for (int i = 1; i < (altura / 2)+1; i++) {
            //pinta los espacios
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < altura - i; j++) {
                //pinta los asteriscos
                if (j == 0) {
                    System.out.print("*     *");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
