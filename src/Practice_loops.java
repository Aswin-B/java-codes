import java.util.Scanner;

public class Practice_loops {
    public static void main(String[] args) {
        // Print first n Odd numbers:

        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number to first Odd numbers");
        n = scanner.nextInt();
        System.out.print("Odd numbers are: ");
        for(int i=1; i<=n; i++){
            int odd = ((2 * i) - 1);
            System.out.print(odd + " ");
        }

        // Print the Factorial the given num
        System.out.println();

        int num;
        System.out.println("Enter any number to find the Factorial");
        num = scanner.nextInt();
        long fact=1;
        for(int i=1; i <= num; i++){
            fact = fact * i;
        }
        System.out.println("The Factorial is " + fact);

        // Sum of n natural numbers:

        int number, total=0;
        System.out.println("Enter the any number ot find the Sum of n natural numbers: ");
        number = scanner.nextInt();

        for(int i=1; i<=number; i++){
            total = total + i;
        }
        System.out.println("The Sum is " + total);

        // Pattern printing:
        System.out.println("Pattern Printing 1");
        for(int x=1; x<=5; x++) {
            for (int y = 1; y <= 5; y++) {
                System.out.print("* ");
            }
            System.out.println('\n');
        }

        System.out.println("Pattern Printing 2");

        System.out.println("Enter Number for pattern");
        int loop_n = scanner.nextInt();

        for(int s=1; s<=loop_n; s++) {
            for (int t = 1; t <= s; t++) {
                System.out.print(t);
            }
            System.out.println('\n');
        }

        int nearest_num;
        System.out.println("Enter any number to find the nearest divisible by 10: ");
        nearest_num = scanner.nextInt();
        int original_num = nearest_num;

        while(nearest_num >=0){
            if(nearest_num % 10 == 0){
                System.out.println("The nearest for " + original_num + " is divisible by 10 is " + nearest_num);
                break;
            }
            nearest_num--;
        }
    }
}
