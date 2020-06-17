package qyqx.org.client.impl;

import com.example.utils.ExpUtil;
import com.example.utils.ResUtil;
import com.example.utils.exp.AppException;
import org.springframework.stereotype.Component;
import qyqx.org.client.UserFeign;
import qyqx.org.vo.AccUserReq;
import qyqx.org.vo.AccUserRes;

@Component
public class UserFallBack implements UserFeign {
    @Override
    public ResUtil createUser(AccUserReq req) {
        System.out.println("新增用户交易调用远程服务异常！");
        ResUtil res = new ResUtil();
        res.setStatus("sys001");
        res.setMessage("调用远程服务异常！");
        return res;
    }
}
