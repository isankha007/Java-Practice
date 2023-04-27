package com.sankha.weather;

public class WeatherStation {
    public static void main(String[] args) throws InterruptedException {
        WeatherData weatherData=new WeatherData();
        CurrentConditionDisplay currentConditionDisplay=new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay= new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay= new ForecastDisplay(weatherData);

        weatherData.seMeasurement(80,65,30.4f);
        Thread.sleep(5000);
        weatherData.seMeasurement(82,71,29.4f);
        Thread.sleep(5000);
        weatherData.seMeasurement(77,90,29.2f);

    }
}
