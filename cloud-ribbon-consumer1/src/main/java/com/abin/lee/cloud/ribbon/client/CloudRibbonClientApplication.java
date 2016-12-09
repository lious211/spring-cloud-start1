package com.abin.lee.cloud.ribbon.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by abin on 2016/12/9 17:50.
 * spring-cloud-start1
 * com.abin.lee.cloud.ribbon.client
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudRibbonClientApplication {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    /**
     *  http://localhost:3333/add
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(CloudRibbonClientApplication.class, args);
    }

}



