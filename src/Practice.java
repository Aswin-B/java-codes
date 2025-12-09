public class Practice {
    public static void main(String[] args) {
        int x = 15, y = 14, z = 20;
        int result;

        if((x > y) && (x > z)){
            System.out.println(x);
        }
        else if((y > x) && (y > z)){
            System.out.println(y);
        }
        else {
            System.out.println(z);
        }

        result = (x > y) ? (x > z) ? x : z : (y > z) ? y : z;

       System.out.println(result);
    }
}
