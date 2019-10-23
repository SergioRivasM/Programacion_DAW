package PracticaJava;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número para pasarlo a binario");
        int numero = teclado.nextInt();
        String binario = "";

        if (numero > 0) {
            while (numero > 0) {
                if (numero % 2 == 0) {
                    binario = "0" +binario;
                } else {
                    binario = "1" +binario;
                }
                numero = numero/2;
            }
        } else if (numero == 0) {
            binario = "0";
        } else {
            binario = "No se puede convertir, introduce un número positivo.";
        }
        System.out.println("El número pasado a binario es: " +binario);
    }
}