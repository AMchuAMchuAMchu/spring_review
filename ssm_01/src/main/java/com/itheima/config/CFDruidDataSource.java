package com.itheima.config;

import com.alibaba.druid.pool.DruidAbstractDataSource;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceStatLoggerImpl;
import com.sun.media.jfxmediaimpl.platform.Platform;
import org.apache.ibatis.cache.TransactionalCacheManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.jnlp.IntegrationService;
import javax.sql.DataSource;
import java.time.Duration;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> com.itheima.config
 * Version ==> 1.0
 * CreateTime ==> 2022-10-29 12:55:50
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
    public DataSource getDruidDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(driverClassName);

        druidDataSource.setUrl(url);

        druidDataSource.setUsername(username);

        druidDataSource.setPassword(password);

        return druidDataSource;
    }

    @Bean
    public PlatformTransactionManager getTCM(DataSource dataSource){

        DataSourceTransactionManager dstm = new DataSourceTransactionManager();

        dstm.setDataSource(dataSource);

        return dstm;

    }




}
