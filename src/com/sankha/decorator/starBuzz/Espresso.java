package com.sankha.decorator.starBuzz;

public class Espresso extends Bevarage{
    public Espresso() {
        description="Espresso";
    }

    @Override
    public double getCost() {
        return 1.99;
    }


}
