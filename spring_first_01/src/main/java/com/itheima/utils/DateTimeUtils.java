package com.itheima.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> com.itheima.utils
 * Version ==> 1.0
 * CreateTime ==> 2022-10-20 08:39:27
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class DateTimeUtils {

    public String getCurrentTime(){

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");

        String format = pattern.format(now);

        return format;


    }

}
