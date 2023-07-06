package app.Task4;

public class TemperatureRangeException extends Exception{
    public TemperatureRangeException() {
        super("Температура перевищує допустимі межі.");
}
}
