package util;

/* Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
para ser responsável pelos cálculos. */

public class Calculator {

    public static final double tax = 0.06;

    public double realDollarPrice(double dollarPrice, double realPrice) {
        /* Variáveis dollarPrice e realPrice iniciadas */
        return (realPrice * dollarPrice * tax) + (realPrice * dollarPrice);
    }
}
