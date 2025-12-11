package OOP;

public class Stack_demo {
    public static void main(String[] args) {
        Stack s1 = new Stack();

        s1.push(1);
        s1.push(2);
//        s1.push(3);
//        s1.push(4);
//        s1.push(5);
//        s1.push(6);
//        s1.push(7);
//        s1.push(8);
//        s1.push(9);
//        s1.push(10);
//
//        s1.push(11);

        System.out.println(s1.pop());
        s1.push(3);
        s1.push(8);

        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());

    }
}
