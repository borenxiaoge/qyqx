package qyqx.org.service.impl;

import com.example.utils.exp.AppException;
import org.springframework.stereotype.Service;
import qyqx.org.client.UserFeign;
import qyqx.org.service.UserService;
import qyqx.org.vo.AccUserReq;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserFeign feign;

    @Override
    public void createUser(AccUserReq req) throws AppException {
        feign.createUser(req);
    }
}
