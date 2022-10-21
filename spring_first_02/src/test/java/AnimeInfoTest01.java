import com.alibaba.fastjson2.JSON;
import com.itheima.pojo.AnimeInfo;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
    public void testDI01(){

        ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("SpringConfig.xml");

        AnimeInfo bean = cp.getBean(AnimeInfo.class);

        Object o = JSON.toJSON(bean);

        System.out.println(o);


    }


}
