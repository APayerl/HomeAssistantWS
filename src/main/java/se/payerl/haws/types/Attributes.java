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
        return friendlyName;
    }

    public String getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    public Attributes setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    public Attributes setUnitOfMeasurement(String unitOfMeasurement) {
        this.unitOfMeasurement = unitOfMeasurement;
        return this;
    }
}