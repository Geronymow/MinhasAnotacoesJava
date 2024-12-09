import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class app {
    /* Escreva um método main em Java que lê duas horas (horas e minutos, nesta ordem) do
    teclado e as compara, apresentando uma mensagem na tela indicando se a primeira é
    posterior à segunda. Utilize a classe Console. */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DateTimeFormatter format = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

        System.out.print("Digite a primeira hora: ");
        LocalDateTime h1 = LocalDateTime.parse(sc.nextLine(),format);
        System.out.print("Digite a segunda hora: ");
        LocalDateTime h2 = LocalDateTime.parse(sc.nextLine(),format);

        if (h1.isBefore(h2)) {
            System.out.println("H1 veio primeiro");
        }
        else if (h1.isEqual(h2)) {
            System.out.println("As duas datas são as mesmas");
        }
        else {
            System.out.println("H2 veio primeiro");
        }

    }
}
