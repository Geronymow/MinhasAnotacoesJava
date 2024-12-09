import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DataHora4 {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2024-08-31");
        LocalDateTime d05 = LocalDateTime.parse("2024-08-31T17:02:25");
        Instant d06 = Instant.parse("2024-08-31T00:02:25Z");

        //Cálculos

        //D04 - 7 dias

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        System.out.println(pastWeekLocalDate);

        LocalDate nextWeekLocalDate = d04.plusDays(3);
        System.out.println(nextWeekLocalDate);

        System.out.println("=====================");

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(3);
        LocalDateTime nextWeekLocalDateTime = d05.plusHours(15);

        System.out.println(pastWeekLocalDateTime);
        System.out.println("=====================");

        //Acrescentando para Instant, utilizamos o "ChronoUnit".
        Instant r1 = d06.minus(7, ChronoUnit.DAYS);
        Instant r2 = d06.plus(8,ChronoUnit.DAYS);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println("======================");

        //Calcular duração.

        Duration t1 = Duration.between(pastWeekLocalDateTime,d05);
        System.out.println(t1.toDays());


        //Não tem como calcular o tempo de dois Local Date, pois Local Date não tem tempo.
        //Dessa forma devemos converter o LocalDate para LocalDateTime
        //Abaixo um exemplo Utilizando "atStartOFDay".
        Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(),d04.atStartOfDay());
        System.out.println(t2.toDays());

        Duration t3 = Duration.between(r1,d06);
        System.out.println(t3.toDays());

        //É possível conseguir o resultado negativo caso a primeira data seja posterior.
        Duration t4 = Duration.between(d06,r1);
        System.out.println(t4.toDays());




    }
}
