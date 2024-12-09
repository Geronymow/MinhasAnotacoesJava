package entities;

import java.util.Scanner;

public class Student {

    Scanner sc = new Scanner(System.in);

    private String name;
    private String email;

    public Student() {
    }

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void rentStart(int n, Student[] room) {
        int y = 1;
        for (int i = 0; n > i; i++) {
            System.out.printf("Rent #%d%n",y++);

            System.out.print("Name: ");
            name = sc.nextLine();

            System.out.print("Email: ");
            email = sc.nextLine();

            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            System.out.println();
            sc.nextLine();
            room[roomNumber] = new Student(getName(),getEmail());
        }
    }

    public void summary(int n, Student[] room) {
        System.out.println("Busy rooms: ");
        for (int i = 0; room.length > i; i++) {
            if (room[i] != null)
                System.out.println(i + ": " + room[i]);
        }
    }

    public String toString() {
        return getName() + ", " + getEmail();
    }
}

