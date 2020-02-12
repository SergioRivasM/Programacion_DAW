package POO_RPG;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Personaje[] personajes = new Personaje[10];

        Elfo elfo1 = new Elfo("Mitri", 300, 90, 60, false, Tipo.BOSQUE);
        Orco orco1 = new Orco("Mordor", 500, 60, 70, false, 90);
        Enano enano1 = new Enano("Thorin", 150, 70, 40, true, 100);
        Guerrero guerrero1 = new Guerrero("Squall", 600, 100, 70, false, 20);
        Mago mago1 = new Mago("Leviathan", 800, 90, 50, false, 30);
        Mago mago2 = new Mago("Ifrit", 1000, 100, 80, false, 60);
        Elfo elfo2 = new Elfo("Sifrid", 700, 70, 40, true, Tipo.COSTA);

        personajes[0] = elfo1;
        personajes[1] = orco1;
        personajes[2] = enano1;
        personajes[3] = guerrero1;
        personajes[4] = mago1;
        personajes[5] = mago2;
        personajes[6] = elfo2;

        System.out.println();
        System.out.println("---PERSONAJES---");
        System.out.println(Arrays.deepToString(personajes));

        System.out.println("-----------------------------------------");

        Elfo elfoataca = new Elfo("Mitri", 300, 90, 60, false, Tipo.BOSQUE);
        Orco orcoataca = new Orco("Mordor", 500, 60, 70, false, 90);
        Enano enanoataca = new Enano("Thorin", 150, 70, 40, true, 100);
        Guerrero guerreroataca = new Guerrero("Squall", 90, 100, 70, false, 20);

        System.out.println(elfoataca.atacarPersonaje("Mitri"));
        System.out.println(orcoataca.atacarPersonaje("Mordor"));
        System.out.println(enanoataca.atacarPersonaje("Thorin"));
        System.out.println(guerreroataca.atacarPersonaje("Squall"));

        System.out.println();

        System.out.println("--ENCANTAMIENTO");
        Mago mago3 = new Mago("Shiva", 800, 90, 50, false, 30);
        System.out.println(mago3.encantar("Shiva"));

        System.out.println("--DESENCANTAMIENTO--");
        Mago mago4 = new Mago("Mogu", 800, 90, 50, true, 30);
        System.out.println(mago3.desencantar("Mogu"));
    }
}