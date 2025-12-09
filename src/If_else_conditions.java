import java.util.Scanner;

public class If_else_conditions {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number: ");
        num = scanner.nextInt();

        if(num > 0){
            System.out.println("The given number is +ve");
        }
        else {
            if (num == 0){
                System.out.println("The given number is neutral");
            }
            else{
                System.out.println("The given number is -ve");
            }
        }

        // Example 2: Grade System = IF ELSE LADDER

        int marks;

        System.out.println("Enter the Marks (0-100)");
        marks = scanner.nextInt();

        if(marks >= 90){
            System.out.println("The grade is A");
        }
        else if(marks >= 80){
            System.out.println("The grade is B");
        }
        else if(marks >= 70){
            System.out.println("The grade is C");
        }
        else if (marks >= 60){
            System.out.println("The grade is D");
        }
        else {
            System.out.println("The grade is E");
        }

        // Conditional Operators: ? :

        int a,b,c;

        System.out.println("Enter 1st number");
        a = scanner.nextInt();
        System.out.println("Enter 2nd number");
        b = scanner.nextInt();

//        if(a > b)
//            c = a;
//        else
//            c = b;

        c = (a > b) ? a : b;

        System.out.println("The greater number is " + c);

        int x = 10, y = 15, z = 20;
       // int result;

        if((x > y) && (x > z)){
            System.out.println(x);
        }
        else if((y > x) && (y > z)){
            System.out.println(y);
        }
        else {
            System.out.println(z);
        }

      //  result = (x > y) ? (x > z) ? x : (y > x) ? (y > z) ? y : z;

      //  System.out.println(result);

    }
}
