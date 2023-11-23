package observer;

import decorator.WeatherDisplayDecorator;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataSubject implements WeatherSubject, WeatherDisplayDecorator {

    private List<WeatherDataObserver> observers = new ArrayList<>();
    private double temperature = 0.0;
    private double humidity = 0.0;

    @Override
    public void add(WeatherDataObserver observer){
        observers.add(observer);
    }
    @Override
    public void remove(WeatherDataObserver observer){
        observers.remove(observer);
    }
    @Override
    public void notifyAllObservers() {
        for (WeatherDataObserver observer : observers) {
            System.out.println(observer.display(temperature, humidity));
            System.out.println();
        }
    }
    public void setWeather(double temperature, double humidity){
        this.temperature = temperature;
        this.humidity = humidity;
        notifyAllObservers();
    }

    @Override
    public String display(double temperature, double humidity) {
        setWeather(temperature,humidity);
        return "";
    }
}
