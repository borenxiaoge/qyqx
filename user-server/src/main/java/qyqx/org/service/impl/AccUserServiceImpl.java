package qyqx.org.service.impl;

import com.example.utils.ResUtil;
import com.example.utils.StrUtil;
import org.springframework.stereotype.Service;
import qyqx.org.mapper.AccUserMapper;
import qyqx.org.po.AccUser;
import qyqx.org.service.AccUserService;
import qyqx.org.vo.AccUserReq;
import qyqx.org.vo.AccUserRes;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class AccUserServiceImpl implements AccUserService {
    @Resource
    AccUserMapper userMapper;

    public ResUtil addAccUser(AccUserReq req) {
        AccUser user = userMapper.selectByOpenId(req.getOpenId());
        AccUserRes resUser = new AccUserRes();
        ResUtil res = new ResUtil();
        if (user == null) {
            //willdo 需要添加一个wechat-server用来校验token和获取用户信息
            user = new AccUser();
            user.setOpenId(req.getOpenId());
            user.setUserId(StrUtil.getUserSeq());
            user.setUserName("新增用户名称");
            user.setRegisterDate(new Date());
            user.setRegisterTime(new Date());
            userMapper.insert(user);
        }
        resUser.setUserId(user.getUserId());
        res.setObject(resUser);
        return res;
    }
}
