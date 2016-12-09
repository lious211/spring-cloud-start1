package com.abin.lee.cloud.service.provider;

import org.apache.log4j.Logger;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by lisubin on 2016/12/9.
 * 创建“服务提供方”
 *下面我们创建提供服务的客户端，并向服务注册中心注册自己。
 */
@RestController
public class CloudProviderController {

    private final Logger logger = Logger.getLogger(getClass());

    @Resource
    DiscoveryClient discoveryClient;

    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public Integer add(Integer a, Integer b){
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        Integer r = a + b;
        logger.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        return r;
    }


}
