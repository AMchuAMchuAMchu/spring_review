package com.itheima;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.dao.AnimeInfoDao;
import com.itheima.pojo.AnimeInfo;
import org.apache.logging.log4j.util.Strings;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
class SpringThirdMybatisPlusApplicationTests {


    @Autowired
    private AnimeInfoDao animeInfoDao;


    @Test
    void testGroupAndAggregate(){

        QueryWrapper<AnimeInfo> qw = new QueryWrapper<>();

        qw.select("count(*)");

        List<Map<String, Object>> maps = animeInfoDao.selectMaps(qw);

        System.out.println();
        System.out.println();
        System.out.println();
        maps.forEach(System.out::println);


    }


    @Test
    void testLike(){

        LambdaQueryWrapper<AnimeInfo> lqw = new LambdaQueryWrapper<>();

//        lqw.like(AnimeInfo::getName,"SAO");

//        lqw.between(AnimeInfo::getReleaseTime,2011,2012);

//        lqw.orderBy(true,true,AnimeInfo::getReleaseTime);

//        lqw.select(AnimeInfo::getName,AnimeInfo::getReleaseTime);

        List<AnimeInfo> animeInfos = animeInfoDao.selectList(lqw);
        System.out.println();
        System.out.println();
        System.out.println();
        animeInfos.forEach(System.out::println);

    }

    @Test
    void testEqLtGt(){

        LambdaQueryWrapper<AnimeInfo> lqw = new LambdaQueryWrapper<>();

        String time = "releaseTime";

//        LambdaQueryWrapper<AnimeInfo> eq = lqw.eq(AnimeInfo::getReleaseTime, 2015);
//        LambdaQueryWrapper<AnimeInfo> eq = lqw.le(AnimeInfo::getReleaseTime, 2015);
//        LambdaQueryWrapper<AnimeInfo> eq = lqw.ge(AnimeInfo::getReleaseTime, 2015);
        LambdaQueryWrapper<AnimeInfo> eq = lqw.ge(AnimeInfo::getReleaseTime, 2030);

        List<AnimeInfo> animeInfos = animeInfoDao.selectList(eq);
        System.out.println();
        System.out.println();
        System.out.println();
        animeInfos.forEach(System.out::println);


    }

    @Test
    void testPage01(){

        Page<AnimeInfo> animeInfoPage = new Page<>(1,3);

        Page<AnimeInfo> animeInfoPage1 = animeInfoDao.selectPage(animeInfoPage, null);
        System.out.println();
        System.out.println();
        System.out.println();
        animeInfoPage1.getRecords().forEach(System.out::println);


    }


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
