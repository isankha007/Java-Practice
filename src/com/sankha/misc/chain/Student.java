package com.sankha.misc.chain;

public class Student {
    private String name;
    private int age;
    private String city;

    private Student(){

    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }

    public Student setCity(String city) {
        this.city = city;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }


    public static Student of(){
        return new Student();
    }
}
