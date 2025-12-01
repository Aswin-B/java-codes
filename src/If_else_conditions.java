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
    }
}
