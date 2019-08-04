package top.zou.observer_patterns;

/**
 * @author dingxiang
 * @date 19-8-4 上午11:00
 */
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setWeatherData("100","90","100KPa");
    }
}
