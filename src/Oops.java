class Box{
    int length;
    int breadth;
    int height;

    int volume(){
        return length*breadth*height;
    }
}

class library{
    String userName;
    int userId;
    String bookId_borrrowed;
    String bookName;
    String returnMsg;
}


public class Oops {

    static int findVolume(int l, int b, int h){
        int vol = l*b*h;
        return vol;
    }

    static void welcomeMsg(){
        System.out.println("Welcome to the Code !!");
    }

    static int sumDigits(int a){
        int sum = 0;
        for(int i=1; i<=a; i++){
            sum = sum + i;
        }
        welcomeMsg();
        return sum;
    }

    static boolean findtwoDigits(int d){
        if((d >= 10 && d <= 99) || (d>= -99 && d <= -10)){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        Box woodenBox = new Box();

        woodenBox.length = 10;
        woodenBox.breadth = 15;
        woodenBox.height = 20;

        Box blackBox = new Box();

        blackBox.height = 25;

        System.out.println("Wooden Box's height: " + woodenBox.height + " cm");
        System.out.println("Black Box's height: " + blackBox.height + " cm");

        System.out.println("Wooden Box volume is: " + woodenBox.volume());

        library u1 = new library();

        u1.userName = "Ram";
        u1.userId = 10123;
        u1.bookId_borrrowed = "B1025";
        u1.bookName = "Sherlok Homes";
        u1.returnMsg = "Book borrowed on 14/11/2025";

        System.out.println("Hey " + u1.userName + ",\nYou have borrowed " + u1.bookName+ " Book." + "\nEnjoy Reading. Have Nice Day." );

        System.out.println(findVolume(10,10,10));
        int vol = findVolume(10,20,10);
        System.out.println("The 2nd box volume is " + vol);

        System.out.println("Sum of Digits is: " + sumDigits(2));
        System.out.println("Sum of Digits is: " + sumDigits(4));

        System.out.println(findtwoDigits(-40));

    }

}
