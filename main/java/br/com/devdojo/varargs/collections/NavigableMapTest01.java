package br.com.devdojo.varargs.collections;

import br.com.devdojo.varargs.collections.dominio.Consumidor;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        Consumidor c1 = new Consumidor("renan");
        Consumidor c2 = new Consumidor("sereia");
        NavigableMap<String,String> map = new TreeMap<>();
        map.put("a","2");
        map.put("b","3");
        map.put("c","1");
        map.put("d","5");

        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            System.out.println(stringStringEntry);
        }

        System.out.println(map.headMap("d"));
    }
}
