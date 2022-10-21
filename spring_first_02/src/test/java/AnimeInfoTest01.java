import com.alibaba.fastjson2.JSON;
import com.itheima.pojo.AnimeInfo;
import com.itheima.utils.ContainerTest01;
import com.itheima.utils.DateTimeTest01;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.crypto.ExemptionMechanismException;
import java.time.format.DateTimeFormatter;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> PACKAGE_NAME
 * Version ==> 1.0
 * CreateTime ==> 2022-10-21 17:52:19
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class AnimeInfoTest01 {


    @Test
    public void testContainerTest01(){

        ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("SpringConfig.xml");

        ContainerTest01 bean = cp.getBean(ContainerTest01.class);

        bean.printAnime();

    }


    @Test
    public void testAutowired01(){

        ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("SpringConfig.xml");

        AnimeInfo bean = cp.getBean(AnimeInfo.class);

        bean.test();

    }



    @Test
    public void testDI01(){

        ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("SpringConfig.xml");

        AnimeInfo bean = cp.getBean(AnimeInfo.class);

//        DateTimeTest01 dateTimeTest01 = bean.getDateTimeTest01();
//
//        String dtn = dateTimeTest01.getDTN();
//
//        System.out.println("dtn>>>"+dtn);
//

        System.out.println(bean);



    }


}
