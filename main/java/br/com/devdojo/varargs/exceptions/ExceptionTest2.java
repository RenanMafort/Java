package br.com.devdojo.varargs.exceptions;

import java.io.File;
import java.io.IOException;

public class ExceptionTest2 {
    public static void main(String[] args) throws IOException{
            criarNovoArquivo();
    }

    public static void criarNovoArquivo() throws IOException {
        File file = new File("arquivsdao\\teste2.txt");
        try {
            boolean criado = file.createNewFile();
            System.out.println("Arquivo criado? = " + criado);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
