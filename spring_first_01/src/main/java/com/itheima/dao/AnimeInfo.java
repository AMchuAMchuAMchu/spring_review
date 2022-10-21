package com.itheima.dao;

import com.itheima.utils.DateTimeUtils;
import lombok.Data;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> com.itheima.dao
 * Version ==> 1.0
 * CreateTime ==> 2022-10-20 08:33:18
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Data
public class AnimeInfo implements InitializingBean, DisposableBean {

    private DateTimeUtils dateTimeUtils;

    public void sayHello(){
        System.out.println("sayHello...");
        System.out.println("sayKNCW...");
        System.out.println("say(｡･∀･)ﾉﾞ嗨...");
        System.out.println("阔你吃哇~~当前时间是:>>"+ dateTimeUtils.getCurrentTime());
        System.out.println("阔你吃哇~~当前时间是:>>"+ dateTimeUtils.getCurrentTime());
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init...");
    }
//
//    public void init(){
//        System.out.println("inti ...");
//    }
//
//    public void destroy(){
//        System.out.println("destroy ...");
//    }




}
