package com.sankha.decorator.starBuzz;

public class StarBuzzCoffee {
    public static void main(String[] args) {
        Bevarage bevarage1=new Espresso();
        System.out.println(bevarage1.getDescription()+" "+bevarage1.getCost());

        Bevarage bevarage2=new DarkRoast();
        bevarage2 =new Mocha(bevarage2);
        bevarage2 =new Soy(bevarage2);

        System.out.println(bevarage2.getDescription()+" "+bevarage2.getCost());

    }
}
