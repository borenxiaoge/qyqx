package qyqx.org.web;

import com.example.utils.exp.AppException;
import org.springframework.web.bind.annotation.*;
import qyqx.org.po.AccUser;
import qyqx.org.service.AccUserService;
import qyqx.org.vo.AccUserReq;
//import vo.AccBookReq;
//import vo.AccUserReq;

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
    public void addAccUser(@RequestBody AccUserReq req) throws AppException {
        userService.addAccUser(req);
    }
}
