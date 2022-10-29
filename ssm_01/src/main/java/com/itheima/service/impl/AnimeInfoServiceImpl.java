package com.itheima.service.impl;

import com.itheima.dao.AnimeInfoDao;
import com.itheima.pojo.AnimeInfo;
import com.itheima.service.AnimeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> com.itheima.service.impl
 * Version ==> 1.0
 * CreateTime ==> 2022-10-29 13:24:23
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Service
public class AnimeInfoServiceImpl implements AnimeInfoService {

    @Autowired
    private AnimeInfoDao animeInfoDao;

    @Override
    public List<AnimeInfo> selectALl() {

        List<AnimeInfo> animeInfos = animeInfoDao.selectAll();
        System.out.println("service...call...");
        return animeInfos;



    }
}
