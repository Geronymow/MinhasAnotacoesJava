package CursoJavaNelioAlves1;
import java.util.Locale;
import java.util.Scanner;

public class Java8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /* Vamos fazer a fórmula de Bhaskara */

        double a;
        double b;
        double c;
        double delta;
        double x1;
        double x2;

        System.out.print("Digite os valores de a,b e c: ");
        a =sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        delta = Math.pow(b, 2.0) + 4 * a * c;

        x1 = (-b + Math.sqrt(delta))/(2 * a);
        x2 = (-b - Math.sqrt(delta))/(2 * a);

        System.out.println("Valor de x1: "+x1);
        System.out.println("Valor de x2: "+x2);

    }
}
