package com.myblog.show.myblogshow;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.myblog")
@MapperScan(basePackages = "com.myblog.mapper")
public class MyblogshowApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyblogshowApplication.class, args);
    }

}
