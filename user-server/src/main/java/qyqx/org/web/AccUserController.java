package qyqx.org.web;

import com.example.utils.ResUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import qyqx.org.po.AccUser;
import qyqx.org.service.AccUserService;
import qyqx.org.vo.AccUserReq;
import qyqx.org.vo.AccUserRes;

import javax.annotation.Resource;
import java.util.List;


@RestController
public class AccUserController {
    @Resource
    AccUserService userService;

    @GetMapping("/user")
    public List<AccUser> getAccUserList() {
//        return userService.getAccUserList();
        return null;
    }

    @PostMapping("/user")
    public ResUtil addAccUser(@RequestBody AccUserReq req) {
        ResUtil res = userService.addAccUser(req);
        return res;
    }
}
