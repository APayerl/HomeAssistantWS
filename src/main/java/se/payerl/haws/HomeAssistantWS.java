package se.payerl.haws;

import java.net.URI;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;
import se.payerl.haws.types.Client;
import se.payerl.haws.types.Server.*;
import se.payerl.haws.types.ServerTypes;
import se.payerl.haws.types.SocketMessage;

public abstract class HomeAssistantWS extends WebSocketClient {
    public HomeAssistantWS(URI serverUri, String token) {
        super(serverUri);
        this.token = token;
        this.messages = 1;
    }

    private String token;
    private int messages;

    public int getNextMessageId() {
        return messages++;
    }

    @Override
    public final void onOpen(ServerHandshake handshakedata) {
        System.out.println("Socket_Opened");
    }

    @Override
    public final void onMessage(String message) {
        System.out.println("Socket_Message: " + message);

        SocketMessage messageObj = new Gson().fromJson(message, SocketMessage.class);
        switch(messageObj.getType()) {
            case ServerTypes.AUTH_REQUIRED:
                onAuthRequired(new Gson().fromJson(message, InitMessage.class));
                break;
            case ServerTypes.AUTH_INVALID:
                onAuthInvalid(new Gson().fromJson(message, AuthInvalidMessage.class));
                break;
            case ServerTypes.AUTH_OK:
                onAuthOk();
                break;
            case ServerTypes.RESULT:
                try {
                    ObjectMapper om = new ObjectMapper();
                    onResult(om.readValue(message, ResultMessage.class));
                } catch(JsonProcessingException ex) {
                    System.err.println(ex.getMessage());
                    onResult(new Gson().fromJson(message, ResultMessage.class));
                }
                break;
            case ServerTypes.EVENT:
                onSubscriptionMessage(new Gson().fromJson(message, SubscriptionMessage.class));
                break;
            case ServerTypes.PONG:
                onPong(new Gson().fromJson(message, ServerMessage.class));
                break;
        }
    }

    @Override
    public final void onClose(int code, String reason, boolean remote) {
        System.out.println("Socket_Closed: " + code + " - " + reason + " - " + remote);
    }

    @Override
    public final void onError(Exception ex) {
        System.out.println("Socket_Error: " + ex.getMessage());
        ex.fillInStackTrace();
    }

    public void onAuthRequired(InitMessage message) {
        send(new Gson().toJson(new Client.AuthMessage(token)));
    }

    public abstract void onAuthInvalid(AuthInvalidMessage message);

    public abstract void onAuthOk();

    public abstract void onResult(ResultMessage resultMessage);

    public abstract void onSubscriptionMessage(SubscriptionMessage message);

    public void onPong(ServerMessage message) {

    }

    public void send(Client.ClientMessage message) {
        send(new Gson().toJson(message));
    }
}