import decorator.PrecipitationDecorator;
import decorator.TemperatureUnitsDecorator;
import decorator.WeatherDisplayDecorator;
import decorator.WindSpeedDecorator;
import observer.CurrentConditionsDisplay;
import observer.StatisticsDisplay;
import observer.WeatherDataSubject;

public class Main {
    public static void main(String[] args) {

        WeatherDataSubject weatherDataSubject = new WeatherDataSubject();
        weatherDataSubject.add(new CurrentConditionsDisplay());
        weatherDataSubject.add(new StatisticsDisplay());

        WeatherDisplayDecorator weatherDisplayDecorator = new WindSpeedDecorator(new TemperatureUnitsDecorator(new PrecipitationDecorator(weatherDataSubject)));

        System.out.println("Weather without Decorator");
        weatherDataSubject.setWeather(25.0,70.0);

        System.out.println("--------------------------------");

        System.out.println("Weather with Decorator");
        System.out.println(weatherDisplayDecorator.display(25.0,70.0));;



    }
}