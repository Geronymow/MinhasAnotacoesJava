import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHora2 {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2024-08-31");
        LocalDateTime d05 = LocalDateTime.parse("2024-08-31T17:02:25");
        Instant d06 = Instant.parse("2024-08-31T00:02:25Z");
        //Instant não tem o método format.

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
                .withZone(ZoneId.systemDefault());
        //Apenas se for "Instant".
        //Considera o fuso horário do computador do usuário.
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME.withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT.withZone(ZoneId.systemDefault());

        //Formas para chamar:
        System.out.println("d04: " + d04.format(fmt1));
        System.out.println("d04: " + fmt1.format(d04));
        System.out.println("d04: " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("d05 = " + d05.format(format2()));
        System.out.println("d05 = " + fmt2.format(d05));
        //Quando for Instant, você deve informar o fuso horário

        System.out.println("d06 = " + fmt2.format(d06));
        //Quando for "Instant" tem que formatar indicando o fuso horário.

        System.out.println("=================================");
        DateTimeFormatter fmt6 = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println("d05 = " + fmt5.format(d06));

    }

    //Utilizando métodos
    public static DateTimeFormatter format2() {
        return DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    }
}
