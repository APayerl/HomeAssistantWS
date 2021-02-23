package se.payerl.haws.types;

import com.google.gson.annotations.SerializedName;

public class EventData {
    @SerializedName("entity_id")
    private String entityId;
    @SerializedName("old_state")
    private State oldState;
    @SerializedName("new_state")
    private State newState;

    public EventData(String entityId, State oldState, State newState) {
        this.entityId = entityId;
        this.oldState = oldState;
        this.newState = newState;
    }

    public String getEntityId() {
        return entityId;
    }

    public State getOldState() {
        return oldState;
    }

    public State getNewState() {
        return newState;
    }
}