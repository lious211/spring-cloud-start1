package com.abin.lee.cloud.config.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by abin on 2016/12/9 21:13.
 * spring-cloud-start1
 * com.abin.lee.cloud.config.server
 */
@SpringBootApplication
@EnableConfigServer
public class CloudConfigServerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(CloudConfigServerApplication.class).web(true).run(args);
    }

}
