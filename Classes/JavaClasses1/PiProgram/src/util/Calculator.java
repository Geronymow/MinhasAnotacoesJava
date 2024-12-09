package util;

public class Calculator {

    public static final double PI = 3.14;
    /* static: O modificador static indica que a constante PI pertence à classe, e não a uma instância
    específica da classe. Isso significa que você pode acessar PI sem precisar criar um objeto da classe.
    É um recurso útil para constantes que são comuns a todas as instâncias.

    final: O modificador final indica que a constante PI não pode ser alterada depois de ser inicializada.
    Ou seja, uma vez que você define PI como 3.14, você não pode mudar o valor de PI em nenhum ponto futuro
    do código. Isso é útil para garantir que valores constantes
    não sejam alterados acidentalmente. */

    public static double circumference(double num) {
        return 2 * PI * num;
    }

    public static double volume(double num) {
        return (4 * PI * Math.pow(num,3)/3);
    }
}
