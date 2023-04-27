package com.sankha.decorator.starBuzz;

public class DarkRoast extends Bevarage{
    public DarkRoast() {
        description="DarkRoast";
    }

    @Override
    public double getCost() {
        return .99;
    }


}
