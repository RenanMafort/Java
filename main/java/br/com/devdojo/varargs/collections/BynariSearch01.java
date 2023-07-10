package br.com.devdojo.varargs.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BynariSearch01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(1);
        numeros.add(3);
        numeros.add(4);
        // (-(ponto de inserção)-1)
        Collections.sort(numeros);
        System.out.println(Collections.binarySearch(numeros,2));

        int count = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    System.out.print("[" + i + "]");
                    System.out.print("[" + j + "]");
                    System.out.println();
                }
            }
        }
    }
}
