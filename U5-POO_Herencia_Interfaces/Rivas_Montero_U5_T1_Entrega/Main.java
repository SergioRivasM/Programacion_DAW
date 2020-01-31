package POO_Garaje;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Coche[] coches = new Coche[3];

        Coche coche1 = new Coche("Opel", 5, "1864ALC", 2013, Color.ROJO);
        Coche coche2 = new Coche("Renault", 5, "5531BKM", 2011, Color.AMARILLO);
        Coche coche3 = new Coche("Mazda", 5, "9821CZM", 2009, Color.AZUL);

        coches[0] = coche3;
        coches[1] = coche2;
        coches[2] = coche1;

        Arrays.sort(coches);

        System.out.println();
        System.out.println("---COCHES---");
        System.out.println(Arrays.deepToString(coches));


        Motocicleta[] motocicletas = new Motocicleta[3];

        Motocicleta motocicleta1 = new Motocicleta("Honda", 2, "1532GTX", 2005, Color.AMARILLO);
        Motocicleta motocicleta2 = new Motocicleta("Suzuki", 2, "9312GTC", 2006, Color.ROJO);
        Motocicleta motocicleta3 = new Motocicleta("Kawasaki", 2, "9437PLZ", 2007, Color.VERDE);

        motocicletas[0] = motocicleta3;
        motocicletas[1] = motocicleta1;
        motocicletas[2] = motocicleta2;

        Arrays.sort(motocicletas);

        System.out.println();
        System.out.println("---MOTOCICLETAS---");
        System.out.println(Arrays.deepToString(motocicletas));

        Helicoptero helicoptero1 = new Helicoptero("Falcon", 9, 500, 1234);
        Avioneta avioneta1 = new Avioneta("Hydra", 3, 700, 4321);

        System.out.println();
        System.out.println("---HELICÓPTERO---");
        System.out.println(helicoptero1);

        System.out.println();
        System.out.println("---AVIONETA---");
        System.out.println(avioneta1);

    }
}