package se.payerl.haws;

import java.net.URI;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;
import se.payerl.haws.types.Client;
import se.payerl.haws.types.Server.*;
import se.payerl.haws.types.ServerTypes;
import se.payerl.haws.types.SocketMessage;

public abstract class HomeAssistantWS {
    public HomeAssistantWS(URI serverUri, String token) {
//        super(serverUri);
        this.token = token;
        this.messages = 1;
        this.socket = new WebSocketClient(serverUri) {
            @Override
            public void onOpen(ServerHandshake handshakedata) {
                System.out.println("Socket_Opened");
            }

            @Override
            public void onMessage(String message) {
                try {
                    SocketMessage messageObj = getJackson(false).readValue(message, SocketMessage.class);
                    switch(messageObj.getType()) {
                        case ServerTypes.AUTH_REQUIRED:
                            onAuthRequired(getJackson(true).readValue(message, InitMessage.class));
                            break;
                        case ServerTypes.AUTH_INVALID:
                            onAuthInvalid(getJackson(true).readValue(message, AuthInvalidMessage.class));
                            break;
                        case ServerTypes.AUTH_OK:
                            onAuthOk();
                            break;
                        case ServerTypes.RESULT:
                            onResult(getJackson(true).readValue(message, ResultMessage.class));
                            break;
                        case ServerTypes.EVENT:
                            onSubscriptionMessage(getJackson(true).readValue(message, SubscriptionMessage.class));
                            break;
                        case ServerTypes.PONG:
                            onPong(getJackson(true).readValue(message, ServerMessage.class));
                            break;
                    }
                } catch(Exception ex) {
                    System.err.println("onMessage:" + ex.getMessage());
                    ex.printStackTrace();
                }
            }

            @Override
            public void onClose(int code, String reason, boolean remote) {
                System.out.println("Socket_Closed: " + code + " - " + reason + " - " + remote);
                this.close();
            }

            @Override
            public void onError(Exception ex) {
                System.out.println("Socket_Error: " + ex.getMessage());
                ex.fillInStackTrace();
            }
        };
    }

    private WebSocketClient socket;
    private String token;
    private int messages;

    public static ObjectMapper getJackson(boolean failOnUnknowns) {
        ObjectMapper om = new ObjectMapper();
        om.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
        om.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, failOnUnknowns);
        return om;
    }

    public int getNextMessageId() {
        return messages++;
    }

    public boolean isClosed() {
        return this.socket.isClosed();
    }

    public boolean isClosing() {
        return this.socket.isClosing();
    }

    public boolean isFlushAndClose() {
        return this.socket.isFlushAndClose();
    }

    public boolean isOpen() {
        return this.socket.isOpen();
    }

    public void close() {
        this.socket.close();
    }

    public void connect() {
        this.socket.connect();
    }

    public void onAuthRequired(InitMessage message) {
        try {
            this.socket.send(getJackson(true).writeValueAsString(new Client.AuthMessage(token)));
        } catch (Exception ex) {
            System.err.println("onAuthRequired:" + ex.getMessage());
        }
    }

    public abstract void onAuthInvalid(AuthInvalidMessage message);

    public abstract void onAuthOk();

    public abstract void onResult(ResultMessage resultMessage);

    public abstract void onSubscriptionMessage(SubscriptionMessage message);

    public void onPong(ServerMessage message) {

    }

    public void send(Client.ClientMessage message) {
        try {
            this.socket.send(getJackson(true).writeValueAsString(message));
        } catch (Exception ex) {
            System.err.println("send:" + ex.getMessage());
        }
    }
}