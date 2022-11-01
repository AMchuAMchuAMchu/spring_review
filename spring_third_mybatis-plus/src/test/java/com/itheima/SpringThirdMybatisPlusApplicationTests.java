package com.itheima;

import com.itheima.dao.AnimeInfoDao;
import com.itheima.pojo.AnimeInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringThirdMybatisPlusApplicationTests {


    @Autowired
    private AnimeInfoDao animeInfoDao;


    @Test
    void testUpdate(){
        AnimeInfo animeInfo = new AnimeInfo();
        animeInfo.setName("在地下城寻求邂逅是否搞错了什么...");
        animeInfo.setReleaseTime(2015);
        animeInfo.setCharacter02("赫斯提亚-水濑祈");
        animeInfo.setCharacter01("贝尔克朗尼-松冈祯丞");
        animeInfo.setId(39);

        int i = animeInfoDao.updateById(animeInfo);

        System.out.println(i>0);

    }

    @Test
    void testDeleteById(){
        AnimeInfo animeInfo = new AnimeInfo();
        animeInfo.setId(37);
        int i = animeInfoDao.deleteById(animeInfo);

        System.out.println(i>0);

    }

    @Test
    void contextLoads() {

//        List<AnimeInfo> animeInfos = animeInfoDao.selectList(null);
//        AnimeInfo animeInfo = animeInfoDao.selectById(1);
        AnimeInfo animeInfo = new AnimeInfo();
        animeInfo.setName("在地下城寻求邂逅是否搞错了什么...");
        animeInfo.setReleaseTime(2015);
        animeInfo.setCharacter02("赫斯提亚");
        animeInfo.setCharacter01("贝尔克朗尼");
        animeInfo.setId(39);

        int insert = animeInfoDao.insert(animeInfo);
        System.out.println();
        System.out.println();
        System.out.println();
//        animeInfos.forEach(System.out::println);
//        System.out.println(animeInfo);
        System.out.println(insert>0);


    }

}
