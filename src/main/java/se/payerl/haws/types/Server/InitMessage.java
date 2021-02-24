package se.payerl.haws.types.Server;

import com.google.gson.annotations.SerializedName;
import se.payerl.haws.types.ServerTypes;
import se.payerl.haws.types.SocketMessage;

public class InitMessage extends SocketMessage {
    @SerializedName("ha_version")
    private String haVersion;

    public InitMessage(String haVersion) {
        super(ServerTypes.AUTH_REQUIRED);
        this.haVersion = haVersion;
    }

    public String getHaVersion() {
        return haVersion;
    }
}