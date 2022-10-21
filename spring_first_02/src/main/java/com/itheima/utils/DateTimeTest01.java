package com.itheima.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> com.itheima.utils
 * Version ==> 1.0
 * CreateTime ==> 2022-10-21 17:44:30
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class DateTimeTest01 {

    public String getDTN() {
        return DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss").format(LocalDateTime.now());
    }
}
