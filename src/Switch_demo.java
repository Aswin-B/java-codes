import java.util.Scanner;

public class Switch_demo {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st Number: ");
        a = scanner.nextInt();
        System.out.println("Enter the 2nd Number: ");
        b = scanner.nextInt();
        char operator;
        System.out.println("Enter the operator symbol: +, -, *, %, /: ");
        operator = scanner.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println(a + " + " + b + " = " + (a+b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + (a-b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + (a*b));
                break;
            case '/':
                System.out.println(a + " / " + b + " = " + (a/b));
                break;
            case '%':
                System.out.println(a + " % " + b + " = " + (a%b));
                break;
            default:
                System.out.println("You have entered incorrect operator");

        }

        int week_n;
        System.out.println("Enter the Week number");
        week_n = scanner.nextInt();

        switch (week_n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a week number");
        }

        char alphabet;
        System.out.println("Enter the Alphabet");
        alphabet = scanner.next().charAt(0);
        alphabet = Character.toLowerCase(alphabet);
        switch (alphabet){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(alphabet + " is a Vowel");
            default:
                if (alphabet >= 'a' && alphabet <='z'){
                    System.out.println(alphabet + " is an Consonant");
                }
                else {
                    System.out.println("Invalid input (Not a alphabet)");
                }
        }
    }
}
