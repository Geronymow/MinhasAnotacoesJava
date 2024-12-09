import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DataHora3 {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2024-08-31");
        LocalDateTime d05 = LocalDateTime.parse("2024-08-31T10:13:59");
        Instant d06 = Instant.parse("2024-08-31T01:13:59Z");

        //Converte o instante para uma data local, considerando o fuso horário do computador.
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        //Escolhendo diretamente o país, no caso Portugal.
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06,ZoneId.of("Portugal"));

        System.out.println("R1 = " + r1);
        System.out.println("R2 = " + r2);
        System.out.println("R3 = " + r3);
        System.out.println("R4 = " + r4);

        System.out.println("====================");
        //Atribuindo partes da data, separadamente.
        System.out.println(d04.getDayOfWeek());
        System.out.println(d04.getDayOfMonth());
        System.out.println(d04.getMonth());
        System.out.println(d04.getYear());

    }
}
