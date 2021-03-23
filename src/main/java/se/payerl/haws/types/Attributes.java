package se.payerl.haws.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import se.payerl.haws.CaseHandler;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Attributes {
    @JsonIgnore
    private Map<String, Object> attr = new TreeMap<>();
    public Attributes() { }

    @JsonIgnore
    public String getFriendlyName() {
        return (String) attr.get("friendlyName");
    }

    @JsonIgnore
    public Integer getSupportedFeatures() {
        return (Integer) attr.get("supportedFeatures");
    }

    @JsonIgnore
    public String getCodeFormat() {
        return (String) attr.get("codeFormat");
    }

    @JsonIgnore
    public String getChangedBy() {
        return (String) attr.get("changedBy");
    }

    @JsonIgnore
    public Boolean getCodeArmRequired() {
        return (Boolean) attr.get("codeArmRequired");
    }

    @JsonIgnore
    public String getPrePendingState() {
        return (String) attr.get("prePendingState");
    }

    @JsonIgnore
    public String getPostPendingState() {
        return (String) attr.get("postPendingState");
    }

    @JsonIgnore
    public String getNextDawn() {
        return (String) attr.get("nextDawn");
    }

    @JsonIgnore
    public String getNextDusk() {
        return (String) attr.get("nextDusk");
    }

    @JsonIgnore
    public Double getTemperature() {
        return (Double) attr.get("temperature");
    }

    @JsonIgnore
    public String getNextMidnight() {
        return (String) attr.get("nextMidnight");
    }

    @JsonIgnore
    public Byte getCurrentPosition() {
        return (Byte) attr.get("currentPosition");
    }

    @JsonIgnore
    public Float getBatteryVoltage() {
        return (Float) attr.get("batteryVoltage");
    }

    @JsonIgnore
    public Byte getHumidity() {
        return (Byte) attr.get("humidity");
    }

    @JsonIgnore
    public String getNextNoon() {
        return (String) attr.get("nextNoon");
    }

    @JsonIgnore
    public Float getPressure() {
        return (Float) attr.get("pressure");
    }

    @JsonIgnore
    public Float getWindBearing() {
        return (Float) attr.get("windBearing");
    }

    @JsonIgnore
    public Float getWindSpeed() {
        return (Float) attr.get("windSpeed");
    }

    @JsonIgnore
    public String getAttribution() {
        return (String) attr.get("attribution");
    }

    @JsonIgnore
    public List<Forecast> getForecast() {
        return (List<Forecast>) attr.get("forecast");
    }

    @JsonIgnore
    public String getNextRising() {
        return (String) attr.get("nextRising");
    }

    @JsonIgnore
    public String getNextSetting() {
        return (String) attr.get("nextSetting");
    }


    @JsonAnySetter
    public void add(String key, Object value) {
        this.attr.put(CaseHandler.snake_case_ToCamelCase(key), value);
    }

    @JsonAnyGetter(enabled = true)
    public Map<String, Object> getAttributes() {
        Map<String, Object> mMap = new TreeMap<>();
        this.attr.entrySet().forEach(entry ->
                mMap.put(CaseHandler.camelCaseTo_snake_case(entry.getKey()), entry.getValue()));
        return mMap;
    }

    @JsonIgnore
    public Object getAttribute(String key) {
        return this.attr.get(key);
    }
}