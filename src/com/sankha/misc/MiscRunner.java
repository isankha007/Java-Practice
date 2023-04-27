package com.sankha.misc;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class MiscRunner {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c= Class.forName("com.sankha.misc.Student");
        String s="sankha";
        Method[] m=c.getDeclaredMethods();
        Class.forName("java.lang.String");
        for(Method md:m){
            System.out.println(md.getName());
        }

        System.out.println(String.class.getClassLoader());//as it is bootstrap CL and written in native not in Java
        System.out.println(MiscRunner.class.getClassLoader());
        System.out.println(Student.class.getClassLoader());


        int mb=1024*1024;
        Runtime r= Runtime.getRuntime();
        System.out.println(r.freeMemory()/mb);
        System.out.println(r.totalMemory()/mb);

        ArrayList<? extends Number> l=new ArrayList<>();
       // l.add(12.0);//only null can be added
        ArrayList<? super Number> l1=new ArrayList<>();
        l1.add(19);

    }
}
