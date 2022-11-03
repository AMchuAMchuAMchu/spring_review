package com.itheima.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> com.itheima.config
 * Version ==> 1.0
 * CreateTime ==> 2022-11-03 08:38:46
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Configuration
public class CFOptimistic {


    @Bean
    public MybatisPlusInterceptor getOptimis(){
        MybatisPlusInterceptor mpi = new MybatisPlusInterceptor();

        mpi.addInnerInterceptor(new OptimisticLockerInnerInterceptor());

        return mpi;
    }

}
