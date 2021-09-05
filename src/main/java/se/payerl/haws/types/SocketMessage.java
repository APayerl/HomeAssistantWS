package se.payerl.haws.types;

/**
 * Base class for a socket message. Contains only a message type
 */
public class SocketMessage {
    private String type;

    /**
     * Empty contructor, do not use!
     */
    public SocketMessage() {}

    /**
     * Constructor to create new socket message based on supplied type
     * @param type Supplied type of the message
     */
    public SocketMessage(String type) {
        this.type = type;
    }

    /**
     * Get the type of the message as a string
     * @return String containing the type
     */
    public String getType() {
        return this.type;
    }
}