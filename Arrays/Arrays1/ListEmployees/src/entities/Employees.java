package entities;

import java.util.ArrayList;

public class Employees {

    private int id;
    private String name;
    private double salary;

    public Employees(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public double percentIncrease(ArrayList<Employees> employeesList, double x, Employees emp) {
        return salary += getSalary() * x / 100;
    }

    public String toString() {
        return getId() + ", " + getName() + ", " + getSalary();
    }

}
