import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;
        double delTa;
        double x1;
        double x2;

        System.out.println("find x from ax2 + bx + c = 0");
        System.out.print("Input a: ");
        a = sc.nextDouble();
        System.out.print("Input b: ");
        b = sc.nextDouble();
        System.out.print("Input c: ");
        c = sc.nextDouble();

        if (a == 0.0) {
            if (b == 0.0) {
                if (c == 0) {
                    System.out.printf("phuong trinh vo so nghiem");

                } else {
                    System.out.printf("phuong trinh vo  nghiem");
                }
            } else {
                x1 = -c / b;
                System.out.printf("x1 = %.2f", x1);
            }
        } else {
            delTa = b * b - 4 * a * c;
            if (delTa < 0.0) {
                System.out.printf("phuong trinh vo nghiem");
            } else if (delTa == 0.0) {
                x1 = -b / (2 * a);
                System.out.printf("x1 = %.2f", x1);

            } else {
                x1 = (-b - Math.sqrt(delTa)) / (2 * a);
                x2 = (-b + Math.sqrt(delTa)) / (2 * a);

                System.out.printf("x1 = %.2f \t x2 = %.2f", x1, x2);
            }

        }

    }
}
