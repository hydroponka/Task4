package by.ageenko.task_4.exception;

public class FlowerException extends Exception {
    public FlowerException() {
    }

    public FlowerException(String message) {
        super(message);
    }

    public FlowerException(String message, Throwable cause) {
        super(message, cause);
    }

    public FlowerException(Throwable cause) {
        super(cause);
    }
}
