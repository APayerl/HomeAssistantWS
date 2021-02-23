package se.payerl.haws.types;

import com.google.gson.annotations.SerializedName;

public class EventMessage {
    @SerializedName("event_type")
    private String eventType;
    private EventData data;
    private String origin;
    @SerializedName("time_fired")
    private String timeFired;
    private Context context;

    public EventMessage(String eventType, EventData data, String origin, String timeFired, Context context) {
        this.eventType = eventType;
        this.data = data;
        this.origin = origin;
        this.timeFired = timeFired;
        this.context = context;
    }

    public String getEventType() {
        return eventType;
    }

    public EventData getData() {
        return data;
    }

    public String getOrigin() {
        return origin;
    }

    public String getTimeFired() {
        return timeFired;
    }

    public Context getContext() {
        return context;
    }
}