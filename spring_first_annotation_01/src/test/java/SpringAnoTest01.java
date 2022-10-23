import com.itheima.config.SpringConfig;
import com.itheima.service.AnimeInfoService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> PACKAGE_NAME
 * Version ==> 1.0
 * CreateTime ==> 2022-10-23 11:20:07
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class SpringAnoTest01 {

    @Test
    public void testAno01(){

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);

        AnimeInfoService bean = ac.getBean(AnimeInfoService.class);

        bean.sayHelloService();

    }

}
