package com.abin.lee.cloud.mybatis.server.util;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.PreDestroy;

/**
 * Created by abin on 2016/12/11 2016/12/11.
 * spring-cloud-start1
 * com.abin.lee.cloud.mybatis.server.util
 */
@Configuration
@MapperScan("com.abin.lee.cloud.mybatis")
@EnableConfigurationProperties(DataSourceProperties.class)
@EnableTransactionManagement
public class MybatisDataSource {

    // mybaits mapper xml搜索路径
    private final static String MAPPERLOCATIONS = "classpath:/mappings/**/*.xml";
    private final static String CONFIGLOCATION = "classpath:/mybatis-config.xml";

//    @Autowired
//    private  DataSourceProperties dataSourceProperties;
//    private DruidDataSource datasource = null;
//
//    @Bean(destroyMethod = "close")
//    public DataSource dataSource(){
//        datasource = new DruidDataSource();
//        datasource.setUrl(dataSourceProperties.getUrl());
//        datasource.setDbType(dataSourceProperties.getType());
//        datasource.setDriverClassName(dataSourceProperties.getDriver());
//        datasource.setUsername(dataSourceProperties.getUsername());
//        datasource.setPassword(dataSourceProperties.getPassword());
//        return datasource;
//    }
//
//    @PreDestroy
//    public void close() {
//        if(datasource != null){
//            datasource.close();
//        }
//    }

//    @Bean
//    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        sqlSessionFactoryBean.setDataSource(dataSource());
//        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        sqlSessionFactoryBean.setMapperLocations(resolver.getResources(MAPPERLOCATIONS));
//        sqlSessionFactoryBean.setConfigLocation(resolver.getResource(CONFIGLOCATION));
//        sqlSessionFactoryBean.setTypeAliasesPackage("com.phz.test.spring.cloud.demo.entity");
//        return sqlSessionFactoryBean.getObject();
//    }
//
//    @Bean
//    public PlatformTransactionManager transactionManager() {
//        return new DataSourceTransactionManager(dataSource());
//    }

}

