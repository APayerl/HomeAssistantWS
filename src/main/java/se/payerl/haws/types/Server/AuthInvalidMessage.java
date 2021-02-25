package se.payerl.haws.types.Server;

import se.payerl.haws.types.ServerTypes;
import se.payerl.haws.types.SocketMessage;

public class AuthInvalidMessage extends SocketMessage {
    private String message;

    public AuthInvalidMessage() { }
    public AuthInvalidMessage(String message) {
        super(ServerTypes.AUTH_INVALID);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}