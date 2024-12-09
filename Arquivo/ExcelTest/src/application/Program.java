package application;

import entities.Product;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String path = sc.nextLine();

        System.out.print("Quantos produtos serão colocados na lista: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Product> productList = new ArrayList<>();

        for(int i = 1; n >= i ; i++) {
            System.out.println("Product #" + i + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price Unit: ");
            double price = sc.nextDouble();
            sc.nextLine();
            System.out.print("Unit: ");
            int quant = sc.nextInt();
            sc.nextLine();
            Product product = new Product(name, price, quant);
            productList.add(product);
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {
            for (Product p : productList) {
                bw.write(p.summary());
                bw.newLine();

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        sc.close();
    }
}
