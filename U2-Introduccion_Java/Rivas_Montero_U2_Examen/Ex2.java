package EXAMEN_PROG;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num = 0;
        int pos = 0;

        while (num <10) {
            System.out.println("Por favor, introduzca un número entero positivo: ");
            num = teclado.nextInt();
        }

        int aux = num;
        int cont = 0;
        while (aux > 0) {
            aux = aux / 10;
            cont++;
        }

        while (pos < 2) {
            System.out.println("Introduzca la posición a partir de la cual quiere partir el número: ");
            pos = teclado.nextInt();
        }

        aux = num;
        for (int i = pos; i <= cont; i++) {
            aux = aux / 10;
        }

        System.out.print("El primer número es el " + aux);

        for (int i = pos; i <= cont; i++) {
            aux = aux * 10;
        }
        System.out.print(" y el segundo número es el " + (num - aux));
    }
}