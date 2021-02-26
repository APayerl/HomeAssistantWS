package se.payerl.haws.types;

public class ServiceData {
    private String entityId;

    public String getEntityId() {
        return entityId;
    }

    public ServiceData setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    public ServiceData() {}
    public ServiceData(String entityId) {
        this.entityId = entityId;
    }
}