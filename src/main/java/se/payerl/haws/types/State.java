package se.payerl.haws.types;

/**
 * Used to represent a state associated with a entity
 */
public class State {
    private String entityId;
    private String state;
    private Attributes attributes;
    private String lastChanged;
    private String lastUpdated;
    private Context context;

    public State() {}
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