package com.itheima.test;

import com.itheima.dao.AnimeInfo;
import com.itheima.dao.FactoryBeanTest;
import com.itheima.utils.DateTimeUtils;
import com.sun.xml.internal.messaging.saaj.packaging.mime.util.BEncoderStream;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> com.itheima.test
 * Version ==> 1.0
 * CreateTime ==> 2022-10-20 08:35:21
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class AnimeTest {

    @Test
    public void testFactoryBean01() throws Exception {

        ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("SpringConfig.xml");

        FactoryBeanTest bean = cp.getBean(FactoryBeanTest.class);

        DateTimeUtils object = bean.getObject();

        String currentTime = object.getCurrentTime();

        System.out.println(">>>"+currentTime);

    }

    @Test
    public void testSpringBean01(){

        ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("classpath:SpringConfig.xml");

        AnimeInfo bean = cp.getBean(AnimeInfo.class);

        bean.sayHello();

    }

}
