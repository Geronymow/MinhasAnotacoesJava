package application;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        int sum = list.stream().reduce(0, (x, y) -> x + y);
        //Reduce pega o elemento inicial que vai ser o elemento neutro e depois uma função
        //que recebe dois argumentos que retorna o resultado
        System.out.println("Sum = " + sum);

        /* Pipeline é um fluxo estruturado e automatizado que permite mover dados de uma
        fonte até um destino, passando por diversas etapas de processamento ao
        longo do caminho */

        List<Integer> newList = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 10)
                .toList();
        System.out.println(Arrays.toString(newList.toArray()));
    }
}
