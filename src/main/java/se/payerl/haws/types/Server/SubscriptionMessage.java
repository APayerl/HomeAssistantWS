package se.payerl.haws.types.Server;

import se.payerl.haws.types.EventMessage;
import se.payerl.haws.types.ServerTypes;

public class SubscriptionMessage extends ServerMessage {
    private EventMessage event;

    public SubscriptionMessage() {}
    public SubscriptionMessage(int id, EventMessage event) {
        super(ServerTypes.EVENT, id);
        this.event = event;
    }

    public EventMessage getEvent() {
        return event;
    }
}