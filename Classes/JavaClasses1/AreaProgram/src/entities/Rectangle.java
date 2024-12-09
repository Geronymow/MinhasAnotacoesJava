package entities;
/* Fazer um programa para ler os valores da largura e altura
de um retângulo. Em seguida, mostrar na tela o valor de
sua área, perímetro e diagonal. */

public class Rectangle {

    public double width;
    public double height;

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(width,2) + Math.pow(height,2));
    }

    public String toString() {
        return String.format("Area = %.2f%n",area())
                + String.format("Perimeter = %.2f%n",perimeter())
                + String.format("diagonal = %.2f%n",diagonal());
    }
}
