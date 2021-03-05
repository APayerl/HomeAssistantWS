package se.payerl.haws.types;

public class Attributes {
    private String friendlyName;
    private String unitOfMeasurement;
    private int supportedFeatures;
    private String codeFormat;
    private String changedBy;
    private Boolean codeArmRequired;
    private String prePendingState;
    private String postPendingState;
    private String nextDawn;
    private String deviceClass;

    public Attributes() {
        this.friendlyName = null;
        this.unitOfMeasurement = null;
        this.supportedFeatures = -1;
        this.codeFormat = null;
        this.changedBy = null;
        this.codeArmRequired = null;
        this.prePendingState = null;
        this.postPendingState = null;
        this.nextDawn = null;
        this.deviceClass = null;
    }

    public String getFriendlyName() {
        return friendlyName;
    }

    public String getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    public int getSupportedFeatures() {
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

    public Attributes setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    public Attributes setUnitOfMeasurement(String unitOfMeasurement) {
        this.unitOfMeasurement = unitOfMeasurement;
        return this;
    }

    public Attributes setSupportedFeatures(int supportedFeatures) {
        this.supportedFeatures = supportedFeatures;
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

    public void setDeviceClass(String deviceClass) {
        this.deviceClass = deviceClass;
    }
}