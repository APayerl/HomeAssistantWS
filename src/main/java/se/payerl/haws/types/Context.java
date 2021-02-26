package se.payerl.haws.types;

public class Context {
    private String id;
    private String parentId;
    private String userId;

    public Context() {}
    public Context(String id, String parentId, String userId) {
        this.id = id;
        this.parentId = parentId;
        this.userId = userId;
    }
}