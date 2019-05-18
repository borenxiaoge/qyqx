package qyqx.org.client;

import com.example.utils.exp.AppException;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import qyqx.org.client.impl.UserFallBack;
import qyqx.org.vo.AccUserReq;

@FeignClient(value = "user-server", fallback = UserFallBack.class)
public interface UserFeign {
    @PostMapping("/user")
    void createUser(@RequestBody AccUserReq req) throws AppException;
}
