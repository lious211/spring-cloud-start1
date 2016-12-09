package com.abin.lee.cloud.ribbon.client.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by abin on 2016/12/9 20:20.
 * spring-cloud-start1
 * com.abin.lee.cloud.ribbon.client.service
 */
@Service
public class CloudRibbonClientService {

    @Resource
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "addServiceFallBack")
    public String addService(){
        return restTemplate.getForEntity("http://CLOUD-SERVICE-PROVIDER/add?a=10&b=20", String.class).getBody();
    }

    public String addServiceFallBack(){
        return "The System is busy, Please Wait for a moment!";
    }


}
