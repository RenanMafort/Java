package br.com.devdojo.varargs.classesinternas;

public class OuterClasses02 {
    private String name = "Renan";
    void print(){
        String lastName = "Sereia";

        class LocalClass{
            public void printLocal(){
                System.out.println(name + " " + lastName);
            }
        }
        new LocalClass().printLocal();
    }
    public static void main(String[] args) {
        OuterClasses02 outer = new OuterClasses02();
        outer.print();
    }
}
