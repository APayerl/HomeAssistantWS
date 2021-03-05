package se.payerl.haws.types;

public class Forecast {
    private String condition;
    private Float precipitation;
    private Float precipitationProbability;
    private Float temperature;
    private Float templow;
    private String datetime;
    private Float windBearing;
    private Float windSpeed;

    public Forecast() {
        this.condition = null;
        this.precipitation = null;
        this.precipitationProbability = null;
        this.temperature = null;
        this.templow = null;
        this.datetime = null;
        this.windBearing = null;
        this.windSpeed = null;
    }

    public String getCondition() {
        return condition;
    }

    public Float getPrecipitation() {
        return precipitation;
    }

    public Float getPrecipitationProbability() {
        return precipitationProbability;
    }

    public Float getTemperature() {
        return temperature;
    }

    public Float getTemplow() {
        return templow;
    }

    public String getDatetime() {
        return datetime;
    }

    public Float getWindBearing() {
        return windBearing;
    }

    public Float getWindSpeed() {
        return windSpeed;
    }

    public Forecast setCondition(String condition) {
        this.condition = condition;
        return this;
    }

    public Forecast setPrecipitation(Float precipitation) {
        this.precipitation = precipitation;
        return this;
    }

    public Forecast setPrecipitationProbability(Float precipitationProbability) {
        this.precipitationProbability = precipitationProbability;
        return this;
    }

    public Forecast setTemperature(Float temperature) {
        this.temperature = temperature;
        return this;
    }

    public Forecast setTemplow(Float templow) {
        this.templow = templow;
        return this;
    }

    public Forecast setDatetime(String datetime) {
        this.datetime = datetime;
        return this;
    }

    public Forecast setWindBearing(Float windBearing) {
        this.windBearing = windBearing;
        return this;
    }

    public Forecast setWindSpeed(Float windSpeed) {
        this.windSpeed = windSpeed;
        return this;
    }
}