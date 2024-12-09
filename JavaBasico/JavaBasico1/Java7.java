package CursoJavaNelioAlves1;
import java.util.Locale;
import java.util.Scanner;

public class Java7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x = -2;
        double y = -4;

        double absX;
        double absY;

        System.out.println();

        absX = Math.abs(x);
        /* Atribuir valor absoluto para x (Transformar negativo em positivo) */
        System.out.println("Invertendo x de negativo para positivo: "+absX);
        absY = Math.abs(y);
        /* Atribuir valor absoluto para y (Transformar negativo em positivo) */
        System.out.println("Invertendo y de negativo para positivo: "+absY);

        sc.close();

    }
}
