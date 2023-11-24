package decorator;

public abstract class WeatherDecorator implements WeatherDisplayDecorator {
    private WeatherDisplayDecorator weatherDisplayDecorator;

    public WeatherDecorator(WeatherDisplayDecorator weatherDisplayDecorator){
         this.weatherDisplayDecorator = weatherDisplayDecorator;
    }

    @Override
    public String display(double temperature, double humidity) {
        return this.weatherDisplayDecorator.display(temperature,humidity);
    }
}
