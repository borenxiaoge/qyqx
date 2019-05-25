package qyqx.org.wechatserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients
@ComponentScan(basePackages = {"qyqx.org.web", "qyqx.org.service","qyqx.org.client"})
@SpringBootApplication
public class WechatServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WechatServerApplication.class, args);
    }

}
