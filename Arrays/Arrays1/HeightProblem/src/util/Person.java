package util;

import java.util.Scanner;

public class Person {

    Scanner sc = new Scanner(System.in);

    private String name;
    private int age;
    private double height;

    public Person() {
    }

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void personsQuant(int n, Person[] vectquantPerson, int y) {
        for(int i = 0; n > i; i++) {
            System.out.printf("%n%dnd person data%n",y++);
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Age: ");
            age = sc.nextInt();
            System.out.print("Height: ");
            height = sc.nextDouble();
            sc.nextLine();
            System.out.println("----------------------------");
            vectquantPerson[i] = new Person(name, age, height);
        }
    }
    public void avgheight(double sumAvg, int n, Person[] vectquantPerson) {
        double avg = 0;
        for (int i = 0; n > i; i++) {
            sumAvg += vectquantPerson[i].getHeight();
            avg = sumAvg / n;
        }
        System.out.printf("Average height: %.2f%n", avg);
    }

    public void under16(Person[] vectquantPerson, int n) {
        int under16 = 0;
        double percentage = 0;
        for (int i = 0; n > i; i++) {
            if (vectquantPerson[i].getAge() < 16) {
                under16++;
                percentage = (double) under16 / n * 100;
            }
        }
        System.out.printf("People under 16: %.1f", percentage);
        System.out.println("%");
    }

    public void under16Name(Person[] vectquantPerson, int n) {
        for (int i = 0; n > i; i++) {
            if (vectquantPerson[i].getAge() < 16) {
                System.out.println(vectquantPerson[i].getName());
            }
        }
    }
}
