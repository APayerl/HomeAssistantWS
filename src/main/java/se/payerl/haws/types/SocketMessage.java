package se.payerl.haws.types;

public class SocketMessage {
    private String type;

    public SocketMessage() {}
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