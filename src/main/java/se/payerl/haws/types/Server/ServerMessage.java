package se.payerl.haws.types.Server;

import se.payerl.haws.types.SocketMessage;

public class ServerMessage extends SocketMessage {
    private int id;

    public ServerMessage() {}
    public ServerMessage(String type, int id) {
        super(type);
        this.id = id;
    }

    /**
     * Contains the client message sources id
     * @return the id of the message causing this reply
     */
    public int getId() {
        return id;
    }
}