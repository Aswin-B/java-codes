public class Varargs {

    static int minValue(int... vals){
        int minValue = Integer.MAX_VALUE;

        for(int k: vals){
            if(k < minValue){
                minValue = k;
            }
        }
        return minValue;
    }

    public static void main(String[] args) {

        System.out.println("The minimum values of the Variable length " +
                "arguments array is: " +  minValue(10,11,15,8,11,7));



    }
}
