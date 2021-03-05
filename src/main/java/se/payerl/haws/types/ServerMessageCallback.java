package se.payerl.haws.types;

import se.payerl.haws.types.Server.ServerMessage;

public interface ServerMessageCallback {
    public void onServerMessageReceived(ServerMessage message);
}
