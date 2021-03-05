package se.payerl.haws.types;

import se.payerl.haws.types.Server.ServerMessage;

public interface ServerCallback<T> {
    public void onReceived(T message);
}