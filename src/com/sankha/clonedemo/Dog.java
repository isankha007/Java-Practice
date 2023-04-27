package com.sankha.clonedemo;

public class Dog implements Cloneable{
    private Cat cat;

    private String name;

    public Dog(Cat cat, String name) {
        this.cat = cat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }


    @Override
    public Dog clone() {
        try {
            Dog dog = (Dog) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            Cat c=new Cat();//without this lines it will be shallow copy
            c.setName(dog.getCat().getName());
            dog.setCat(c);
            return dog;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

