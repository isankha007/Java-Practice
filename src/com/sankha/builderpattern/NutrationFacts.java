package com.sankha.builderpattern;

public class NutrationFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder{
        //required parameter
        private  int servingSize;
        private  int servings;
        //optional initialized to default values
        private  int calories=0;
        private  int fat=0;
        private  int sodium=0;
        private  int carbohydrate=0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }
         public Builder calories(int val){
            calories=val;
            return  this;
         }
        public Builder fat(int val){
            fat=val;
            return  this;
        }
        public Builder sodium(int val){
            sodium=val;
            return  this;
        }
        public Builder carbohydrate(int val){
            carbohydrate=val;
            return  this;
        }
        public NutrationFacts build(){
            return new NutrationFacts(this);
        }
    }
    private NutrationFacts(Builder builder){
        servingSize=builder.servingSize;
        servings=builder.servings;
        calories=builder.calories;
        fat=builder.fat;
        sodium=builder.sodium;
        carbohydrate=builder.carbohydrate;
    }

    @Override
    public String toString() {
        return "NutrationFacts{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }
}
