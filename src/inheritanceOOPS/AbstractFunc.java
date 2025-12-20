package inheritanceOOPS;

abstract class Shape{
    abstract double getArea();
}

class Triangle extends Shape{

    double length;
    double breadth;
    Triangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public double getArea(){
        return 0.5*this.length*this.breadth;
    }

}


public class AbstractFunc {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(10,10);
        //System.out.println(t1.getArea());

        String s1 = "Java";
        String s2 = "Java";

        String s3 = new String("Java");
        String s4 = new String("Java");

        System.out.println(s3.equals(s4));

    }
}
