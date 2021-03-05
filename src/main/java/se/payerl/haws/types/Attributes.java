package se.payerl.haws.types;

public class Attributes {
    private String friendlyName;
    private String unitOfMeasurement;
    private Integer supportedFeatures;
    private String codeFormat;
    private String changedBy;
    private Boolean codeArmRequired;
    private String prePendingState;
    private String postPendingState;
    private String nextDawn;
    private String nextDusk;
    private String deviceClass;
    private Double temperature;
    private String icon;
    private String lastTriggered;
    private String nextMidnight;
    private Byte currentPosition;
    private Float batteryVoltage;

    public Attributes() {
        this.friendlyName = null;
        this.unitOfMeasurement = null;
        this.supportedFeatures = null;
        this.codeFormat = null;
        this.changedBy = null;
        this.codeArmRequired = null;
        this.prePendingState = null;
        this.postPendingState = null;
        this.nextDawn = null;
        this.deviceClass = null;
        this.nextDusk = null;
        this.temperature = null;
        this.icon = null;
        this.lastTriggered = null;
        this.nextMidnight = null;
        this.currentPosition = null;
        this.batteryVoltage = null;
    }

    public String getFriendlyName() {
        return friendlyName;
    }

    public String getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    public Integer getSupportedFeatures() {
        return supportedFeatures;
    }

    public String getCodeFormat() {
        return codeFormat;
    }

    public String getChangedBy() {
        return changedBy;
    }

    public Boolean getCodeArmRequired() {
        return codeArmRequired;
    }

    public String getPrePendingState() {
        return prePendingState;
    }

    public String getPostPendingState() {
        return postPendingState;
    }

    public String getNextDawn() {
        return nextDawn;
    }

    public String getDeviceClass() {
        return deviceClass;
    }

    public String getNextDusk() {
        return nextDusk;
    }

    public Double getTemperature() {
        return temperature;
    }

    public String getIcon() {
        return icon;
    }

    public String getLastTriggered() {
        return lastTriggered;
    }

    public String getNextMidnight() {
        return nextMidnight;
    }

    public Byte getCurrentPosition() {
        return currentPosition;
    }

    public Float getBatteryVoltage() {
        return batteryVoltage;
    }

    public Attributes setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    public Attributes setUnitOfMeasurement(String unitOfMeasurement) {
        this.unitOfMeasurement = unitOfMeasurement;
        return this;
    }

    public Attributes setSupportedFeatures(int supportedFeatures) {
        this.supportedFeatures = Integer.valueOf(supportedFeatures);
        return this;
    }

    public Attributes setCodeFormat(String codeFormat) {
        this.codeFormat = codeFormat;
        return this;
    }

    public Attributes setChangedBy(String changedBy) {
        this.changedBy = changedBy;
        return this;
    }

    public Attributes setCodeArmRequired(boolean codeArmRequired) {
        this.codeArmRequired = Boolean.valueOf(codeArmRequired);
        return this;
    }

    public Attributes setPrePendingState(String prePendingState) {
        this.prePendingState = prePendingState;
        return this;
    }

    public Attributes setPostPendingState(String postPendingState) {
        this.postPendingState = postPendingState;
        return this;
    }

    public Attributes setNextDawn(String nextDawn) {
        this.nextDawn = nextDawn;
        return this;
    }

    public Attributes setDeviceClass(String deviceClass) {
        this.deviceClass = deviceClass;
        return this;
    }

    public Attributes setNextDusk(String nextDusk) {
        this.nextDusk = nextDusk;
        return this;
    }

    public Attributes setTemperature(double temperature) {
        this.temperature = Double.valueOf(temperature);
        return this;
    }

    public Attributes setIcon(String icon) {
        this.icon = icon;
        return this;
    }

    public Attributes setLastTriggered(String lastTriggered) {
        this.lastTriggered = lastTriggered;
        return this;
    }

    public Attributes setNextMidnight(String nextMidnight) {
        this.nextMidnight = nextMidnight;
        return this;
    }

    public Attributes setCurrentPosition(byte currentPosition) {
        this.currentPosition = Byte.valueOf(currentPosition);
        return this;
    }

    public Attributes setBatteryVoltage(float batteryVoltage) {
        this.batteryVoltage = Float.valueOf(batteryVoltage);
        return this;
    }
}