package com.itheima;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.dao.AnimeInfoDao;
import com.itheima.pojo.AnimeInfo01;
import org.apache.logging.log4j.util.Strings;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.crypto.ExemptionMechanismException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@SpringBootTest
class SpringThirdMybatisPlusApplicationTests {


    @Autowired
    private AnimeInfoDao animeInfo01Dao;



    @Test
    void testBatch(){


        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        System.out.println();
        System.out.println();
        System.out.println();
        List<AnimeInfo01> animeInfo01s = animeInfo01Dao.selectBatchIds(ids);

        animeInfo01s.forEach(System.out::println);


    }

    @Test
    void testSelectAll(){

        List<AnimeInfo01> animeInfo01s = animeInfo01Dao.selectList(null);
        System.out.println();
        System.out.println();
        System.out.println();
        animeInfo01s.forEach(System.out::println);

    }


    @Test
    void testGroupAndAggregate(){

        QueryWrapper<AnimeInfo01> qw = new QueryWrapper<>();


//        qw.select("count(*)");

//        qw.select("sum(release_time)");

//        qw.select("max(release_time)");

//        qw.select("min(release_time)");
//        qw.select("AVG(release_time)");


        qw.groupBy("release_time");

        List<Map<String, Object>> maps = animeInfo01Dao.selectMaps(qw);

        System.out.println();
        System.out.println();
        System.out.println();
        maps.forEach(System.out::println);


    }


    @Test
    void testLike(){

        LambdaQueryWrapper<AnimeInfo01> lqw = new LambdaQueryWrapper<>();

//        lqw.like(AnimeInfo01::getName,"SAO");

//        lqw.between(AnimeInfo01::getReleaseTime,2011,2012);

//        lqw.orderBy(true,true,AnimeInfo01::getReleaseTime);

//        lqw.select(AnimeInfo01::getName,AnimeInfo01::getReleaseTime);

        List<AnimeInfo01> animeInfo01s = animeInfo01Dao.selectList(lqw);
        System.out.println();
        System.out.println();
        System.out.println();
        animeInfo01s.forEach(System.out::println);

    }

    @Test
    void testEqLtGt(){

        LambdaQueryWrapper<AnimeInfo01> lqw = new LambdaQueryWrapper<>();

        String time = "releaseTime";

//        LambdaQueryWrapper<AnimeInfo01> eq = lqw.eq(AnimeInfo01::getReleaseTime, 2015);
//        LambdaQueryWrapper<AnimeInfo01> eq = lqw.le(AnimeInfo01::getReleaseTime, 2015);
//        LambdaQueryWrapper<AnimeInfo01> eq = lqw.ge(AnimeInfo01::getReleaseTime, 2015);
        LambdaQueryWrapper<AnimeInfo01> eq = lqw.ge(AnimeInfo01::getReleaseTime, 2030);

        List<AnimeInfo01> animeInfo01s = animeInfo01Dao.selectList(eq);
        System.out.println();
        System.out.println();
        System.out.println();
        animeInfo01s.forEach(System.out::println);


    }

    @Test
    void testPage01(){

        Page<AnimeInfo01> animeInfo01Page = new Page<>(1,3);

        Page<AnimeInfo01> animeInfo01Page1 = animeInfo01Dao.selectPage(animeInfo01Page, null);
        System.out.println();
        System.out.println();
        System.out.println();
        animeInfo01Page1.getRecords().forEach(System.out::println);


    }


    @Test
    void testUpdate(){
        AnimeInfo01 animeInfo01 = new AnimeInfo01();
        animeInfo01.setName01("在地下城寻求邂逅是否搞错了什么...");
        animeInfo01.setReleaseTime(2015);
        animeInfo01.setCharacter02("赫斯提亚-水濑祈");
        animeInfo01.setCharacter01("贝尔克朗尼-松冈祯丞");
        animeInfo01.setId(39);

        int i = animeInfo01Dao.updateById(animeInfo01);

        System.out.println(i>0);

    }

    @Test
    void testDeleteById(){
        AnimeInfo01 animeInfo01 = new AnimeInfo01();
        animeInfo01.setId(37);
        int i = animeInfo01Dao.deleteById(animeInfo01);

        System.out.println(i>0);

    }

    @Test
    void contextLoads() {

//        List<AnimeInfo01> animeInfo01s = animeInfo01Dao.selectList(null);
//        AnimeInfo01 animeInfo01 = animeInfo01Dao.selectById(1);
        AnimeInfo01 animeInfo01 = new AnimeInfo01();
        animeInfo01.setName01("在地下城寻求邂逅是否搞错了什么...");
        animeInfo01.setReleaseTime(2015);
        animeInfo01.setCharacter02("赫斯提亚");
        animeInfo01.setCharacter01("贝尔克朗尼");
        animeInfo01.setId(39);

        int insert = animeInfo01Dao.insert(animeInfo01);
        System.out.println();
        System.out.println();
        System.out.println();
//        animeInfo01s.forEach(System.out::println);
//        System.out.println(animeInfo01);
        System.out.println(insert>0);


    }

}
