package qyqx.org.fmclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@FeignClient
public class FmClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(FmClientApplication.class, args);
    }

}
