package com.itheima.CFMybatisConfig;

import com.alibaba.druid.pool.DruidDataSource;
import com.sun.xml.internal.ws.server.DraconianValidationErrorHandler;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> com.itheima.CFMybatisConfig
 * Version ==> 1.0
 * CreateTime ==> 2022-10-24 10:03:33
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class CFDruidDataSource {

    @Value("${jdbc.driverClassName}")
    private String driverClassName;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;


    @Bean
    public DataSource getDruidDataSource(){

        DruidDataSource druidDataSource = new DruidDataSource();

        druidDataSource.setDriverClassName(driverClassName);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);

        return druidDataSource;


    }


    @Bean
    public PlatformTransactionManager getPTM(DataSource dataSource){

        DataSourceTransactionManager dstm = new DataSourceTransactionManager();

        dstm.setDataSource(dataSource);

        return dstm;


    }

}
