package EXAMEN_U2;

//Realizar un programa que dado un número que se solicita la usuario por consola eliminará de ese número
//todos los 0 y todos los 8 indicando adicionalmente cuántos números ha eliminado. Deberá solicitar el número mientras que
//el número introducido no sea positivo.

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num = 0;
        int numElim = 0;
        int cont = 0;

        System.out.println("Introduzca un número entero positivo: ");
        num = teclado.nextInt();

        while (num>0) {
            for (int i=0; i<num; i++) {
            num=num/10;
            num=cont;
            }
            System.out.println(cont);

            if (num==0) {
                numElim++;
            }

        }

    }
}