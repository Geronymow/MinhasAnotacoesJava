import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List <Integer> NumberList = new ArrayList<>();
        // Importando a classe "ArrayList"

        NumberList.add(42); NumberList.add(75); NumberList.add(67); NumberList.add(12);
        NumberList.add(23); NumberList.add(8);
        // (NomeDaLista.add) adiciona na lista.
        NumberList.add(2,98);
        // Adicionando, porém, escolho a posição.

        System.out.println("Tamanho da lista: " + NumberList.size());
        // Mostra o tamanho da lista

        for(Integer listNumber: NumberList) {
            System.out.println(listNumber);
        }
        // Mostra todos os integrantes da lista.

        System.out.println("---------------------------------------------------");

        NumberList.remove(2);
        // Remove integrante da posição atribuída.

        NumberList.removeIf(listNumber -> listNumber % 2 == 0);
        // Remove caso a situação pós "->" for verdadeira. O seja se o predicado for verdadeiro.

        for(Integer listNumber: NumberList) {
            System.out.println(listNumber);
        }

        System.out.println("---------------------------------------------------");
        System.out.println("Indice: " + NumberList.indexOf(23));
        System.out.println("Indice: " + NumberList.indexOf(158));
        // Acha a sua posição. Caso não exista na lista o programa irá retornar "-1".

        List <Integer> result = NumberList.stream().filter(listNumber -> listNumber % 10 == 3).toList();
        // Cria uma lista para pegar a outra lista e filtrar conforme condição, retornando a lista.

        for (Integer listNumber: result) {
            System.out.println(listNumber);
        }

        System.out.println("---------------------------------------------------");

        Integer num = NumberList.stream().filter(listNumber -> listNumber % 10 == 3)
                .findFirst().orElse(null);
        // "FindFirst" mostra o primeiro elemento que atende o predicado.
        // Caso não exista na lista algum elemento que atenda, ele irá retornar null.
        System.out.println(num);
    }
}