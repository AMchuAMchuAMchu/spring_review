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
    void contextLoads() {

//        List<AnimeInfo> animeInfos = animeInfoDao.selectList(null);
        AnimeInfo animeInfo = animeInfoDao.selectById(1);
        System.out.println();
        System.out.println();
        System.out.println();
//        animeInfos.forEach(System.out::println);
        System.out.println(animeInfo);

    }

}
