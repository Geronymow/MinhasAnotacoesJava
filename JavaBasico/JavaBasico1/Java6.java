package CursoJavaNelioAlves1;
import java.util.Locale;
import java.util.Scanner;

public class Java6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x;
        double y;
        double raizQ1;
        double raizQ2;
        double expo1;

        System.out.println();
        System.out.print("Digite os valores: ");

        x = sc.nextDouble();
        y = sc.nextDouble();

        raizQ1 = Math.sqrt(x);
        /* Para atribuir a raiz quadrada de "x" */
        System.out.printf("A raiz quadrada de %.2f é: %.2f%n",x,raizQ1);
        raizQ2 = Math.sqrt(y);
        System.out.printf("A raiz quadrada de %.2f é: %.2f%n",y,raizQ2);
        /* Para atribuir a raiz quadrada de "y" */

        expo1 = Math.pow(raizQ2,raizQ1);
        /* Para atribuir o expoente, onde raizQ2 elevado a raizQ1 */
        System.out.printf("A segunda raiz elevada a primeira é %.2f%n",expo1);

        sc.close();

    }

}
