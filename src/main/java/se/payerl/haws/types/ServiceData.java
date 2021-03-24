package se.payerl.haws.types;

public class ServiceData {
    private String entityId = null;
    private Integer code = null;

    public String getEntityId() {
        return this.entityId;
    }
    public Integer getCode() {
        return this.code;
    }

    public ServiceData setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public ServiceData setCode(int code) {
        this.code = code;
        return this;
    }

    public ServiceData() {}
}