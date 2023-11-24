package observer;

public class StatisticsDisplay implements WeatherDataObserver{
    private double temperature = 0.0;
    private double humidity = 0.0;
    private int count = 0;
    @Override
    public String display(double temperature, double humidity) {
        this.temperature += temperature;
        this.humidity += humidity;
        count++;

        double temperatureAvg = this.temperature / count;
        double humidityAvg = this.humidity / count;

        return ("The Average of temperature: " + temperatureAvg + "\nThe Average of humidity: " + humidityAvg);
    }
}
