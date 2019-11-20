package EXAMEN_U2;

//Escribe un programa que pida un número entero positivo por teclado y que
//muestre a continuación los 5 números consecutivos a partir del número
//introducido. Al lado de cada número se debe indicar si se trata de un primo
//o no.

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        boolean esPrimo;

        System.out.println("Por favor, introduzca un número entero positivo: ");
        num = teclado.nextInt();
        esPrimo = true;

        for (int i=num; i<num+5; i++) {
                if (i%num==0) {
                    esPrimo = false;
                    System.out.println("El número " + i + " no es primo");
                } else {
                    esPrimo = true;
                    System.out.println("El número " + i + " es primo");
                }
            }
    }
}
