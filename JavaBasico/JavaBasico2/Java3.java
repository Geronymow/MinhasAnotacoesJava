package CursoJavaNelioAlves2;
import java.util.Locale;
import java.util.Scanner;
/* Uma operadora de telefonia cobra R$ 50,00 por plano básico que há direito a 100 minutos
de telefone. Cada minuto que exceder a franquia de 100 minutos custa R$ 2,00. Fazer um programa
para ler a quantidade de minutos que uma pessoa consumiu, dái mostrar o valor a ser pago. */
public class Java3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de minutos: ");
        int quantMin = sc.nextInt();
        double valorPago = 50.0;

        if (quantMin > 100) {
            valorPago += (quantMin - 100) * 2;
            /* "+=" significa (valorPago = valorPago + (quantMin - 100)) * 2, ou seja (a = a + b)
            pode ser utilizado com outras operações
            -, *, / e % */
        }
        else {
            System.out.println();
        }
        System.out.printf("Valor da conta = R$%.2f%n",valorPago);

        sc.close();

    }
}
