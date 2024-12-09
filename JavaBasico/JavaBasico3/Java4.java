package CursoJavaNelioAlves3;

import java.util.Scanner;

public class Java4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int soma = 0;

        for (int i = 0; i < n; i+=1){
            int x = sc.nextInt();
            soma += x;
            /* "Início" executa somente uma vez.
               "Condição" V: Executa e volta / F: Pula fora.
               "Incremento" Executa toda vez depois de voltar.

               For (Início; Condição; incremento) {
                  comando 1
                  comando 2
              }
                       Perceba que a estrutura "for" é excelente
                       para se fazer uma repetição baseada em contagem */
        }
        sc.close();
        System.out.println(soma);
    }
}
