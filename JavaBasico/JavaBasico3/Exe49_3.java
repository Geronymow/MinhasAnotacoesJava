package CursoJavaNelioAlves3;

import java.util.Locale;
import java.util.Scanner;

/* Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência
de seus clientes. Escreva um algoritmo para ler o tipo de combustível abastecido
(codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário
informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4.
Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram
cada tipo de combustível. */

public class Exe49_3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int combustivel = 0;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;

        while (combustivel != 4) {
            System.out.print("Digite o tipo de combustível: ");
            combustivel = sc.nextInt();
            if (combustivel == 1) {
                cont1 +=1;
            }
            else if (combustivel == 2) {
                cont2 += 1;
            }
            else if (combustivel == 3) {
                cont3 += 1;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+cont1);
        System.out.println("Gasolina: "+cont2);
        System.out.println("Diesel: "+cont3);

        sc.close();
    }
}
