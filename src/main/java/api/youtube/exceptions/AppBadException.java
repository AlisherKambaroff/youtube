package api.youtube.exceptions;

public class AppBadException extends RuntimeException {
    public AppBadException(String message) {
        super(message);
    }
}