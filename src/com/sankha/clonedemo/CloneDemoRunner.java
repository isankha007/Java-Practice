package com.sankha.clonedemo;

public class CloneDemoRunner {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.setName("Hulo");
        Dog d= new Dog(cat,"Bhulo");
        Dog d2= (Dog) d.clone();
        System.out.println(d.getCat().getName()+" "+d2.getCat().getName());
        cat.setName("Kelo");
        System.out.println(d.getCat().getName()+" "+d2.getCat().getName());

        // d.setCat(cat);

    }
}
