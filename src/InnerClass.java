
class OuterClass{
    public void OuterFunc(){
        System.out.println("This is outer Class function");
    }
    class InnerClass{
        public void InnerFunc(){
            System.out.println("This is Inner class function");
        }
    }
}


public class InnerClass {
    public static void main(String[] args) {
        OuterClass o1 = new OuterClass();
        o1.OuterFunc();

        OuterClass.InnerClass i1 = o1.new InnerClass();
        i1.InnerFunc();
    }
}
