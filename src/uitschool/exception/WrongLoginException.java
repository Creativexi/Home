package uitschool.exception;

public class WrongLoginException extends Exception {

    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "WrongLoginException{}";
    }
}
