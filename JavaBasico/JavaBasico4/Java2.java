package CursoJavaNelioAlves4;

public class Java2 {
    public static void main(String[] args) {
    /* Operador & será verdadeiro apenas quando os dois valores serem verdadeiros
    Operador | será verdadeiro (1) quando os dois valores ou um for verdadeiro
    Operador ^ será verdadeiro quando apenas um for verdadeiro  */

        int n1 = 89; // 0101 1001
        int n2 = 60; // 0011 1100
        System.out.println(n1 & n2); // &: 0001 1000
        System.out.println(n1 | n2); // |: 0111 1101
        System.out.println(n1 ^ n2); // ^: 0110 0101

    }
}
