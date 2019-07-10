package com.jack.appinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.jack.appinfo.mapper")
@ComponentScan(basePackages = "com")
public class AppinfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppinfoApplication.class, args);
    }

}
