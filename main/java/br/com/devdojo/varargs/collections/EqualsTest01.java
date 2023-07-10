package br.com.devdojo.varargs.collections;

import br.com.devdojo.varargs.collections.dominio.SmartPhone;

public class EqualsTest01 {
    public static void main(String[] args) {
        SmartPhone smartPhone1 = new SmartPhone("1ABA","SAMSUNG");
        SmartPhone smartPhone2 = new SmartPhone("1ABA","SAMSUNG");

        System.out.println(smartPhone1 == smartPhone2);
        System.out.println(smartPhone1.equals(smartPhone2));

        System.out.println(smartPhone1.hashCode());
        System.out.println(smartPhone2.hashCode());

    }
}
