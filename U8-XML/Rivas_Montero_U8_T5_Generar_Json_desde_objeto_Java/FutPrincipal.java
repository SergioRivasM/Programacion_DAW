package JSON_Seleccion;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.Arrays;

public class FutPrincipal {
    public static void main(String[] args) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        ArrayList<Futbolista> alineacion = new ArrayList<>();

        alineacion.add(new Futbolista(1, "Casillas", Arrays.asList("Portero"), "Real Madrid"));
        alineacion.add(new Futbolista(15, "Ramos", Arrays.asList("Lateral derecho", "Medio centro"), "Real Madrid"));
        alineacion.add(new Futbolista(3, "Piqué", Arrays.asList("Central"), "FC Barcelona"));
        alineacion.add(new Futbolista(5, "Puyol", Arrays.asList("Central"), "FC Barcelona"));
        alineacion.add(new Futbolista(11, "Capdevila", Arrays.asList("Lateral izquierdo"), "Villareal"));
        alineacion.add(new Futbolista(14, "Xabi Alonso", Arrays.asList("Defensa mediocampo", "Mediocampo"), "Real Madrid"));
        alineacion.add(new Futbolista(16, "Busquets", Arrays.asList("Defensa mediocampo"), "FC Barcelona"));
        alineacion.add(new Futbolista(8, "Xavi Hernández", Arrays.asList("Mediocampo"), "FC Barcelona"));
        alineacion.add(new Futbolista(18, "Pedrito", Arrays.asList("Extremo izquierdo", "Falso extremo"), "FC Barcelona"));
        alineacion.add(new Futbolista(6, "Iniesta", Arrays.asList("Extremo derecho", "Mediocampo"), "FC Barcelona"));
        alineacion.add(new Futbolista(7, "Villa", Arrays.asList("Delantero centro"), "FC Barcelona"));

        System.out.print(gson.toJson(alineacion));

    }
}