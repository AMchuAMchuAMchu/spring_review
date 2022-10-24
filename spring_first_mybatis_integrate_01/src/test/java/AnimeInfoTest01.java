import com.itheima.CFMybatisConfig.CFMybatisConfig;
import com.itheima.dao.AnimeInfoDao;
import com.itheima.pojo.AnimeInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> PACKAGE_NAME
 * Version ==> 1.0
 * CreateTime ==> 2022-10-24 10:20:42
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={CFMybatisConfig.class})
public class AnimeInfoTest01 {


    @Autowired
    private AnimeInfoDao animeInfoDao;

    @Test
    public void testSelectAll02(){

        List<AnimeInfo> animeInfos = animeInfoDao.selectAll();


        animeInfos.forEach(System.out::println);

    }


    @Test
    public void testSelectAll(){

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(CFMybatisConfig.class);

        AnimeInfoDao bean = ac.getBean(AnimeInfoDao.class);

//        List<AnimeInfo> animeInfos = bean.selectAll();

//        animeInfos.forEach(System.out::println);

        AnimeInfo animeInfo = new AnimeInfo();

        animeInfo.setName("在地下城寻求邂逅是否搞错了什么");
        animeInfo.setId(35);
        animeInfo.setCharacter01("贝尔克朗尼");
        animeInfo.setCharacter02("艾斯·华伦斯坦");
        animeInfo.setRelease_time(2015);
        Integer integer = bean.insertOne(animeInfo);

        System.out.println(integer);
        System.out.println(integer);
        System.out.println(integer);

    }





}
