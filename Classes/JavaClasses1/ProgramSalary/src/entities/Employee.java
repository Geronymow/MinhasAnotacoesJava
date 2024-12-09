package entities;

/* Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto).
Em seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
afetado pela porcentagem) e mostrar novamente os dados do funcionário. */

import java.util.Scanner;

public class Employee {
    Scanner sc = new Scanner(System.in);

    public String name;
    public double grossSalary;
    public double tax;

    public String toString() {
        return "Name: " + name
                + "\nGross Salary: " + grossSalary
                + "\ntax: " + tax;

    }

    public double netSalary() {
        return grossSalary - tax;
    }

    public void statusNetSalary() {
        System.out.printf("Employee: %s, $ %.2f%n",name, netSalary());
    }

    public double percentage(double x) {
        return x/100;
    }

    public void updatedData(double newGrossSalary) {
        newGrossSalary = netSalary() + (grossSalary * percentage(sc.nextDouble()));
        System.out.printf("Updated data: %s, $ %.2f%n", name, newGrossSalary);
    }

}