import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int subjects = sc.nextInt();
        int students = sc.nextInt();

        int[][] grades = new int[students][subjects];
        int[] sums = new int[students];
        boolean[] belowFive = new boolean[students];

        int total = 0;
        int highestSum = -1;

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < subjects; j++) {
                grades[i][j] = sc.nextInt();
                sums[i] += grades[i][j];

                if (grades[i][j] < 5) {
                    belowFive[i] = true;
                }
            }

            total += sums[i];

            if (sums[i] > highestSum) {
                highestSum = sums[i];
            }
        }

        System.out.println("Student averages:");

        for (int i = 0; i < students; i++) {
            double average = (double) sums[i] / subjects;
            System.out.println(format(average));
        }

        double groupAverage =
                (double) total / (students * subjects);

        System.out.println();
        System.out.println("Group average:");
        System.out.println(format(groupAverage));

        System.out.println();
        System.out.println("Highest-performing student:");

        for (int i = 0; i < students; i++) {
            if (sums[i] == highestSum) {
                System.out.println(i + 1);
            }
        }

        System.out.println();
        System.out.println(
                "Students with at least one grade below 5:"
        );

        boolean found = false;

        for (int i = 0; i < students; i++) {
            if (belowFive[i]) {
                System.out.println(i + 1);
                found = true;
            }
        }

        if (!found) {
            System.out.println("None");
        }

        sc.close();
    }

    static String format(double number) {
        if (number == Math.floor(number)) {
            return String.format("%.0f", number);
        }
        return Double.toString(number);
    }
}