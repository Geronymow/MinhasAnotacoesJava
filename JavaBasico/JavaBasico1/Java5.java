package CursoJavaNelioAlves1;
import java.util.Scanner;

public class Java5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Criar o objeto Scanner para inserir pelo terminal a informação */

        int x;
        int y;
        int z;
        String n1,n2,n3;

        System.out.print("Digite os dados: ");

        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        sc.nextLine();
        /* Inserir o "nextLine", pois no "nextInt" não possuiu. Dessa
        forma a quebra de linha não fica pendente */
        n1 = sc.nextLine();
        n2 = sc.nextLine();
        n3 = sc.nextLine();
        /* "nextLine" permite digitar mais de um dado no terminal */

        System.out.println("Dados digitados: ");
        System.out.print(x+" ");
        System.out.print(y+" ");
        System.out.println(z);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        sc.close();

    }

}
