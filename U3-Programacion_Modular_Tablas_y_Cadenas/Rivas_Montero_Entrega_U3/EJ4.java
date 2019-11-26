package ENTREGA_U3;

import java.util.Arrays;

public class EJ4 {
    public static void main(String[] args) {
        int [] tabla = {1,2,3,4,5};

        System.out.println(convierteArrayEnString(tabla));
    }

    public static String convierteArrayEnString(int[] a) {
        String cad = "";

        for (int i=0; i<a.length; i++) {
            cad=cad + a[i];
        }
        return cad;
    }
}
