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
        System.out.println(t1.getArea());
    }
}
