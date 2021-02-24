package se.payerl.haws.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public abstract class Server {
    public static final String AUTH_REQUIRED = "auth_required";
    public static final String AUTH_INVALID = "auth_invalid";
    public static final String AUTH_OK = "auth_ok";
    public static final String RESULT = "result";
    public static final String EVENT = "event";
    public static final String PONG = "pong";

    public static class ServerMessage extends SocketMessage {
        private int id;

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
    public static class InitMessage extends SocketMessage {
        @SerializedName("ha_version")
        private String haVersion;

        public InitMessage(String haVersion) {
            super(AUTH_REQUIRED);
            this.haVersion = haVersion;
        }

        public String getHaVersion() {
            return haVersion;
        }
    }
    public static class AuthInvalidMessage extends SocketMessage {
        private String message;

        public AuthInvalidMessage(String message) {
            super(AUTH_INVALID);
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
    public class ResultMessage extends ServerMessage {
        private boolean success;
        private Result result;

        @JsonCreator
        public ResultMessage(@JsonProperty("id") int id,
                @JsonProperty("success") boolean success,
                @JsonProperty("result") Result result) {
            super(RESULT, id);
            this.success = success;
            this.result = result;
        }

        public boolean getSuccess() {
            return this.success;
        }
        public Result getResult() {
            return this.result;
        }
    }
    public static class SubscriptionMessage extends ServerMessage {
        private EventMessage event;

        public SubscriptionMessage(int id, EventMessage event) {
            super(EVENT, id);
            this.event = event;
        }

        public EventMessage getEvent() {
            return event;
        }
    }
}