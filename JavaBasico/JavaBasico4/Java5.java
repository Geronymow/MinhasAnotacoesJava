package CursoJavaNelioAlves4;

public class Java5 {
    public static void main(String[] args) {

        String s = "Bird-Apple-lemon";

        String[] vetor = s.split("-"); /* É utilizado para dividir uma string em partes.
        Nesse contexto toda vez que o programa ler um "-", ele irá dividir a String.
        Funciona com vários caracteres até mesmo (" ") vazio. */

        String p1 = vetor[0]; // Perceba que o primeiro vetor sempre será "0"
        String p2 = vetor[1];
        String p3 = vetor[2];

        System.out.println(vetor[0]);
        System.out.println(vetor[1]);
        System.out.println(vetor[2]);
    }
}
