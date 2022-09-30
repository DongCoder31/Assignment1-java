import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c ;
        int a = sc.nextInt();
        int b = sc.nextInt();


        c = a;
        a = b;
        b = c;

        System.out.printf("result : %d and \t %d  ", a, b);
    }
}
