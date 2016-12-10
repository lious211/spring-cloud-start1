package com.abin.lee.cloud.api.gate;

import com.abin.lee.cloud.api.gate.filter.AccessFilter;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * Created by abin on 2016/12/10 2016/12/10.
 * spring-cloud-start1
 * com.abin.lee.cloud.api.gate
 */
@SpringCloudApplication
@EnableZuulProxy
public class CloudApiGatewayApplication {

    @Bean
    public AccessFilter accessFilter(){
        return new AccessFilter();
    }

    /**
     * http://localhost:5555/api-a/add?a=1&b=2
     * http://localhost:5555/api-a/add?a=1&b=2&accessToken=token
     *
     *
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        new SpringApplicationBuilder(CloudApiGatewayApplication.class).web(true).run(args);
    }

}
