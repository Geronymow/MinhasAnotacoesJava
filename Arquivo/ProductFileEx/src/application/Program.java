package application;

import entities.Product;

import java.io.BufferedWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Product> productList = new ArrayList<>();
        int n = 3;

        for(int i = 1; n >= i; i++) {
            System.out.println("Product #" + i + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price Unit: ");
            double priceUnit = sc.nextDouble();
            sc.nextLine();
            System.out.print("Unit: ");
            int unit = sc.nextInt();
            sc.nextLine();
            Product product = new Product(name,priceUnit,unit);
            productList.add(product);
        }

        String path = sc.nextLine();

        File fileInitial = new File(path + "in.csv");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileInitial,true))) {
            for (Product p : productList) {
                bw.write(p.initial());
                bw.newLine();
            }
        }
        catch (IOException e ) {
            e.printStackTrace();
        }

        boolean create = new File(path + "\\outOut").mkdir();
        //Pasta criada

        File file = new File(path + "\\outOut\\summary.csv");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(String.valueOf(file),true))) {
            for (Product p : productList) {
                bw.write(p.summary());
                bw.newLine();
            }
        }
        catch (IOException e ) {
            e.printStackTrace();
        }



        sc.close();

    }
}
