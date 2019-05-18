package qyqx.org.service.impl;

import com.example.utils.ExpUtil;
import com.example.utils.exp.AppException;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import qyqx.org.mapper.AccUserMapper;
import qyqx.org.po.AccUser;
import qyqx.org.po.AccUserExample;
import qyqx.org.service.AccUserService;
import qyqx.org.vo.AccUserReq;
import qyqx.org.vo.AccUserRes;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class AccUserServiceImpl implements AccUserService {
    @Resource
    AccUserMapper userMapper;

    public void addAccUser(AccUserReq req) throws AppException {
        AccUserExample example = new AccUserExample();
        example.createCriteria().andOpenIdEqualTo(req.getOpenId());
        int countUser = userMapper.countByExample(example);
        if (countUser > 0) {
            ExpUtil.raise("US1001", "用户已存在！");
        }
        //        //willdo 需要添加一个wechat-server用来校验token和获取用户信息
        AccUser user = new AccUser();
        user.setOpenId(req.getOpenId());
        user.setUserId(req.getUserId());
        user.setUserName("liborentest");
        user.setRegisterDate(new Date());
        user.setRegisterTime(new Date());
        userMapper.insert(user);
    }
}
