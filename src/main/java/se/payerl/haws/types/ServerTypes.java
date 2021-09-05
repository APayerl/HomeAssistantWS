package se.payerl.haws.types;

/**
 * Different server message types.
 */
public abstract class ServerTypes {
    public static final String AUTH_REQUIRED = "auth_required";
    public static final String AUTH_INVALID = "auth_invalid";
    public static final String AUTH_OK = "auth_ok";
    public static final String RESULT = "result";
    public static final String EVENT = "event";
    public static final String PONG = "pong";
}