package br.com.devdojo.varargs.nio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest01 {
    public static void main(String[] args) {
        Path path = Paths.get(".");
        try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)){
            for (Path path1 : directoryStream){
                System.out.println(path1.getFileName());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
