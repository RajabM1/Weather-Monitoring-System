package decorator;

public class TemperatureUnitsDecorator extends WeatherDecorator{
    public TemperatureUnitsDecorator(WeatherDisplayDecorator weatherDisplayDecorator) {
        super(weatherDisplayDecorator);
    }

    @Override
    public String display(double temperature, double humidity) {
        return super.display(convertToFahrenheit(temperature), humidity);
    }

    private double convertToFahrenheit(double temperatureInCelsius) {
        return (temperatureInCelsius * 9 / 5) + 32;
    }
}
