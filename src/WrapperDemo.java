public class WrapperDemo {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(15); // boxing
        //System.out.println(i1);

        int j = i1.intValue();
        System.out.println(j); // unboxing;

        Integer i2 = 20; // autoboxing;
        int k = i2; // autounboxing;

        System.out.println(k);

        String num = "123";
        int n = Integer.parseInt(num);

        System.out.println(n);
    }
}
