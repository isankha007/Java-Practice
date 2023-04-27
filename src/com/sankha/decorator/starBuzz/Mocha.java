package com.sankha.decorator.starBuzz;

public class Mocha extends CondimentDecorator{

    public Mocha(Bevarage bevarage) {
        this.bevarage=bevarage;
    }

    @Override
    public String getDescription() {
        return bevarage.getDescription()+" Mocha";
    }

    @Override
    public double getCost() {
        return .10+bevarage.getCost();
    }
}
