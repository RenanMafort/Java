package br.com.devdojo.varargs.generics;

import br.com.devdojo.varargs.generics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> canoaMarota = criarArrayComUmObjeto(new Barco("Canoa Marota"));
        System.out.println(canoaMarota);
    }

    private static <T extends Comparable<T>> List<T> criarArrayComUmObjeto(T t){
        return List.of(t);
    }
}
