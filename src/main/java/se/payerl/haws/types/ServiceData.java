package se.payerl.haws.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import se.payerl.haws.CaseHandler;

import java.util.Map;
import java.util.TreeMap;

public class ServiceData {
    @JsonIgnore
    private Map<String, Object> attr = new TreeMap<>();
    public ServiceData() { }

    @JsonAnySetter
    public ServiceData add(String key, Object value) {
        this.attr.put(CaseHandler.snake_case_ToCamelCase(key), value);
        return this;
    }

    @JsonAnyGetter(enabled = true)
    public Map<String, Object> getAttributes() {
        Map<String, Object> mMap = new TreeMap<>();
        this.attr.entrySet().forEach(entry ->
                mMap.put(CaseHandler.camelCaseTo_snake_case(entry.getKey()), entry.getValue()));
        return mMap;
    }

    @JsonIgnore
    public boolean hasAttribute(String key) {
        return this.attr.containsKey(key);
    }

    @JsonIgnore
    public Object getAttribute(String key) {
        return this.attr.get(key);
    }

    @JsonIgnore
    public String getEntityId() {
        return (String) this.attr.get("entityId");
    }

    @JsonIgnore
    public Integer getCode() {
        return (Integer) this.attr.get("code");
    }
}