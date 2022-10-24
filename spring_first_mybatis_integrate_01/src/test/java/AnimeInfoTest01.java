import com.itheima.CFMybatisConfig.CFMybatisConfig;
import com.itheima.dao.AnimeInfoDao;
import com.itheima.pojo.AnimeInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> PACKAGE_NAME
 * Version ==> 1.0
 * CreateTime ==> 2022-10-24 10:20:42
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class AnimeInfoTest01 {

    @Test
    public void testSelectAll(){

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(CFMybatisConfig.class);

        AnimeInfoDao bean = ac.getBean(AnimeInfoDao.class);

        List<AnimeInfo> animeInfos = bean.selectAll();

        animeInfos.forEach(System.out::println);

    }





}
