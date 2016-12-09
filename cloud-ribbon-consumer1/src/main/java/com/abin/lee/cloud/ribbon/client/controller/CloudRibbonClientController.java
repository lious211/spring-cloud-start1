package com.abin.lee.cloud.ribbon.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by abin on 2016/12/9 17:51.
 * spring-cloud-start1
 * com.abin.lee.cloud.ribbon.client.controller
 */
@RestController
public class CloudRibbonClientController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(){
        return restTemplate.getForEntity("http://CLOUD-SERVICE-PROVIDER/add?a=10&b=20", String.class).getBody();
    }



}
