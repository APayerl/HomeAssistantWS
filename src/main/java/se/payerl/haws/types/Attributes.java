package se.payerl.haws.types;

import com.google.gson.annotations.SerializedName;

public class Attributes {
    @SerializedName("friendly_name")
    private String friendlyName;
    @SerializedName("unit_of_measurement")
    private String unitOfMeasurement;

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