package com.sankha.weather;

public class CurrentConditionDisplay implements Observer,DisplayElement{
    private float temperature;
    private float humidity;
    private WeatherData weatherdata;
    public CurrentConditionDisplay(WeatherData weatherdata){
        this.weatherdata =weatherdata;
        weatherdata.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Current condition "+temperature +"F degrees and "+humidity+"% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
            this.humidity=humidity;
            this.temperature=temp;
            display();
    }
}
