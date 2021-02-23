package se.payerl.haws.types;

import com.google.gson.annotations.SerializedName;

public class ServiceData {
    @SerializedName("entity_id")
    private String entityId;

    public String getEntityId() {
        return entityId;
    }

    public ServiceData setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
}