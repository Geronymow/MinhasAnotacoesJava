package Test;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DateTimeFormatter format2 = DateTimeFormatter.ISO_INSTANT.withZone(ZoneId.systemDefault());

        Instant d06 = Instant.parse(sc.nextLine());
        Instant d07 = Instant.parse(sc.nextLine());

        if (d06.isBefore(d07)) {
            System.out.println("d07 veio primeiro");
        }
        else if (d06.equals(d07)) {
            //Instant só aceita o "equals", diferente de LocalDateTime etc, que aceita "isEqual"
            System.out.println("As duas datas são as mesmas");
        }
        else {
            System.out.println("H2 veio primeiro");
        }



    }
}
