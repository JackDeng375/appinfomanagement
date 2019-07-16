package com.jack.appinfo;

import com.github.pagehelper.PageHelper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.Properties;

@SpringBootApplication
@MapperScan(basePackages = "com.jack.appinfo.mapper")
@ComponentScan(basePackages = "com")
public class AppinfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppinfoApplication.class, args);
    }
}
