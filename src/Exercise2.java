import java.util.Scanner;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double math;
        double physics;
        double chemistry;
        double avg;
        char rank;


        System.out.print("Input math: ");
        math = sc.nextDouble();
        System.out.print("Input physics: ");
        physics = sc.nextDouble();
        System.out.print("Input chemistry: ");
        chemistry = sc.nextDouble();


        avg = getAvg(math, physics, chemistry);
        System.out.printf("AVG = %.2f\n", avg);

        rank = calculateRank(avg);
        System.out.printf("AVG = %c\n", rank);


    }

    private static double getAvg(double a, double b, double c) {
        return (a + b + c) / 3;

    }

    private static char calculateRank(double value) {
        if (value >= 8)
            return 'A';
        if (value >= 6.5)
            return 'B';
        if (value >= 5)
            return 'C';
        return 'D';
    }


}
