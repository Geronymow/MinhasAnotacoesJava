import java.util.Locale;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);

        int menu;
        double vInicial, vFinal;
        //Referência para a classe LibroLivraria
        LivroLivraria objLivro;

        String titulo, autor, genero;
        double preco;
        int isbn;

        do {

            exibirMenu();
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("====> CADASTRAR LIVRO");
                    System.out.println("Digite o Titulo: ");
                    titulo = scString.nextLine();
                    System.out.println("Digite o autor: ");
                    autor = scString.nextLine();
                    System.out.println("Digite o Gênero: ");
                    genero = scString.nextLine();
                    System.out.println("Digite o ISBN: ");
                    isbn = sc.nextInt();
                    System.out.println("Digite o Preço: ");
                    preco = sc.nextDouble();

                    //Criar objeto da classe
                    objLivro = new LivroLivraria(titulo,autor,isbn,genero,preco);

                    //Guardar no ArrayList
                    Acervo.adicionar(objLivro);
                    break;

                case 2:
                    System.out.println("====> LISTAGEM DE LIVROS");
                    System.out.println(Acervo.listar());
                    break;

                case 3:
                    System.out.println("====> EXCLUSÃO DO LIVRO");
                    System.out.println("Digite o título do livro");
                    titulo = scString.nextLine();
                    if (! Acervo.getListaLivros().isEmpty()) { //Acervo não vazio
                        if (Acervo.remover(titulo)) {
                            System.out.println("Livro removido com sucesso");
                        }
                        else {
                            System.out.println("Titulo não encontrado!!");
                        }
                    }
                    else {
                        System.out.println("Não existem livros no acervo!!");
                    }
                    break;

                case 4:
                    System.out.println("====> PESQUISAR PELO GÊNERO");
                    System.out.println("Digite o gênero: ");
                    genero = scString.nextLine();
                    System.out.println("Existem: " + Acervo.pesquisar(genero) +
                            " livro(s) do gênero " + genero);
                    break;

                case 5:
                    System.out.println("====> PESQUISAR POR FAIXA DE PREÇO");
                    System.out.println("Digite a faixa inicial e a final: ");
                    vInicial = sc.nextDouble();
                    vFinal = sc.nextDouble();

                    System.out.println("Existe " + Acervo.pesquisar(vInicial,vFinal) +
                            "livro(s) com preços entre " +
                            String.format("R$ 2.f e R$ 2.f \n",vInicial,vFinal));
                    break;

                case 6:
                    System.out.println("====> TOTAL EM R$ DE LIVROS DO ACERVO");
                    System.out.println("O Total é: " +
                            String.format("R$ 2.f \n",Acervo.calcularTotalAcervo()));
                    break;

                case 7:
                    System.out.println("====> Saindo...");

                    break;

                default:
                    System.out.println("Opção de menu inválida!!!");
            }

        }while (menu != 7);

    } //Fim do Main

    static void exibirMenu() {
        System.out.println("==================== LIVRO LIVRARIA ====================");
        System.out.println("1 - CADASTRAR");
        System.out.println("2 - LISTAR");
        System.out.println("3 - EXCLUIR LIVRO");
        System.out.println("4 - PESQUISAR POR GÊNERO");
        System.out.println("5 - PESQUISAR POR FAIXA DE PREÇO");
        System.out.println("6 - CALCULAR TOTAL DO ACERVO");
        System.out.println("7 - SAIR");
    }
}
