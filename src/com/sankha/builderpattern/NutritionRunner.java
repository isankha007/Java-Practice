package com.sankha.builderpattern;

public class NutritionRunner {
    public static void main(String[] args) {
   NutrationFacts cocaCola= new NutrationFacts.Builder(240,8)
           .calories(100).sodium(35).carbohydrate(27).build();
        System.out.println(cocaCola);

    }
}
