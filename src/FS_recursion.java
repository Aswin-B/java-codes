import java.util.Scanner;

public class FS_recursion {

//    static void r_num(int n){
//        if (n==1){
//            System.out.println(n);
//        }
//        else {
//            System.out.println(n);
//            r_num(n - 1);
//        }
//    }

//    static int r_fact(int n){
//        if (n==1){
//            return 1;
//        }
//        return n * r_fact(n-1);
//    }

    static int fib(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {

        //Print n number using loop
//        int n;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Any number to print upto N: ");
//        n = scanner.nextInt();
//
//        for(int i=n; i>=1; i--) {
//            System.out.println(i);
//        }

        // Print number using Recursion.
//        r_num(5);

//        System.out.println(r_fact(5));

        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any number to print upto N Fibonacci series: ");
        n = scanner.nextInt();

        for(int i=0; i<n; i++){
            System.out.print(fib(i) + " ");
        }

        System.out.println("\nEnter base number: ");
        int b = scanner.nextInt();
        System.out.println("Enter power number: ");
        int p = scanner.nextInt();


        if(p >= 0) {
            int power = 1;
            for (int i = 1; i <= p; i++) {
                power = b * power;
            }
            System.out.println(power);
        }
        else{
            double power = 1.0;
            for (int i = 1; i <= -p; i++) {
                power = b * power;
            }
            power = 1/ power;
            System.out.println(power);
        }




    }

}
