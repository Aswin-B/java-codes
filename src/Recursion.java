public class Recursion {

    static void recursionNum(int n){
        // base case
        if(n == 1){
            System.out.println(n);
        }
        // recursive case:
        else{
            System.out.println(n);
            recursionNum(n-1);
        }
    }

    static int fact(int n){
        //base case
        if(n==1){
            return 1;
        }
        //recursive case
        else{
            return n*fact(n-1);
        }

    }

    public static void main(String[] args) {
        int n = 5;

        recursionNum(n);

        System.out.println(fact(n));

    }
}
