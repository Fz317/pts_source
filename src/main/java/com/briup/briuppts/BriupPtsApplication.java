package com.briup.briuppts;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.briup.briuppts.mapper")
public class BriupPtsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BriupPtsApplication.class, args);
    }

}
