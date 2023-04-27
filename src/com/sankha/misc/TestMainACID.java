package com.sankha.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//package com.udayankhattry.oca;

 interface Super {
    String name = "SUPER"; //Line n1
}


//Sub.java
//package com.udayankhattry.oca;

interface Sub extends Super { //Line n2

}
public class TestMainACID {
    public static void main(String[] args) {
        String str="My name is Sankhadeep your name is Sankhadeep";

        List<String> list=new ArrayList<>();
        String[] s = str.split(" ");
        Map<String, Long> collectValue = Arrays.stream(s).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collectValue);
       /* Optional optional=Optional.of(null);
        if(optional())
            System.out.println(optional.get());
        else {
            System.out.println("value is null");
        }*/

//        Sub sub=null;
//        System.out.println(sub);
    }
}
