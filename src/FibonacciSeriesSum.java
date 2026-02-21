import java.util.Scanner;

public class FibonacciSeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0, b = 1, sum = 0;

        System.out.print("Fibonacci Series is : ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            sum += a;

            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println(sum);
        sc.close();
    }
}
