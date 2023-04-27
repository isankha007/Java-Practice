package com.sankha.decorator.starBuzz;

public abstract class Bevarage {
    String description="Some unknown Bevarage";

    public String getDescription() {
        return description;
    }

    public abstract double getCost();
}
