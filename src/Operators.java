import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        //Arithmetic Operators : + - & /

        int a = 10, b = 2, c;
//        c = a + b;
//        c = a - b;
//        c = a * b;
//        c = a / b;
//
//        c= a % b;
//        System.out.println(c);
//
        // Compound Operators:

//        a = a + b;
//
//        a += b;
//        System.out.println(a);

        // Increment / Decrement Operators

        c = a++;
//c = 10, a=11
        c = ++a;

        System.out.println("C is " + c);
        System.out.println("A is " + a);

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter 1st Number: ");
//        byte fn1 = scanner.nextByte();
//
//        System.out.println("Enter 2nd Number: ");
//        byte fn2 = scanner.nextByte();

//        byte fn3;
//
//        fn3 = (byte) (fn1 + fn2);

//        System.out.println(fn3);

        int x = 3, y=4, z;

        z = x+y + x++ + y++ + ++x + ++y;

        //14 + 5 + 6 = 25

        System.out.println("X is " + x);
        System.out.println("Y is " + y);
        System.out.println("Z is " + z);

//        String myString = scanner.next();
        int myInt = scanner.nextInt();
        scanner.close();

//        System.out.println("myString is: " + myString);
        System.out.println("myInt is: " + myInt);

        System.out.println("    " + myInt);
        System.out.println("   " + myInt + "" + myInt + "" + myInt);
        System.out.println("  " + myInt + "" + myInt + "" + myInt + "" + myInt + "" + myInt);
        System.out.println(" " + myInt + "" + myInt + "" + myInt + "" + myInt + "" + myInt + "" + myInt + "" + myInt);


        int k = 8;
        char j = 'J';

        System.out.println(k + 'J');

        String result =  k + j + "";
        System.out.println(((Object)result).getClass().getName());

    }
}
