package com.sankha.decorator.starBuzz;

public class Soy extends CondimentDecorator{

    public Soy(Bevarage bevarage) {
        this.bevarage=bevarage;
    }

    @Override
    public String getDescription() {
        return bevarage.getDescription()+" Soy";
    }

    @Override
    public double getCost() {
        return bevarage.getCost()+.20;
    }
}
