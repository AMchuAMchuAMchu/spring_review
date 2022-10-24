package com.itheima.CFMybatisConfig;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.sql.DataSource;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> com.itheima.CFMybatisConfig
 * Version ==> 1.0
 * CreateTime ==> 2022-10-24 10:26:59
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class CFMybatisSqlMapper {

    @Bean
    public SqlSessionFactoryBean getSSFB(DataSource dataSource){

        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();

        ssfb.setDataSource(dataSource);

        return ssfb;

    }

    @Bean
    public MapperScannerConfigurer getMSC(){

        MapperScannerConfigurer mscf = new MapperScannerConfigurer();

        mscf.setBasePackage("com.itheima.dao");

        return mscf;

    }


}
