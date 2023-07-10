package br.com.devdojo.varargs.streams.dominios.test;

import br.com.devdojo.varargs.streams.dominios.LighNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Orde por titulo em seguida
public class StreanTest02 {
    private static List<LighNovel> list = new ArrayList<>(List.of(
            new LighNovel("Renan",33.90),
            new LighNovel("Abcat",2.00),
            new LighNovel("Bol",2.11),
            new LighNovel("Josa",11.90)));

    public static void main(String[] args) {
        System.out.println(list);
       List<String> resuts = list.stream().sorted(Comparator.comparing(LighNovel::getTitle))
                .filter(p -> p.getPrice() >= 4).limit(3).map(t -> t.getTitle())
                .collect(Collectors.toList());
        System.out.println(resuts);
    }
}
