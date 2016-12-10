package com.abin.lee.cloud.config.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by abin on 2016/12/10 2016/12/10.
 * spring-cloud-start1
 * com.abin.lee.cloud.config.client
 */
@SpringBootApplication
public class CloudConfigClientApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(CloudConfigClientApplication.class).web(true).run(args);
    }

}
