package application;

import entities.Client;

public class Program {
    public static void main(String[] args) {

        //System.out.println("FB".hashCode()); Ambos retornam o mesmo código
        //System.out.println("Ea".hashCode());

        Client c1 = new Client("Maria","maria@gmail.com");
        Client c2 = new Client("Bob","bob@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));



    }
}
