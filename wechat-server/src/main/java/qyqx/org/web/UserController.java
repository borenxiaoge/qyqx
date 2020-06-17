package qyqx.org.web;

import com.example.utils.ResUtil;
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

    @PostMapping("/user")
    public ResUtil createUser(@RequestBody AccUserReq req) {
        ResUtil res = userClient.createUser(req);
        return res;
    }
}
