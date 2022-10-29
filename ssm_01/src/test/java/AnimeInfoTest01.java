import com.itheima.config.CFSpringConfig;
import com.itheima.dao.AnimeInfoDao;
import com.itheima.pojo.AnimeInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> PACKAGE_NAME
 * Version ==> 1.0
 * CreateTime ==> 2022-10-29 13:33:24
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CFSpringConfig.class)
public class AnimeInfoTest01 {

    @Autowired
    private AnimeInfoDao animeInfoDao;

    @Test
    public void testAnime(){

        List<AnimeInfo> animeInfos = animeInfoDao.selectAll();
        System.out.println();
        System.out.println();
        System.out.println();
        animeInfos.forEach(System.out::println);

    }

}
