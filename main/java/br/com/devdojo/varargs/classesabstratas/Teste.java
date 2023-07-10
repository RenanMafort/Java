package br.com.devdojo.varargs.classesabstratas;

public class Teste {
    public static void main(String[] args) {
        Funcionario funcionario = new Gerente("Test2e",222222128.00);
        Funcionario gerente2 = new Desenvolvedor("Renan",22222.22);
        Gerente gerente = new Gerente("Teste",222222128.00);

        System.out.println(funcionario);
        System.out.println(gerente);
        System.out.println(gerente2);
    }
}
