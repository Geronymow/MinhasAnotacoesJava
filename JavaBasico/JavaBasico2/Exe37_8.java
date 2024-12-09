package CursoJavaNelioAlves2;

import java.util.Locale;
import java.util.Scanner;

/* Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes
em pagar seus impostos, pois sabem que nele não existem políticos corruptos e
os recursos arrecadados são utilizados em benefício da população, sem
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de
Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de
Imposto de Renda, segundo a tabela abaixo. Lembre que, se o salário for R$ 3002.00,
a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de salário que fica
de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
e 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, oque resulta em R$ 80.36 no total.
O valor deve ser impresso com duas casas decimais.

Isento = R$ 0.00 a R$ 2.000,00
8% = R$ 2.000,01 até R$ 3.000,00
18% = R$ 3.000,01 até 4.500,00
28% = acima de 4.500,00

*/
public class Exe37_8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salario: ");
        double salario = sc.nextDouble();
        double imposto;

        if (salario <= 2000.00) {
            imposto = 0.0;
        }
        else if (salario <= 3000.00) {
            imposto = (salario - 2000.00) * 0.08;
        }
        else if (salario <= 4500.00) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;

        }
        else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f%n", imposto);
        }

        sc.close();

    }
}
