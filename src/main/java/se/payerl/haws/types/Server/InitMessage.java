package se.payerl.haws.types.Server;

import se.payerl.haws.types.ServerTypes;
import se.payerl.haws.types.SocketMessage;

public class InitMessage extends SocketMessage {
    private String haVersion;

    public InitMessage() {}
    public InitMessage(String haVersion) {
        super(ServerTypes.AUTH_REQUIRED);
        this.haVersion = haVersion;
    }

    public String getHaVersion() {
        return haVersion;
    }
}