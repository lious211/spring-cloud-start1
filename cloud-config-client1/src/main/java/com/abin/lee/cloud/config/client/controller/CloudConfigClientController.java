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

    /**
     * Direct Read The Remote Repository
     *
     */
    @Value("${mysqldb.datasource.url}")
    String mysqlSource;
    /**
     * Step One : Read The Remote Repository spring-cloud-dev.properties 's mysqldb.datasource.url To This Module 's application.properties(mysql.config.url=${mysqldb.datasource.url})
     * Step Two : Read This Module 's application.properties(mysql.config.url=${mysqldb.datasource.url}) To Here
     */
    @Value("${mysql.config.url}")
    String mysqlUrl;

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

    /**
     * http://localhost:7002/mysqlsUrl
     * 
     * @return
     */
    @RequestMapping("/mysqlsUrl")
    public String getMysqlsUrl(){
        return mysqlUrl;
    }

    public String getMysqlSource() {
        return mysqlSource;
    }

    public void setMysqlSource(String mysqlSource) {
        this.mysqlSource = mysqlSource;
    }
}
