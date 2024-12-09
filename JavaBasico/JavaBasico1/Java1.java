package CursoJavaNelioAlves1;
import java.util.Locale; /* Classe Locale Importada */

public class Java1 {
    public static void main(String[] args) {

        /* No Java colocamos primeiro o tipo da variável, logo após isso o seu nome */

        int valor1 = 14;
        String valor2 = "Valor2 = Hello World";
        double valor3 = 32.5894;

        Locale.setDefault(Locale.US); /* Ela é usada para adaptar a apresentação
        de informações (como datas, números e textos) para um determinado idioma e país */

        System.out.println("valor1 = "+valor1);
        System.out.println(valor2);
        System.out.printf /* O f de "printf" vem de format, junto ao comando "%.2f%n" atribuímos
                2 casas decimais */
                ("valor3 = %.2f%n",+valor3);
        /* "%n quebra a linha */


    }
}


