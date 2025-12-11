package OOP;

class RecBox{
    int length;
    int breadth;

    RecBox(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    RecBox(RecBox rb){ //Copy constructor
        this.length = rb.length;
        this.breadth = rb.breadth;
    }

    boolean isEqual(RecBox b){
//        b.length = 1000;
        if(this.length == b.length || this.breadth == b.breadth){
            return true;
        }
        return false;

    }

    int perimeterVolume(){
        return 2*(length*breadth);
    }

    int areaVolume(){
        return length*breadth;
    }

}

public class BoxClass {
    public static void main(String[] args) {
        int length_x = 10;
        RecBox b1 = new RecBox(length_x,30);
        RecBox b2 = new RecBox(10,20);



        System.out.println("B1 box is equal to B2 Box: " + b1.isEqual(b2));

        System.out.println(b1.perimeterVolume());
        System.out.println(b1.areaVolume());

        System.out.println(b2.perimeterVolume());
        System.out.println(b2.areaVolume());

//        RecBox b3 = new RecBox(b1);
//
//        System.out.println(b3.perimeterVolume());
//        System.out.println(b3.areaVolume());
    }
}
