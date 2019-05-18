package qyqx.org.service;

import com.example.utils.exp.AppException;
import qyqx.org.vo.AccUserReq;

public interface UserService {
    public void createUser(AccUserReq req) throws AppException;
}
