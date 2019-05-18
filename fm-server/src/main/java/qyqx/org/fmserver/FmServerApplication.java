package qyqx.org.fmserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"qyqx.org.web","qyqx.org.service","qyqx.org.util.config"})
@MapperScan(basePackages = {"qyqx.org.data.mapper"})
@EnableCaching
public class FmServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FmServerApplication.class, args);
    }

}
