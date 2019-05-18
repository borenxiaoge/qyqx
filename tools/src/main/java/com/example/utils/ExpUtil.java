package com.example.utils;

import com.example.utils.exp.AppException;

public class ExpUtil {
    public static final void raise(String status) throws AppException {
        raise(status, status);//willdo从redis服务器映射错误码
    }

    public static final void raise(String status, String message) throws AppException {
        throw new AppException(status, message);
    }
}
