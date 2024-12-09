package CursoJavaNelioAlves3;
import java.util.Locale;
import java.util.Scanner;

public class Java7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char afirmativa;

        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double tempC = sc.nextDouble();
            double F = 9 * (tempC/5) + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n",F);
            System.out.print("Deseja repetir (s/n)? ");
            afirmativa = sc.next().charAt(0);
        } while (afirmativa != 'n');
        /* Executa uma vez, caso a situação "while" for verdadeira, o programa continua */
        /* Utilize "" para String e '' para char */
        sc.close();
    }
}
