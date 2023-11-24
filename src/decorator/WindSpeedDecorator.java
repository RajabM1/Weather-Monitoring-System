package decorator;

import observer.WeatherDataObserver;

public class WindSpeedDecorator extends WeatherDecorator{

    public WindSpeedDecorator(WeatherDisplayDecorator weatherDisplayDecorator) {
        super(weatherDisplayDecorator);
    }

    @Override
    public String display(double temperature, double humidity) {
        return super.display(temperature, humidity) + "\nWind speed: " + getWindSpeed();
    }

    private double getWindSpeed(){
        return 5;
    }
}
