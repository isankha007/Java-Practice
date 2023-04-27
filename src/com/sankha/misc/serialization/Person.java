package com.sankha.misc.serialization;

public class Person {
    String name="default";
    String nationality;

    public Person(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
