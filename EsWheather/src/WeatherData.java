import java.time.LocalDate;

public class WeatherData {
    private String city;
    private LocalDate date;
    private double temperature;
    private double precipitation;
    private int humidity;

    public WeatherData(String city, LocalDate date, double temperature, double precipitation, int humidity) {
        this.city = city;
        this.date = date;
        this.temperature = temperature;
        this.precipitation = precipitation;
        this.humidity = humidity;
    }

    public String getCity() {
        return city;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getPrecipitation() {
        return precipitation;
    }

    public int getHumidity() {
        return humidity;
    }

    @Override
    public String toString() {
        return city + " - " + date + " - " + temperature + "°C";
    }
}
