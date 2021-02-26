package se.payerl.haws.types;

public class UnitSystem {
    private String length;
    private String mass;
    private String pressure;
    private String temperature;
    private String volume;

    public UnitSystem() {}

    public String getLength() {
        return length;
    }

    public String getMass() {
        return mass;
    }

    public String getPressure() {
        return pressure;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getVolume() {
        return volume;
    }

    public UnitSystem setLength(String length) {
        this.length = length;
        return this;
    }

    public UnitSystem setMass(String mass) {
        this.mass = mass;
        return this;
    }

    public UnitSystem setPressure(String pressure) {
        this.pressure = pressure;
        return this;
    }

    public UnitSystem setTemperature(String temperature) {
        this.temperature = temperature;
        return this;
    }

    public UnitSystem setVolume(String volume) {
        this.volume = volume;
        return this;
    }
}