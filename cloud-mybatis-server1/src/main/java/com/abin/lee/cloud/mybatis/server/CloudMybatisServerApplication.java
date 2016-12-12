package com.abin.lee.cloud.mybatis.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by abin on 2016/12/11 2016/12/11.
 * spring-cloud-start1
 * com.abin.lee.cloud.mybatis.server
 */
@SpringBootApplication
public class CloudMybatisServerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(CloudMybatisServerApplication.class).web(true).run(args);
    }
}
