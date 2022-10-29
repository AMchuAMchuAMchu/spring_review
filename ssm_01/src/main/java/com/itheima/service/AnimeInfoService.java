package com.itheima.service;

import com.itheima.pojo.AnimeInfo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> com.itheima.service
 * Version ==> 1.0
 * CreateTime ==> 2022-10-29 13:23:46
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Transactional
public interface AnimeInfoService {

    List<AnimeInfo> selectALl();

}
