package inheritanceOOPS;

import java.lang.reflect.Method;

public class demo {
    public static void main(String[] args) {
        companyEmployee e1 = new companyEmployee("Ashok", "101", 25000);

        Class cls =  e1.getClass();
        System.out.println(cls.getName());

        Method[] methods =  cls.getMethods();

        for(Method m : methods){
            System.out.println(m.getName());
        }


    }
}
