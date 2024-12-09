package entities;

import java.util.Scanner;

public class Vectors {

    Scanner sc = new Scanner(System.in);

    String[] name;
    int[] age ;

    public Vectors(String[] name, int[] age) {
        this.name = name;
        this.age = age;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public int[] getAge() {
        return age;
    }

    public void setAge(int[] age) {
        this.age = age;
    }

    public void insertVector(Vectors[] vect, int y) {
        y = 1;
        for (int i = 0; vect.length > i; i++) {
            System.out.printf("%dst person data:%n",y++);
            System.out.print("Name: ");
            getName()[i] = sc.nextLine();
            System.out.print("Age: ");
            getAge()[i] = sc.nextInt();
            sc.nextLine();
        }
    }

    public void OlderPerson(Vectors [] vect) {
        String oldName = getName()[0];
        for (int i = 0; vect.length > i; i++) {
            if (getAge()[i] > getAge()[i]) {
                oldName = getName()[i];
            }
        }
        System.out.println("Older person: " + oldName);
    }
}
