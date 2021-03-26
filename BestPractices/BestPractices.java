package BestPractices;

// 1. When accessing data *outside* of a class, use getters and setters.
// 2. Most "member variables" should be declared private or protected.
// 3. Put member variables at the top of the class, functions at the bottom.
// 4. Arrange the getters/setters in the same order as the member variables.
// 5. You only need to add the getters/setters you are using.
// 6. Create a constructor that initializes all member variables.

class Weather {

    private double temperature;
    private int chanceOfPrecipitation;
    private String cloudCoverage;
    private boolean cold;

    public final static String ColorOfTheSky = "Blue";

    public void setTemperature(double temperature) {
        cold = (temperature < 0.0);
        this.temperature = temperature;
    }

    public void setChanceOfPrecipitation(int chanceOfPrecipitation) {
        this.chanceOfPrecipitation = chanceOfPrecipitation;
    }

    public void setCloudCoverage(String cloudCoverage) {
        this.cloudCoverage = cloudCoverage;
    }

    Weather() {
        setTemperature(0.0);
        this.chanceOfPrecipitation = 50;
        this.cloudCoverage = "Clear";
    }


    Weather(double temperature) {
        this.temperature = temperature;
        this.chanceOfPrecipitation = 50;
        this.cloudCoverage = "Clear";
        this.cold = false;
    }
}

public class BestPractices {

    public static void main(String[] args) {

        Weather todaysWeather = new Weather();
        todaysWeather.setTemperature(10.0);
        todaysWeather.setChanceOfPrecipitation(25);
        todaysWeather.setCloudCoverage(Weather.ColorOfTheSky);

        Weather tomorrowsWeather = new Weather(10.0);



    }

}
