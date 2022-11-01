package com.itheima.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> com.itheima.config
 * Version ==> 1.0
 * CreateTime ==> 2022-11-01 08:29:40
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Configuration
public class CFMVCSupport extends WebMvcConfigurationSupport {

    @Autowired
    private CFSpringMVCHandlerInterceptor cfs;

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(cfs).addPathPatterns("/animeInfo");
    }
}
