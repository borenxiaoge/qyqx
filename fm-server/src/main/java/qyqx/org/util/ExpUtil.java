package qyqx.org.util;

import qyqx.org.util.exp.AppException;

public class ExpUtil {
    public static final void raise(String status) throws AppException {
//        raise(status, message);
    }

    public static final void raise(String status, String message) throws AppException {
        throw new AppException(status, message);
    }

}
