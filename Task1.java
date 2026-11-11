import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] radius = new int[n];

        int max = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            radius[i] = sc.nextInt();

            if (i == 0 || radius[i] > max) {
                max = radius[i];
                count = 1;
            } else if (radius[i] == max) {
                count++;
            }
        }

        System.out.println(max + " - " + count);

        sc.close();
    }
}