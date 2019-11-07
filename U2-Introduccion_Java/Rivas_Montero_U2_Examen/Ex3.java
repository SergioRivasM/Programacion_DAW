package EXAMEN_PROG;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número por pantalla: ");
        long num = teclado.nextLong();
        String num2 = Integer.toString((int) num);
        String aparece = "";
        String noAparece = "";

        if (num2.contains("0")) {
            aparece = aparece + "0 ";
        } else {
            noAparece = noAparece + "0 ";
        }

        if (num2.contains("1")) {
            aparece = aparece + "1 ";
        } else {
            noAparece = noAparece + "1 ";
        }

        if (num2.contains("2")) {
            aparece = aparece + "2 ";
        } else {
            noAparece = noAparece + "2 ";
        }

        if (num2.contains("3")) {
            aparece = aparece + "3 ";
        } else {
            noAparece = noAparece + "3 ";
        }

        if (num2.contains("4")) {
            aparece = aparece + "4 ";
        } else {
            noAparece = noAparece + "4 ";
        }

        if (num2.contains("5")) {
            aparece = aparece + "5 ";
        } else {
            noAparece = noAparece + "5 ";
        }

        if (num2.contains("6")) {
            aparece = aparece + "6 ";
        } else {
            noAparece = noAparece + "6 ";
        }

        if (num2.contains("7")) {
            aparece = aparece + "7 ";
        } else {
            noAparece = noAparece + "7 ";
        }

        if (num2.contains("8")) {
            aparece = aparece + "8 ";
        } else {
            noAparece = noAparece + "8 ";
        }

        if (num2.contains("9")) {
            aparece = aparece + "9 ";
        } else {
            noAparece = noAparece + "9 ";
        }

        System.out.println("Dígitos que aparecen en el número: " + aparece);
        System.out.println("Dígitos que no aparecen: " + noAparece);

    }
}