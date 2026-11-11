import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] residents = new int[n];

        for (int i = 0; i < n; i++) {
            residents[i] = sc.nextInt();
        }

        int left = 0;
        int right = 0;
        int leftCount = 0;
        int rightCount = 0;

        for (int i = 0; i < n; i++) {
            if ((i + 1) % 2 == 1) {
                left += residents[i];
                leftCount++;
            } else {
                right += residents[i];
                rightCount++;
            }
        }

        int total = left + right;

        System.out.println("Total residents: " + total);
        System.out.println("Residents on the left: " + left);
        System.out.println("Residents on the right: " + right);

        if (leftCount > 0) {
            double avgLeft = (double) left / leftCount;
            System.out.printf(
                    "Average per house on the left: %s%n",
                    avgLeft == Math.floor(avgLeft)
                            ? String.format("%.0f", avgLeft)
                            : Double.toString(avgLeft)
            );
        } else {
            System.out.println("Average per house on the left: N/A");
        }

        if (rightCount > 0) {
            double avgRight = (double) right / rightCount;
            System.out.printf(
                    "Average per house on the right: %s%n",
                    avgRight == Math.floor(avgRight)
                            ? String.format("%.0f", avgRight)
                            : Double.toString(avgRight)
            );
        } else {
            System.out.println("Average per house on the right: N/A");
        }

        sc.close();
    }
}