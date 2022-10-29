package com.itheima.config;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> com.itheima.config
 * Version ==> 1.0
 * CreateTime ==> 2022-10-29 12:56:20
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class CFMybatisConfig {

    @Bean
    public SqlSessionFactoryBean getSSFB(DataSource dataSource){

        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();

        ssfb.setDataSource(dataSource);

        ssfb.setTypeAliasesPackage("com.itheima.pojo");

        return ssfb;

    }


    @Bean
    public MapperScannerConfigurer getMSC(){

        MapperScannerConfigurer msc = new MapperScannerConfigurer();

        msc.setBasePackage("com.itheima.dao");

        return msc;

    }



}
