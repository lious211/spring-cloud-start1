package com.abin.lee.cloud.feign.client.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by abin on 2016/12/9 20:05.
 * spring-cloud-start1
 * com.abin.lee.cloud.feign.client.service
 */
@Component
public class CloudFeignClientServiceHystrix implements CloudFeignClientService{

    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -99999;
    }
}
