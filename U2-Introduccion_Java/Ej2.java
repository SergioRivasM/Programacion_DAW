package PracticaJava;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {

        System.out.print("Introduzca un número entero para saber si es capicúa: ");
        Scanner teclado = new Scanner(System.in);

        long numeroIntroducido = teclado.nextInt();
        long numero = numeroIntroducido;
        long volteado = 0;

        while (numero > 0) {
            volteado = (volteado * 10) + (numero % 10);
            numero /= 10;
        }

        System.out.println("Si le damos la vuelta al " + numeroIntroducido + " tenemos el " + volteado);

        if (volteado == numeroIntroducido) {
            System.out.println("El número es capicúa");
        } else {
            System.out.println("El número no es capicúa");
        }
    }
}
