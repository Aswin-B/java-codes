import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i=1; i<=5; i++){
            System.out.print("*");
            if(i == 5){
                System.out.println();
            }
        }

        int j = 1;
        while (j<=5){
//            j=1;
            System.out.print(j);
            j++;
        }

        System.out.println();
        int z = 4;
        do{
            System.out.print(z);
            z++;
        }
        while (z <= 5);

        System.out.println();

        int choice;

        do {
            System.out.println("1. Say Hello");
            System.out.println("2. Say Bye");
            System.out.println("3. Exit");

            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Hello!");
            } else if (choice == 2) {
                System.out.println("Bye!");
            } else if (choice == 3) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid choice");
            }

        } while (choice != 3);

    }
}
