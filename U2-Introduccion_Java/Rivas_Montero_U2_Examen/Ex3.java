package EXAMEN_U2;

//Ahora que se acerca la notería de Navidad queremos saber si un número va a proporcionar suerte a un usuario.
// Solicitaremos a un usuario cuáles son sus 3 números favoritos y para calcular
// si un número le va a dar suerte dicho número tendrá más ocurrencias de esos números que de los demás.

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String num1 = "";
        String num2 = "";
        String num3 = "";
        String numLoteria = "";

        System.out.println("Introduzca su primer número favorito: ");
        num1 = teclado.next();

        System.out.println("Introduzca su segundo número favorito: ");
        num2 = teclado.next();

        System.out.println("Introduzca su tercer número favorito: ");
        num3 = teclado.next();


        System.out.println("Introduzca el número de la lotería: ");
        numLoteria = teclado.next();

        if (numLoteria.contains(num1) && numLoteria.contains(num2) && numLoteria.contains(num3)) {
            System.out.println("Este número le va a dar suerte");
        } else {
            System.out.println("Este número no le va a dar suerte");
        }
    }
}
