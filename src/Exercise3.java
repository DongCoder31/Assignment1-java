import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double x;

        System.out.printf("Enter a: ");
        a = sc.nextDouble();
        System.out.printf("Enter b: ");
        b = sc.nextDouble();

        if (a == 0.0) {
            if (b == 0.0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }

        } else {
            x = -b / a;
            System.out.printf("x = %.2f", x);
        }
    }
}
