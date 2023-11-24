package observer;

public interface WeatherSubject {
    void add(WeatherDataObserver observer);
    void remove(WeatherDataObserver observer);
    void notifyAllObservers();
}
