package br.com.devdojo.varargs.classesinternas;

class Animal{
    public void walk(){
        System.out.println("Animal walking");
    }
}

class Dog extends Animal{
    @Override
    public void walk() {
        System.out.println("Cachorro walking");
    }
}
public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal(){ // As {} é como se fosse classes anonimas
            @Override
            public void walk() {
                System.out.println("Walking in the shadows");
            }
        };
        animal.walk();

    }
}
