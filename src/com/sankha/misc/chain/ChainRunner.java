package com.sankha.misc.chain;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class ChainRunner {
    public static void main(String[] args) {
     /*   Student s=new Student();
        s.setCity("Kolkata").setAge(12).setName("sankha");
        System.out.println(s);*/
        Student student = Student.of()
                .setCity("Kolkata")
                .setAge(12)
                .setName("sankha");
        System.out.println(student);
        ///proxy test
     /*   Map fees=new HashMap();
        fees.put("java","4000");
        System.out.println(fees);*/
        Map fees= (Map) Proxy.newProxyInstance(
                HashMap.class.getClassLoader(),
                new Class[]{Map.class},
                new ObjectHandler(new HashMap<>())
        );
        fees.put("java","4000");

        System.out.println(fees);




    }
}
