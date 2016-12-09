package com.abin.lee.cloud.eureka.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by abin on 2016/12/9.
 * 这里是Eureka的服务端-------服务注册中心
 */
@EnableEurekaServer
@SpringBootApplication
public class CloudEurekaServerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(CloudEurekaServerApplication.class).web(true).run(args);
    }

}
