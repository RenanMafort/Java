package br.com.devdojo.varargs.streams.dominios.test;

import br.com.devdojo.varargs.streams.dominios.LighNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

//Orde por titulo em seguida
public class StreanTest04 {
    public static void main(String[] args) {
        List<List<String>> escola = new ArrayList<>();
        List<String> graphicDesigners = List.of("Renan Sereia","Caio Gugu","Catarina Hon");
        List<String> developers = List.of("Renan ","Caio","Hon");
        List<String> students = List.of("Jao ","Pepe","Pedro Sants","AHTANGELO");
        escola.add(graphicDesigners);
        escola.add(developers);
        escola.add(students);

        for (List<String> people : escola) {
            for (String person : people) {
                System.out.println(person);
            }
        }

        System.out.println("----------");
        escola.stream().flatMap(l -> l.stream()).forEach(System.out::println);

    }
}
