package uitschool.exception;

public class WrongPasswordException extends Exception {

    public WrongPasswordException() {
    }

    @Override
    public String toString() {
        return "WrongPasswordException{}";
    }

    public WrongPasswordException(String message) {
        super(message);
    }


}
