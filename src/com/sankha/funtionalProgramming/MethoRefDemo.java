package com.sankha.funtionalProgramming;

import java.util.List;

@FunctionalInterface
interface inf1{
    void m1();
}



public class MethoRefDemo {

    public static void m2() {
        System.out.println("Method called 2");
    }
    private static void print(Number number){
        System.out.println(number);
    }
    private static void printAll(List<Number> numbers){
        numbers.stream().forEach(MethoRefDemo::print);
    }
    public void m3() {
        System.out.println("Method called 3");
    }
    public static void main(String[] args) {
        inf1 im2 = MethoRefDemo::m2;
        im2.m1();
        printAll(List.of(1,2,3,4)) ;

    }
}
