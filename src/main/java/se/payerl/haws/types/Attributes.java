package se.payerl.haws.types;

public class Attributes {
    private String friendlyName;
    private String unitOfMeasurement;

    public Attributes() {}
    public Attributes(String unitOfMeasurement, String friendlyName) {
        this.unitOfMeasurement = unitOfMeasurement;
        this.friendlyName = friendlyName;
    }

    public String getFriendlyName() {
        return this.friendlyName;
    }

    public String getUnitOfMeasurement() {
        return this.unitOfMeasurement;
    }
}