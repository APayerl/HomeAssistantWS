package se.payerl.haws.types;

import com.google.gson.annotations.SerializedName;

public class Context {
    private String id;
    @SerializedName("parent_id")
    private String parentId;
    @SerializedName("user_id")
    private String userId;

    public Context(String id, String parentId, String userId) {
        this.id = id;
        this.parentId = parentId;
        this.userId = userId;
    }
}