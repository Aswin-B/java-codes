interface Ridable{
    int MAX_SPEED = 80;
    public void display();
    default void speed(){
        System.out.println("The speed is " + MAX_SPEED);
    }

}

class Car implements Ridable{
    public void display(){
        System.out.println("This is from Car class : " + MAX_SPEED );
    }

}

public class InterfaceDemo {
    public static void main(String[] args) {
        Car c = new Car();
        c.display();
        c.speed();

        Ridable r1 = new Ridable() {
            @Override
            public void display() {
                System.out.println("This is an anonymous class from Interface ");
            }
        };

        r1.display();

        Ridable r2 = () -> System.out.println("This an Lambda Expression for Functional Interface");
        r2.display();
    }
}
