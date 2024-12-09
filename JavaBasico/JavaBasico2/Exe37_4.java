package CursoJavaNelioAlves2;
import java.util.Scanner;

public class Exe37_4 {
    public static void main(String[] args) {
        /* Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,
        sabendo que o mesmo pode começar em um dia e terminar em outro,
        tendo uma duração mínima de 1 hora e máxima de 24 horas. */
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o horário de início do jogo: ");
        int HorInicial = sc.nextInt();
        System.out.print("Digite o horário em que o jogo acabou: ");
        int HorFinal = sc.nextInt();

        int duraJogo;

        if (HorInicial < HorFinal) {
            duraJogo = HorFinal - HorInicial;
            /* Quando o jogo começa e termina no mesmo dia,
            a duração do jogo é simplesmente a diferença entre HorFinal e HorInicial.  */
        }
        else {
            duraJogo = 24 - HorInicial + HorFinal;
            /* Usado para determinar a duração do jogo quando o jogo começa
            em um dia e termina no dia seguinte

            24 - HorInicial calcula quantas horas restam até a meia-noite desde o
            início do jogo. + HorFinal adiciona as horas passadas após a meia-noite até
            o término do jogo. */
        }

        System.out.printf("O jogo durou %d horas %n",duraJogo);

        sc.close();


    }
}
