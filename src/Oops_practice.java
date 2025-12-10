import java.util.Scanner;

class student{
    int studentID;
    String name;
    int std;
    int[] marks = new int[5];

    int getTotal(){
        int sum=0;
        for(int i=0; i<marks.length; i++){
            sum = sum + marks[i];
        }
        return sum;
    }

    double getAvg(){
        return getTotal() / marks.length;
    }

    void displayDetails(){

        System.out.println("---- Student Details ----");
        System.out.println("Student ID       : " + studentID);
        System.out.println("Student Name     : " + name);
        System.out.println("Standard         : " + std);
        System.out.print("Student Marks    : ");

        for(int x : marks){
            System.out.print(x + " ");
        }

        System.out.println("\nTotal Marks is   : " + getTotal() + " / 500");
        System.out.println("Average of Marks : " + getAvg());
    }
}

public class Oops_practice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        student st1 = new student();
        st1.studentID = 101;
        st1.name = "Ajay";
        st1.std = 10;
        System.out.println("Enter the Student 5 Subject marks: ");
        for(int i=0; i<st1.marks.length; i++){
            st1.marks[i] = scanner.nextInt();
        }

//        System.out.println("The toal marks is " + st1.getTotal());

        st1.displayDetails();

    }
}
