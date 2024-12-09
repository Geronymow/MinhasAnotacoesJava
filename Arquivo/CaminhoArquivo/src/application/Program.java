package application;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("getName: " + path.getName());
        // Pega o nome, desprezando o caminho.

        System.out.println("getParent: " + path.getParent());
        // Pega o caminho sem o nome do arquivo

        System.out.println("getPath: " + path.getPath());
        // Pega o caminho + nome
    }
}
