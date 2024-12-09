package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Cliente data: ");
        System.out.print("Name: ");
        String ClientName = sc.nextLine();
        System.out.print("Email: ");
        String ClientEmail = sc.nextLine();
        System.out.print("Birth Date (DD/MM/YYYY): ");
        String day = sc.nextLine();
        Date ClientBirthDay = sdf.parse(day);

        Client client1 = new Client(ClientName, ClientEmail, ClientBirthDay);

        Date moment = new Date();

        System.out.println("Enter Order Data: ");
        System.out.print("Status: ");
        String status = sc.nextLine();
        OrderStatus.ignoreCase(status);
        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; n >= i; i++) {
            System.out.println("Enter #"+ i + " item data: ");
            System.out.print("Product name: ");
            String ProductName = sc.nextLine();
            System.out.print("Product Price: ");
            double ProductPrice = sc.nextDouble();

            Product product = new Product(ProductName,ProductPrice);

            System.out.print("Product quantity: ");
            Integer orderQuant = sc.nextInt();
            sc.nextLine();

            OrderItem orderItem = new OrderItem(orderQuant, ProductPrice,product);

            Order.getOrderList().add(orderItem);

            Order order = new Order(moment,OrderStatus.ignoreCase((status)),orderItem);

            if(n == i) {
                System.out.println();
                System.out.println(client1.toString(status,ClientBirthDay,moment));
                System.out.println("Order items: ");
                for (OrderItem orderList : Order.getOrderList()) {
                    System.out.println(orderList.toString());
                }
                System.out.println(order.print());
            }
        }
        sc.close();
    }
}
