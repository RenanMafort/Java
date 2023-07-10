package br.com.devdojo.varargs.generics;

import java.util.List;
import java.util.Objects;

public class WildcardTest02 {

    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());

        printConsulta(cachorros);
        printConsulta(gatos);

    }

    private static void printConsulta(List<? extends Animal> animals){
        for (Animal animal : animals){
            animal.consuta();
        }
//        animals.add(new Gato());
//        animals.add(new Cachorro());

    }

    private static void printConsultaAnimal(List<? super Animal> animals){
        animals.add(new Gato());
        animals.add(new Cachorro());

    }
}

