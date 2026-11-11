import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            matrix[i][i] = 0;
            matrix[i][n - 1 - i] = 0;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j > 0) {
                    System.out.print(" ");
                }
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}