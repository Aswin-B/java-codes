import java.util.Scanner;

public class Input_demo {
    public static void main(String[] args) {

        float max_r = 5.0f;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Name ? ");
        String name = scanner.nextLine();

        System.out.println("Enter your Rating for our Application upto 5 ?");

        float rating = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Enter you Email Id for our Reference ? ");

        String mail = scanner.nextLine();

        /********** Print statement comments: *************/
        System.out.println("Hey, " + name + " !!");
        System.out.println("Thank U,\nYou have given " + rating + "/" + max_r + " star rating");
        System.out.println("Any Job postings, We will send an email to " + mail);

        System.out.println("Enter any Number ? ");

        byte any_num = scanner.nextByte();
        System.out.println(any_num);



    }
}
