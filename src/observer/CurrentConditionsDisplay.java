package observer;

public class CurrentConditionsDisplay implements WeatherDataObserver{
    @Override
    public String display(double temperature, double humidity) {
        return ("The current temperature: " + temperature + "\nThe current humidity: " + humidity);
    }
}
