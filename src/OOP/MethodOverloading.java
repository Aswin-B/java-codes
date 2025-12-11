package OOP;

public class MethodOverloading {

    static int max(int a, int b){
        return a>b ? a : b;
    }

    static double max(double a, double b){
        return a>b ? a : b;
    }

    static char max(char a, char b){
        return a>b ? a : b;
    }

    static String max(){
        return "The method with 0 parameter";
    }

    static int avg(int a, int b){
        return (a+b) / 2;
    }

    static double avg(double a, double b){
        return (a+b) / 2;
    }

    public static void main(String[] args) {

        System.out.println(max(5, 8));
        System.out.println(max());

        System.out.println(avg(100, 80));
        System.out.println(avg(100.50, 80.80));
    }
}
