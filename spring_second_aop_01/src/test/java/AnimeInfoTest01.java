import com.itheima.config.CFSpringConfig;
import com.itheima.service.AnimeInfoService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> PACKAGE_NAME
 * Version ==> 1.0
 * CreateTime ==> 2022-10-24 11:13:20
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class AnimeInfoTest01 {


    @Test
    public void testAop01(){

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(CFSpringConfig.class);

        AnimeInfoService bean = ac.getBean(AnimeInfoService.class);

        bean.printCurrentTime();

    }

}
