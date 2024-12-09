import java.util.Locale;
import java.util.Scanner;

public class AverageHeight {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];
        /* Iniciando o vetor, onde [n] seria o tamanho do vetor.
        No caso será o valor de sáida de n */

        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
            /* for demonstrando a posição de cada n no vetor */
        }
        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }
        double avg = sum / n;

        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);

        sc.close();
    }
}
