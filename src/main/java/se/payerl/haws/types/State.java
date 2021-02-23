package se.payerl.haws.types;

import com.google.gson.annotations.SerializedName;

public class State {
    @SerializedName("entity_id")
    private String entityId;
    private String state;
    private Attributes attributes;
    @SerializedName("last_changed")
    private String lastChanged;
    @SerializedName("last_updated")
    private String lastUpdated;
    private Context context;

    public State(String entityId, String state, Attributes attributes, String lastChanged, String lastUpdated, Context context) {
        this.entityId = entityId;
        this.state = state;
        this.attributes = attributes;
        this.lastChanged = lastChanged;
        this.lastUpdated = lastUpdated;
        this.context = context;
    }

    public String getEntityId() {
        return entityId;
    }

    public String getState() {
        return state;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public String getLastChanged() {
        return lastChanged;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public Context getContext() {
        return context;
    }
}