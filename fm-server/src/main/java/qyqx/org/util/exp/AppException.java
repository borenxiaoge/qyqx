package qyqx.org.util.exp;

public class AppException extends Exception {

    public AppException() {
    }

    public AppException(String status, String message) {
        this.status = status;
        this.message = message;
    }

    private String status;
    private String message;

    public String getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return message;

    }

//    public static final void raise() {
//    }
//
//    public static final void raise(String status, String message) throws AppException {
//        new AppException(status, message);
//    }

}
