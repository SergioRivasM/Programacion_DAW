package EXAMEN_PROG;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la altura: ");
        int altura = teclado.nextInt();

        if (altura < 5 && altura % 2 == 0) {
            System.out.println("El numero tiene que ser impar y mayor o igual que 5.");
        } else {
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < 5; j++) {
                    if (i == 0 || i == altura - 1 || i == altura / 2 || j == 0 || j == 4) {
                        System.out.print("M");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
