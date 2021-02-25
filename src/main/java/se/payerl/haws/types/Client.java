package se.payerl.haws.types;

public abstract class Client {
    public static final String AUTH = "auth";
    public static final String SUBSCRIBE_EVENTS = "subscribe_events";
    public static final String UNSUBSCRIBE_EVENTS = "unsubscribe_events";
    public static final String CALL_SERVICE = "call_service";
    public static final String GET_STATES = "get_states";
    public static final String GET_CONFIG = "get_config";
    public static final String GET_SERVICES = "get_services";
    public static final String GET_PANELS = "get_panels";
    @Deprecated
    public static final String CAMERA_THUMBNAIL = "camera_thumbnail";
    public static final String MEDIA_PLAYER_THUMBNAIL = "media_player_thumbnail";
    public static final String PING = "ping";

    public static class AuthMessage extends SocketMessage {
        private String accessToken;

        public AuthMessage(String token) {
            super(AUTH);
            this.accessToken = token;
        }

        public String getAccessToken() {
            return accessToken;
        }
    }
    public static class ClientMessage extends SocketMessage {
        private int id;

        public ClientMessage(String type, int id) {
            super(type);
            this.id = id;
        }

        public int getId() {
            return id;
        }
    }
    public static class SubscribeMessage extends ClientMessage {
        private String eventType;

        public SubscribeMessage(int id) {
            super(SUBSCRIBE_EVENTS, id);
            this.eventType = eventType;
        }

        public String getEventType() {
            return eventType;
        }

        public SubscribeMessage setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
    }
    public static class UnsubscribeMessage extends ClientMessage {
        private int subscription;

        public UnsubscribeMessage(int id, int subscription) {
            super(UNSUBSCRIBE_EVENTS, id);
            this.subscription = subscription;
        }

        public int getSubscription() {
            return subscription;
        }
    }
    public static class CallServiceMessage extends ClientMessage {
        private String domain;
        private String service;
        private ServiceData serviceData;

        public CallServiceMessage(int id, String domain, String service) {
            super(CALL_SERVICE, id);
            this.domain = domain;
            this.service = service;
        }

        public String getDomain() {
            return domain;
        }

        public String getService() {
            return service;
        }

        public ServiceData getServiceData() {
            return serviceData;
        }

        public CallServiceMessage setServiceData(ServiceData serviceData) {
            this.serviceData = serviceData;
            return this;
        }
    }
    public static class GetStatesMessage extends ClientMessage {
        public GetStatesMessage(int id) {
            super(GET_STATES, id);
        }
    }
    public static class GetConfigMessage extends ClientMessage {
        public GetConfigMessage(int id) {
            super(GET_CONFIG, id);
        }
    }
    public static class GetServicesMessage extends ClientMessage {
        public GetServicesMessage(int id) {
            super(GET_SERVICES, id);
        }
    }
    public static class GetPanelsMessage extends ClientMessage {
        public GetPanelsMessage(int id) {
            super(GET_PANELS, id);
        }
    }
    public static class ClientEntityMessage extends ClientMessage {
        private String entityId;

        public ClientEntityMessage(String type, int id, String entityId) {
            super(type, id);
            this.entityId = entityId;
        }

        public String getEntityId() {
            return entityId;
        }
    }
    @Deprecated
    public static class CameraThumbnailMessage extends ClientEntityMessage {
        @Deprecated
        public CameraThumbnailMessage(int id, String entityId) {
            super(CAMERA_THUMBNAIL, id, entityId);
        }
    }
    public static class MediaPlayerThumbnailMessage extends ClientEntityMessage {
        public MediaPlayerThumbnailMessage(int id, String entityId) {
            super(MEDIA_PLAYER_THUMBNAIL, id, entityId);
        }
    }
    public static class PingMessage extends ClientMessage {
        public PingMessage(int id) {
            super(PING, id);
        }
    }

}