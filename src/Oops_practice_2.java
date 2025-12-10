class Student{
    String name;
    String stdID;
    int std;
    int[] marks;
    Student(String name, String stdID, int std, int marks[]){
        this.name = name;
        this.stdID = stdID;
        this.std = std;
        this.marks = marks;
    }

    int getTotal(){
        int sum=0;
        for(int i=0; i<marks.length; i++){
            sum = sum + marks[i];
        }
        return sum;
    }

    float getAvg(){
        return getTotal() / marks.length;
    }

    void displayDetails(){

        System.out.println("---- Student Details ----");
        System.out.println("Student ID       : " + stdID);
        System.out.println("Student Name     : " + name);
        System.out.println("Standard         : " + std);
        System.out.print("Student Marks    : ");

        for(int x : marks){
            System.out.print(x + " ");
        }

        System.out.println("\nTotal Marks is   : " + getTotal() + " / " + (marks.length * 100));
        System.out.println("Average of Marks : " + getAvg());
    }
}


public class Oops_practice_2 {

    public static void main(String[] args) {

        Student std1 = new Student("Ram", "S101", 10, new int[]{100, 100, 100, 99, 99, 100});

        std1.displayDetails();

//        int[] c;
//
//        c = new int[]{1,2,3,4,5}; // correct way.

        //-------------------//

       // int[] c = new int[5];
//
//        c = new int[]{1,2,3,4,5}; // not a correct method.

        Student std2 = new Student("Ajay", "S102", 10, new int[]{100, 100, 100, 99});

        std2.displayDetails();


    }
}
