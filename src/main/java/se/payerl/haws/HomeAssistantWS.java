package se.payerl.haws;

import java.net.URI;

import com.fasterxml.jackson.core.JsonFactoryBuilder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;
import se.payerl.haws.types.Client;
import se.payerl.haws.types.Server.*;
import se.payerl.haws.types.ServerTypes;
import se.payerl.haws.types.SocketMessage;

public abstract class HomeAssistantWS/* extends WebSocketClient*/ {
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
                System.out.println("Socket_Message: " + message);

                try {
                    SocketMessage messageObj = getJackson().readValue(message, SocketMessage.class);
                    switch(messageObj.getType()) {
                        case ServerTypes.AUTH_REQUIRED:
                            onAuthRequired(getJackson().readValue(message, InitMessage.class));
                            break;
                        case ServerTypes.AUTH_INVALID:
                            onAuthInvalid(getJackson().readValue(message, AuthInvalidMessage.class));
                            break;
                        case ServerTypes.AUTH_OK:
                            onAuthOk();
                            break;
                        case ServerTypes.RESULT:
                            onResult(getJackson().readValue(message, ResultMessage.class));
                            break;
                        case ServerTypes.EVENT:
                            onSubscriptionMessage(getJackson().readValue(message, SubscriptionMessage.class));
                            break;
                        case ServerTypes.PONG:
                            onPong(getJackson().readValue(message, ServerMessage.class));
                            break;
                    }
                } catch(Exception ex) {
                    System.err.println(ex.getMessage());
                }
            }

            @Override
            public void onClose(int code, String reason, boolean remote) {
                System.out.println("Socket_Closed: " + code + " - " + reason + " - " + remote);
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

    private ObjectMapper getJackson() {
        ObjectMapper om = new ObjectMapper();
        om.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
        return om;
    }

    public int getNextMessageId() {
        return messages++;
    }

//    @Override
//    public final void onOpen(ServerHandshake handshakedata) {
//        System.out.println("Socket_Opened");
//    }
//
//    @Override
//    public final void onMessage(String message) {
//        System.out.println("Socket_Message: " + message);
//
//        try {
//            SocketMessage messageObj = getJackson().readValue(message, SocketMessage.class);
//            switch(messageObj.getType()) {
//                case ServerTypes.AUTH_REQUIRED:
//                    onAuthRequired(getJackson().readValue(message, InitMessage.class));
//                    break;
//                case ServerTypes.AUTH_INVALID:
//                    onAuthInvalid(getJackson().readValue(message, AuthInvalidMessage.class));
//                    break;
//                case ServerTypes.AUTH_OK:
//                    onAuthOk();
//                    break;
//                case ServerTypes.RESULT:
//                        onResult(getJackson().readValue(message, ResultMessage.class));
//                    break;
//                case ServerTypes.EVENT:
//                    onSubscriptionMessage(getJackson().readValue(message, SubscriptionMessage.class));
//                    break;
//                case ServerTypes.PONG:
//                    onPong(getJackson().readValue(message, ServerMessage.class));
//                    break;
//            }
//        } catch(Exception ex) {
//            System.err.println(ex.getMessage());
//        }
//    }
//
//    @Override
//    public final void onClose(int code, String reason, boolean remote) {
//        System.out.println("Socket_Closed: " + code + " - " + reason + " - " + remote);
//    }
//
//    @Override
//    public final void onError(Exception ex) {
//        System.out.println("Socket_Error: " + ex.getMessage());
//        ex.fillInStackTrace();
//    }

    public void onAuthRequired(InitMessage message) {
        try {
            this.socket.send(getJackson().writeValueAsString(new Client.AuthMessage(token)));
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
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
            this.socket.send(getJackson().writeValueAsString(message));
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
}