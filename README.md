# Weather-Monitoring-System

# Observer:
### First I create a WeatherSubject interface that has add, remove and notifyAllObservers methods.
### Then WeatherDataSubject class this class implements from WeatherSubject interface and has a list of observers to notify them when the weather change
### Then WeatherDataObserver interface that has a display method and the classes StatisticsDisplay and CurrentConditionsDisplay implements from him by using this way it allows to us to make the class has his own methods to display the data 

#### By following the previous steps we apply the Observer design pattern this design allow us to notify when the data change and make the code more maintainable because the code spread in a subclasses   

# Decorator:
### First I create a WeatherDisplayDecorator interface that has a display methods.
### Then make a concrete classes StatisticsDisplay and CurrentConditionsDisplay implements from WeatherDisplayDecorator this classes has a data without any decorator
### Then make an abstract class WeatherDecorator implements from WeatherDisplayDecorator to allow us to wrap any time by adding a new decorator  
### From the abstract class you can add any feathers to the app without changes in the old file by using this way we apply an open close principle

#### By following the previous steps we apply the Decorator design pattern his design allow us to apply an Open Close principle, and apply single responsibility by spread the class to subclass each class has a one functionality  

# Integration:
### To integrate the Observer and Decorator design pattern, first I deleted "StatisticsDisplay" and "CurrentConditionsDisplay" from decorator package
### Then make the WeatherDataSubject class implement from WeatherDisplayDecorator interface 
### By using this way allow to us to make a dynamic app that allow the user to show the weather temperature without any decorator and make them choose if they want to add additional information or not.

