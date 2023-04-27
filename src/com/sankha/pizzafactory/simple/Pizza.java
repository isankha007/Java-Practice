package com.sankha.pizzafactory.simple;

import java.util.ArrayList;
import java.util.List;

 public abstract class Pizza {
     String name;
     String dough;
     String sauce;
     List<String> toppings =new ArrayList<>();

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }

    @Override
    public String toString() {
        StringBuffer display=new StringBuffer();
        display.append("---- ").append(name).append(" ----\n");
        display.append(dough).append("\n");
        display.append(sauce).append("\n");
        for(String toping:toppings){
            display.append(toping).append("\n");
        }
        return display.toString();
    }
}
