package PracticaJava;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        float nota1;
        float nota2;
        float nota3;
        float notaMedia = 0;
        float recuperacion = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la primera nota del examen");
        nota1 = teclado.nextFloat();

        System.out.println("Introduce la segunda nota del examen");
        nota2 = teclado.nextFloat();

        notaMedia = (nota1 + nota2) / 2;

        if (notaMedia >= 5 && notaMedia < 6) {
            System.out.println("Tu nota media de Programación es: " + notaMedia + " Suficiente");
        } else if (notaMedia >= 6 && notaMedia < 7) {
            System.out.println("Tu nota media de Programación es: " + notaMedia + " Bien");
        } else if (notaMedia >= 7 && notaMedia < 9) {
            System.out.println("Tu nota media de Programación es: " + notaMedia + " Notable");
        } else if (notaMedia >= 9) {
            System.out.println("Tu nota media de Programación es: " + notaMedia + " Sobresaliente");
        } else {
            System.out.println("Suspendiste, ¿Cuál ha sido la nota de la recuperación?\n 1.Apto 2.No apto");
            recuperacion = teclado.nextFloat();

            if (recuperacion == 1) {
                System.out.println("Has aprobado la recuperación, tu nota será un 5");
            } else {
                System.out.println("No has recuperado el examen, tu nota media es la dada anteriormente.");
            }

        }
    }
}
