package com.abin.lee.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by abin on 2016/12/10 2016/12/10.
 * spring-cloud-start1
 * com.abin.lee.cloud.config.client.controller
 */
@RefreshScope
@RestController
public class CloudConfigClientController {

    @Value("${mysqldb.datasource.url}")
    String mysqlSource;

    /**
     * http://localhost:7002/source
     *
     *
     *
     *
     * @return
     */
    @RequestMapping("/source")
    public String getResource(){
        return mysqlSource;
    }

    public String getMysqlSource() {
        return mysqlSource;
    }

    public void setMysqlSource(String mysqlSource) {
        this.mysqlSource = mysqlSource;
    }
}
