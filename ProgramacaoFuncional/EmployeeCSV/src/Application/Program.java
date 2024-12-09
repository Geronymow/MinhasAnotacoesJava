package Application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Employee> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String [] fields = line.split(",");
                list.add(new Employee(fields[0],fields[1],Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.println("Email of People whose salary is more than "
                    + String.format("%.2f",salary) + ":");

            List<String> emails = list.stream()
                    .filter(x -> x.getSalary() > salary)
                    .map(Employee::getEmail).sorted().toList();

            emails.forEach(System.out::println);

            List<Double> sumSalary = list.stream()
                    .filter(e -> e.getName().toUpperCase().charAt(0) =='M')
                    .map(Employee::getSalary).reduce(Double::sum).stream().toList();

            System.out.print("Sum of salary of people whose name starts with 'M': ");
            sumSalary.forEach(System.out::println);

        }
        catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        sc.close();
    }
}
