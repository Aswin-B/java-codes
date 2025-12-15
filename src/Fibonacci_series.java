import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how may numbers do you want for Fibonacci series: ");
        n = scanner.nextInt();

        int a = 0, b = 1;
        int nextTerm;

        for(int i=0; i<n; i++){
            System.out.print(a + " ");

            nextTerm = a + b;
            a = b;
            b = nextTerm;

        }

    }
}
