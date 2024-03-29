package se.payerl.haws.types;

/**
 * Event data class to represent entityid and new and old state
 */
public class EventData {
    private String entityId;
    private State oldState;
    private State newState;

    public EventData() {}
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