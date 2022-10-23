package com.itheima.service;

import com.itheima.dao.AnimeInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> com.itheima.service
 * Version ==> 1.0
 * CreateTime ==> 2022-10-23 11:15:57
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Service
public class AnimeInfoService {

    @Autowired
    private AnimeInfoDao animeInfoDao;

    public void sayHelloService(){

        animeInfoDao.sayHelloDao();
        System.out.println("sayHelloService...");

    }

}
