package application;

import entities.Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ArrayList<Employees> employeesList = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        int y = 1;
        for (int i = 0; i < n; i++) {
            System.out.println("------------------------------------------");
            System.out.printf("Emplyoee #%d:%n", y++);
            System.out.print("Id: ");
            int id = sc.nextInt();
            while (id > 999 || id < 100) {
                System.out.print("Enter a valid id: ");
                id = sc.nextInt();
                while (hasId(employeesList,id)){
                    System.out.print("Id already taken! Try Again: ");
                    id = sc.nextInt();
                }
            }
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            employeesList.add(new Employees(id, name, salary));
        }

        System.out.println("------------------------------------------");

        System.out.print("Enter the employee id that will have salary increase: ");
        int searchId = sc.nextInt();
        sc.nextLine();

        Employees check = employeesList.stream()
                .filter(employees -> employees.getId() == searchId)
                .findFirst()
                .orElse(null);

        if (check == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double x = sc.nextDouble();
            sc.nextLine();
            for (int i = 0; i < employeesList.size(); i++) {
                Employees emp = employeesList.get(i);
                if (emp.getId() == searchId){
                    emp.percentIncrease(employeesList,x,emp);
                }
            }
        }

        System.out.println("------------------------------------------");
        System.out.println("List of employees:");

        for (Employees summary: employeesList) {
            System.out.println(summary);
        }
        sc.close();
    }

    public static boolean hasId(List<Employees> employeesList, int id) {
        Employees emp = employeesList.stream()
                .filter(x -> x.getId() == id)
                .findFirst()
                .orElse(null);
        return emp != null;
    }
}
