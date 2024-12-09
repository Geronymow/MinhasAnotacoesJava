package CursoJavaNelioAlves1;
import java.util.Locale;
import java.util.Scanner; /* Importando a Classe Scanner */

public class Java4 {

        public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            /* Objeto Locale deve aparecer antes do Scanner */
            Scanner sc = new Scanner(System.in);
            /* Criar o objeto Scanner para inserir pelo terminal a informação */

            String nome;
            int idade;
            double altura;
            char inicialNome;
            System.out.println();
            System.out.print("Digite a inicial do nome da menina: ");
            inicialNome = sc.next().charAt(0);
            /* Comando para digitar no terminal char "0", pois ele quer a primeira letra */
            System.out.print("Digite o nome da menina: ");
            nome = sc.next();
            /* Comando para digitar no terminal String */
            System.out.print("Digite a idade da menina: ");
            idade = sc.nextInt();
            /* Comando para digitar no terminal Inteiro */
            System.out.print("Digite a altura da menina: ");
            altura = sc.nextDouble();
            /* Comando para digitar no terminal Double */
            System.out.println();

            System.out.printf("A primeira letra do nome da menina é %s%n",inicialNome);
            System.out.printf("O nome da menina é %s%n",nome);
            System.out.printf("A menina tem %d anos %n",idade);
            System.out.printf("A Menina mede %.2f",altura);
            System.out.println();

            sc.close();
            /* Dar fim para não utilizar mais o objeto */

        }
}
