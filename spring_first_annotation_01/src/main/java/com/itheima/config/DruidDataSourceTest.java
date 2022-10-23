package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> com.itheima.config
 * Version ==> 1.0
 * CreateTime ==> 2022-10-23 11:52:26
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Component
@PropertySource("classpath:jdbc.properties")
public class DruidDataSourceTest {

    @Bean
    public DataSource getDruidDataSourceTest(){
        DruidDataSource druidDataSource = new DruidDataSource();

        druidDataSource.setDriverClassName("${jdbc.driverClassName}");
        druidDataSource.setUrl("${jdbc.url}");
        druidDataSource.setUsername("${jdbc.username}");
        druidDataSource.setPassword("${jdbc.password}");

        return druidDataSource;
    }

}
