package qyqx.org.web;

import com.example.utils.exp.AppException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import qyqx.org.client.UserFeign;
import qyqx.org.vo.AccUserReq;

import javax.annotation.Resource;

@RestController("/user")
public class UserController {
    @Resource
    UserFeign userClient;

    //通过feign调用的远程服务产生的异常无法返回给客户端，待测试调整
    @PostMapping("/user")
    public String createUser(@RequestBody AccUserReq req) throws AppException {
        try {
            userClient.createUser(req);
        } catch (AppException e) {
            return e.getMessage();
        }
        return "成功";
    }
}
