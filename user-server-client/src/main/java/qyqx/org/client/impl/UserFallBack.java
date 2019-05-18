package qyqx.org.client.impl;

import com.example.utils.ExpUtil;
import com.example.utils.exp.AppException;
import qyqx.org.client.UserFeign;
import qyqx.org.vo.AccUserReq;

public class UserFallBack implements UserFeign {
    @Override
    public void createUser(AccUserReq req) throws AppException {
        ExpUtil.raise("SYS1001", "用户服务调用异常");
    }
}
