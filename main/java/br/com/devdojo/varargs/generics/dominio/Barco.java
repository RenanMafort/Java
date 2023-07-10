package br.com.devdojo.varargs.generics.dominio;

public class Barco implements Comparable<Barco>{
    private String nome;

    public Barco(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public int compareTo(Barco o) {
        return this.nome.compareTo(o.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
