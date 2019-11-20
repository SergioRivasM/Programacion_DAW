package EXAMEN_U2;

//Escribe un programa que pinte por pantalla un par de calcetines, de los que se ponen al lado del árbol de
// Navidad para que Papá Noel deje sus regalos.
//El usuario debe introducir la altura. Suponemos que el usuario introduce una altura mayor o igual a 4.
// Observa que la talla de los calcetines y la distancia
//que hay entre ellos (dos espacios) no cambia, lo único que varía es la altura.

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int altura = 0;

        System.out.println("Introduzca la altura de los calcetines:");
        altura = teclado.nextInt();

        if (altura>=4) {
            for (int i=0; i<altura; i++) {
                for (int j=0; j<altura/2; j++) {
                    if (i==0) {
                        System.out.println("***     ***");
                    } else if (j==0){
                        System.out.println("******  ******");
                    }
                }
            }
        }
    }
}
