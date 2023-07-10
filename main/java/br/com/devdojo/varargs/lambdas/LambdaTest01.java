package br.com.devdojo.varargs.lambdas;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> strings = List.of("Renan", "Teste", "TESTANDO", "@ASDAS");
        List<Integer> nums = List.of(1,24,5,6,7,8,9);
        forEach(strings, System.out::println);
        forEach(strings, s -> System.out.println(s));
        forEach(nums, s -> System.out.println(s));
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer){
        for (T t : list) {
            consumer.accept(t);
        }


    }
}
