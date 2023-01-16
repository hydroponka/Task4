package by.ageenko.task_4.exception;

public class BouquetException extends Exception{
    public BouquetException() {
    }

    public BouquetException(String message) {
        super(message);
    }

    public BouquetException(String message, Throwable cause) {
        super(message, cause);
    }

    public BouquetException(Throwable cause) {
        super(cause);
    }
}
