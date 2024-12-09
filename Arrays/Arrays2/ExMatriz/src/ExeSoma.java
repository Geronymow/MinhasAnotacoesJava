import java.util.Scanner;

public class ExeSoma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] mat1 = new int[m][n];
        int[][] mat2 = new int[m][n];
        int[][] mat3 = new int[m][n];

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("========================================");

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
               mat2[i][j] = sc.nextInt();
            }
        }
        System.out.println("========================================");

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                mat3[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        if (m != n) {
            System.out.println("Não é possível efetuar soma se M for diferente de n");
        }
        else {
            for (int i = 0; i < mat1.length; i++) {
                for (int j = 0; j < mat1[i].length; j++) {
                    System.out.print(mat3[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("========================================");
        }
        
        sc.close();
    }
}
