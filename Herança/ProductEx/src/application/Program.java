package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> productList = new ArrayList<>();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #1 data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            if(ch == 'u') {
                System.out.print("Enter manufacture date (dd/MM/yyyy): ");
                String date = sc.nextLine();
                Date manufactureDate = sdf.parse(date);
                Product product = new UsedProduct(name, price, manufactureDate);
                productList.add(product);
            } else if (ch == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                sc.nextLine();
                Product product = new ImportedProduct(name, price, customsFee);
                productList.add(product);
            }
            else {
                Product product = new Product(name,price);
                productList.add(product);
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS:");
        for(Product product : productList) {
            System.out.println(product.priceTag());
        }
    }
}
