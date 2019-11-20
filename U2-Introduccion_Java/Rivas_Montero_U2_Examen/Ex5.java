package EXAMEN_U2;

//Escribir un programa que incremente la hora de un reloj tantos segundos como le solicitemos mostrando cada vez la hora nueva.
//Se solicitará al usuario por teclado las horas, los minutos y los segundos y el número de segundos que se quiere aumentar la hora.

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int hora = 0;
        int min = 0;
        int seg = 0;
        int incrSeg = 0;

        System.out.println("Introduzca horas: ");
        hora = teclado.nextInt();

        System.out.println("Introduzca minutos: ");
        min = teclado.nextInt();

        System.out.println("Introduzca segundos: ");
        seg = teclado.nextInt();

        System.out.println("Introduzca los segundos a incrementar: ");
        incrSeg = teclado.nextInt();

        for (int i=seg; i<seg+incrSeg; seg++) {
            if (min==59 && seg==59) {
                min = 00;
                seg = 00;
                hora++;
            }
            System.out.println(hora+":"+min+":"+seg);
        }
    }
}