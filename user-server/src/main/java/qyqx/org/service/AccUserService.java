package qyqx.org.service;

import com.example.utils.exp.AppException;
import qyqx.org.po.AccUser;
import qyqx.org.vo.AccUserReq;

import java.util.List;

public interface AccUserService {

    public void addAccUser(AccUserReq req) throws AppException;
}
