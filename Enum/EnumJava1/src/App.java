import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        Integer id = 4444;
        LocalDateTime DataDeCompra = LocalDateTime.parse("12/02/2018 12:45",formatter);
        OrderStatus status = OrderStatus.PENDING_PAYMENT;

        Order computador = new Order(id,DataDeCompra,status);

        System.out.println(computador.toString(formatter));

        OrderStatus HD1 = OrderStatus.PROCESSING;

        OrderStatus HD2 = OrderStatus.valueOf("SHIPPED");
        //Transformando String em Enum, onde deve ser digitado igual na classe Enum
        System.out.println("=========================");
        System.out.println(HD1);
        System.out.println(HD2);


    }
}
