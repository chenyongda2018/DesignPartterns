import ObserverInJava.CurrentCondition;
import ObserverableInJava.WeatherDataObservable;
import Subject.WeatherData;
import observer.CurrentConditions;

import java.util.Observable;
import java.util.Observer;

public class TestObserver {
    public static void main(String[] args) {
//        WeatherData weatherData = new WeatherData();
//
//        weatherData.registerObserver(new CurrentConditions("开封"));
//        weatherData.registerObserver(new CurrentConditions("郑州"));
//
//        weatherData.setData(15,20,30);


        WeatherDataObservable weatherDataObservable = new WeatherDataObservable();
        weatherDataObservable.addObserver(new CurrentCondition("小明"));
        weatherDataObservable.addObserver(new CurrentCondition("小红"));

        weatherDataObservable.setData(10,20,30);

    }
}
