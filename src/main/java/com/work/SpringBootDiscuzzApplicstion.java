package com.work;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.work.mapper")
public class SpringBootDiscuzzApplicstion {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDiscuzzApplicstion.class);
    }
}
