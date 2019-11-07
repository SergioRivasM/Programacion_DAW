package EXAMEN_PROG;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        int cont = 0;
        int minimo = 0;
        int maximo = 0;
        int suma = 0;
        boolean primo;

        System.out.println("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo: ");
        do {
            numero = teclado.nextInt();
            if (numero <= 0) {
                System.out.println("Introduce un número positivo y mayor que cero");
                primo = false;
            } else {
                primo = true;
                for (int i = 2; i < numero; i++) {
                    if (numero % i == 0) {
                        primo = false;
                    }
                }
                if (!primo) {
                    cont++;
                    suma += numero;

                    if (cont == 1) {
                        minimo = numero;
                        maximo = numero;
                    } else {
                        if (numero > maximo) {
                            maximo = numero;
                        }
                        if (numero < minimo) {
                            minimo = numero;
                        }
                    }
                }
            }
        } while (numero <= 0 || !primo);

        if (cont == 0) {
            System.out.println("Ha introducido un número primo");
        } else {
            System.out.println("Ha introducido " + cont + " números no primos.");
            System.out.println("Máximo: " + maximo);
            System.out.println("Mínimo: " + minimo);
            System.out.println("Media: " + (double) suma / cont);
        }
    }
}