package com.sankha.misc;

import java.util.Optional;

public class OptionalRunner {
    public static void main(String[] args) {
        OptionalRunner t= new OptionalRunner();
        Integer v1=null;
        Integer v2=10;
        Optional<Integer> a = Optional.ofNullable(v1);
        Optional<Integer> b =Optional.of(v2);
        System.out.println("SUm "+t.sum(a, b)+ " " + a.isEmpty());
    }

    private Integer sum(Optional<Integer> a, Optional<Integer> b) {

        //Optional.isPresent - checks the value is present or not

        System.out.println("First parameter is present: " + a.isPresent());
        System.out.println("Second parameter is present: " + b.isPresent());

        //Optional.orElse - returns the value if present otherwise returns
        //the default value passed.
        Integer value1 = a.orElse(new Integer(0));

        //Optional.get - gets the value, value should be present
        Integer value2 = b.get();
        return value1 + value2;
    }
}
