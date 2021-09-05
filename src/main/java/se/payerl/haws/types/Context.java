package se.payerl.haws.types;

/**
 * Context class.
 */
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

    public String getId() {
        return id;
    }

    public String getParentId() {
        return parentId;
    }

    public String getUserId() {
        return userId;
    }

    public Context setId(String id) {
        this.id = id;
        return this;
    }

    public Context setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    public Context setUserId(String userId) {
        this.userId = userId;
        return this;
    }
}