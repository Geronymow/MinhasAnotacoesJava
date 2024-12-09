package application;

import entities.NotaFiscal;
import list.ListaNotaFiscal;

import java.util.Locale;
import java.util.Scanner;

public class Intranet {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("========== BEM VINDO AO INTRANET ==========");
        int menu;
        String razaoSocial, serie, data;
        double valor;
        int num;
        NotaFiscal notaFiscal;

        do {
            exibirMenu();
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("========== CADASTRAR NOTA ==========");
                    System.out.print("Digite a Razão Social: ");
                    razaoSocial = sc.nextLine();
                    System.out.print("Digite o número da Nota: ");
                    num = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Digite a série da nota fiscal: ");
                    serie = sc.nextLine();
                    System.out.print("Digite a data de emissão da notas: ");
                    data = sc.nextLine();
                    System.out.print("Digite o valor sem a aliquota: ");
                    valor = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("====================");

                    notaFiscal = new NotaFiscal(razaoSocial,num,serie,data,valor);

                    //Guardar no ArrayList
                    ListaNotaFiscal.addNota(notaFiscal);
                    break;

                case 2:
                    System.out.println("========== LISTAR AS NOTAS ==========");
                    System.out.println(ListaNotaFiscal.listar());
                    break;

                case 3:
                    System.out.println("========== REMOVER NOTA FISCAL ==========");
                    System.out.println("Digite a razão social da empresa");
                    razaoSocial = sc.nextLine();
                    if (! ListaNotaFiscal.getListNota().isEmpty()) { //Acervo não vazio
                        if (ListaNotaFiscal.remover(razaoSocial)) {
                            System.out.println("Nota Fiscal removida com sucesso!!");
                        }
                        else {
                            System.out.println("Razão Social não encontrada!!");
                        }
                    }
                    else {
                        System.out.println("Não existem Notas Fiscais lançadas!!");
                    }
                    break;

                case 4:
                    System.out.println("SAINDO...");
                    break;

                default:
                    System.out.println("Opção do Menu Inválida");
            }

        } while (menu != 4);
        
    }

    private static void exibirMenu() {
        System.out.println("1 - CADASTRAR NOTA NO SISTEMA");
        System.out.println("2 - LISTAR TODAS AS NOTAS CADASTRADAS");
        System.out.println("3 - REMOVER NOTA DO SISTEMA");
        System.out.println("4 - SAIR DO PROGRAMA");
        System.out.println("====================");


    }
}
