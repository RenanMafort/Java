package br.com.devdojo.varargs.streams.dominios.test;

import br.com.devdojo.varargs.streams.dominios.LighNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

//Orde por titulo em seguida
public class StreanTest06 {
    private static List<LighNovel> list = new ArrayList<>(List.of(
            new LighNovel("Renan",33.90),
            new LighNovel("Abcat",26.00),
            new LighNovel("Abcat",2.00),
            new LighNovel("Bol",2.11),
            new LighNovel("Josa",11.90)));

    public static void main(String[] args) {
        boolean b = list.stream().anyMatch(ln -> ln.getPrice() > 8);
        System.out.println(b);
        System.out.println(list.stream().allMatch(ln -> ln.getPrice() > 0));
        System.out.println(list.stream().noneMatch(ln -> ln.getPrice() > 0));
        System.out.println(list.stream().noneMatch(ln -> ln.getPrice() < 0));

         list.stream().filter(ln -> ln.getPrice() > 15).min(Comparator.comparing(LighNovel::getTitle)).ifPresent(System.out::println);

    }
}
