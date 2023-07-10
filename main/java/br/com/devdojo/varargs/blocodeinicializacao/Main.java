package br.com.devdojo.varargs.blocodeinicializacao;

public class Main {
    public static String teste;
    public static void main(String[] args) {
        teste = "s";

        BlocosDeInicializacao blocosDeInicializacao1 = new BlocosDeInicializacao("Renan",23, 1.91);
        BlocosDeInicializacao blocosDeInicializacao2 = new BlocosDeInicializacao("Renan",23, 1.91);
        BlocosDeInicializacao blocosDeInicializacao3 = new BlocosDeInicializacao("Renan",23, 1.91);

        BlocosDeInicializacao.setPeso( 121.22);

        System.out.println(blocosDeInicializacao1.getAltura() +
        blocosDeInicializacao1.getNome() +
        blocosDeInicializacao1.getIdade());

        Funcionario f = new Funcionario("re",12);
//        Pessoa p = new Pessoa("re",12);

    }
}
