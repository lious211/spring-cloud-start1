package com.abin.lee.cloud.mybatis.server.util;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by abin on 2016/12/11 2016/12/11.
 * spring-cloud-start1
 * com.abin.lee.cloud.mybatis.server.util
 *
 * 读取数据库配置文件
 */
@ConfigurationProperties(prefix = DataSourceProperties.PREFIX, ignoreUnknownFields = false)
public  class  DataSourceProperties {

    public DataSourceProperties() {
        super();
    }
    //对应配置文件里的配置键
    public final static String PREFIX="jdbc";

    private String type;
    private String driver;
    private String url;
    private String username;
    private String password;

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getDriver() {
        return driver;
    }
    public void setDriver(String driver) {
        this.driver = driver;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}