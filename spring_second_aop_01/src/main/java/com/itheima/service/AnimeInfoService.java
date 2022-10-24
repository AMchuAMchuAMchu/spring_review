package com.itheima.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> com.itheima.service
 * Version ==> 1.0
 * CreateTime ==> 2022-10-24 11:05:10
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Service
public class AnimeInfoService {

    public void printCurrentTime(){

        String format = DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh时mm分ss秒").format(LocalDateTime.now());

        System.out.println("show time >> "+format);

    }

}
