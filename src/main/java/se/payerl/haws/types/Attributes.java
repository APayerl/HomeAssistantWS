package se.payerl.haws.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Attributes {
    Map<String, Object> attr = new TreeMap<>();

//    // Alarm
//    public static String CODE_FORMAT = "codeFormat";
//    public static String CODE_ARM_FORMAT = "codeArmRequired";
//    public static String CHANGED_BY = "changedBy";
//    public static String FRIENDLY_NAME = "friendlyName";
//    public static String supportedFeatures;
//    public static String prePendingState;
//    public static String postPendingState;
//
//    // Battery operated blind
//    private Byte currentPosition;
//    private Float batteryVoltage;
//
//    // weather.home
//    private Double temperature;
//    private Byte humidity;
//    private Float pressure;
//    private Float windBearing;
//    private Float windSpeed;
//    private String attribution;
//    private List<Forecast> forecast;
//    private String nextDawn;
//    private String nextDusk;
//    private String nextMidnight;
//    private String nextNoon;
//    private String nextRising;
//    private String nextSetting;
//
//    // Others
////    private String unitOfMeasurement;
////    private String deviceClass;
////    private String icon;
////    private String lastTriggered;
////    private Integer nodeId;
////    private String releaseNotes;



    public Attributes() {
//        this.friendlyName = null;
////        this.unitOfMeasurement = null;
//        this.supportedFeatures = null;
//        this.codeFormat = null;
//        this.changedBy = null;
//        this.codeArmRequired = null;
//        this.prePendingState = null;
//        this.postPendingState = null;
//        this.nextDawn = null;
////        this.deviceClass = null;
//        this.nextDusk = null;
//        this.temperature = null;
////        this.icon = null;
////        this.lastTriggered = null;
//        this.nextMidnight = null;
//        this.currentPosition = null;
//        this.batteryVoltage = null;
//        this.humidity = null;
//        this.nextNoon = null;
////        this.nodeId = null;
//        this.nextRising = null;
//        this.pressure = null;
//        this.windBearing = null;
//        this.windSpeed = null;
//        this.attribution = null;
//        this.forecast = null;
////        this.releaseNotes = null;
//        this.nextSetting = null;
    }

//    public String getFriendlyName() {
////        return friendlyName;
//        return (String) attr.get("friendlyName");
//    }
//
////    public String getUnitOfMeasurement() {
////        return unitOfMeasurement;
////    }
//
//    public Integer getSupportedFeatures() {
////        return supportedFeatures;
//        return (Integer) attr.get("supportedFeatures");
//    }
//
//    public String getCodeFormat() {
////        return codeFormat;
//        return (String) attr.get("codeFormat");
//    }
//
//    public String getChangedBy() {
////        return changedBy;
//        return (String) attr.get("changedBy");
//    }
//
//    public Boolean getCodeArmRequired() {
////        return codeArmRequired;
//        return (Boolean) attr.get("codeArmRequired");
//    }
//
//    public String getPrePendingState() {
////        return prePendingState;
//        return (String) attr.get("prePendingState");
//    }
//
//    public String getPostPendingState() {
////        return postPendingState;
//        return (String) attr.get("postPendingState");
//    }
//
//    public String getNextDawn() {
////        return nextDawn;
//        return (String) attr.get("nextDawn");
//    }
//
////    public String getDeviceClass() {
////        return deviceClass;
////    }
//
//    public String getNextDusk() {
////        return nextDusk;
//        return (String) attr.get("nextDusk");
//    }
//
//    public Double getTemperature() {
////        return temperature;
//        return (Double) attr.get("temperature");
//    }
//
////    public String getIcon() {
////        return icon;
////    }
////
////    public String getLastTriggered() {
////        return lastTriggered;
////    }
//
//    public String getNextMidnight() {
////        return nextMidnight;
//        return (String) attr.get("nextMidnight");
//    }
//
//    public Byte getCurrentPosition() {
////        return currentPosition;
//        return (Byte) attr.get("currentPosition");
//    }
//
//    public Float getBatteryVoltage() {
////        return batteryVoltage;
//        return (Float) attr.get("batteryVoltage");
//    }
//
//    public Byte getHumidity() {
////        return humidity;
//        return (Byte) attr.get("humidity");
//    }
//
//    public String getNextNoon() {
////        return nextNoon;
//        return (String) attr.get("nextNoon");
//    }
//
////    public Integer getNodeId() {
////        return nodeId;
////    }
//
//    public Float getPressure() {
////        return pressure;
//        return (Float) attr.get("pressure");
//    }
//
//    public Float getWindBearing() {
////        return windBearing;
//        return (Float) attr.get("windBearing");
//    }
//
//    public Float getWindSpeed() {
////        return windSpeed;
//        return (Float) attr.get("windSpeed");
//    }
//
//    public String getAttribution() {
////        return attribution;
//        return (String) attr.get("attribution");
//    }
//
//    public List<Forecast> getForecast() {
////        return forecast;
//        return (List<Forecast>) attr.get("forecast");
//    }
//
//    public String getNextRising() {
////        return nextRising;
//        return (String) attr.get("nextRising");
//    }
//
////    public String getReleaseNotes() {
////        return releaseNotes;
////    }
//
//    public String getNextSetting() {
////        return nextSetting;
//        return (String) attr.get("nextSetting");
//    }


    @JsonAnySetter
    public void setAttribute(String key, Object value) {
        this.attr.put(key, value);
    }

    @JsonAnyGetter
    public Map<String, Object> getAttributes() {
        return this.attr;
    }

    public Object getAttribute(String key) {
        return this.attr.get(key);
    }

}