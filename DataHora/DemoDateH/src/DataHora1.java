import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora1 {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        //Formata a data como preferir

        LocalDate d01 = LocalDate.now();
        //Apenas Dia, mês e ano.

        LocalDateTime d02 = LocalDateTime.now();
        //Dia, mês e ano + horário.

        Instant d03 = Instant.now();
        //Data e hora GMT (Londres + 3 horas).

        LocalDate d04 = LocalDate.parse("2024-08-31");
        //A função LocalDate.parse() é usada para converter uma string no formato "yyyy-MM-dd"

        LocalDateTime d05 = LocalDateTime.parse("2024-08-31T10:13:59");
        //Mesma coisa para definir junto ao horário.

        Instant d06 = Instant.parse("2024-08-31T10:13:59Z");
        //Define o horário lá de Londres, puxando pela String -> "text"

        Instant d07 = Instant.parse("2024-08-31T10:13:59-04:00");
        //Atribui por si só o horário da "região de sua escolha".

        LocalDate d08 = LocalDate.parse("31/08/2024",fmt1);
        //Deve especificar o formato.

        LocalDateTime d09 = LocalDateTime.parse("31/08/2024 01:30",fmt2);
        //Após definido o formato, apenas apenas atribuir ao String "text".

        LocalDate d10 = LocalDate.of(2024,8,31);
        //Define separadamente as datas

        LocalDateTime d11 = LocalDateTime.of(2024,8,31,1,20);
        //Define separadamente as datas + horário.

        //Print
        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);

    }
}
