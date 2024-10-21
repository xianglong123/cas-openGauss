package com.cas;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author: xianglong[1391086179@qq.com]
 * @date: 上午11:34 2021/3/14
 * @version: V1.0
 * @review:
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class }, scanBasePackages = {"com.cas", "cn.hutool.extra.spring"})
@MapperScan(basePackages = "com.cas.dao")
public class GaussApplication {

    public static void main(String[] args) {
        SpringApplication.run(GaussApplication.class, args);
    }

}
