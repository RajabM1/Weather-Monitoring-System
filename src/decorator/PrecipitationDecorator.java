package decorator;

public class PrecipitationDecorator extends WeatherDecorator{
    public PrecipitationDecorator(WeatherDisplayDecorator weatherDisplayDecorator) {
        super(weatherDisplayDecorator);
    }

    @Override
    public String display(double temperature, double humidity) {
        return super.display(temperature, humidity) + getWeatherStatus();
    }

    private String getWeatherStatus(){
        return "\nIts raining";
    }
}
