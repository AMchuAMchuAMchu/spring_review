package com.itheima.pojo;

import com.itheima.utils.DateTimeTest01;
import lombok.Data;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> com.itheima.pojo
 * Version ==> 1.0
 * CreateTime ==> 2022-10-21 17:43:21
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
//@Data
public class AnimeInfo {

    private DateTimeTest01 dateTimeTest01;

    private String name;

    private Integer releaseTime;

    public AnimeInfo(DateTimeTest01 dateTimeTest01, String name, Integer releaseTime) {
        this.dateTimeTest01 = dateTimeTest01;
        this.name = name;
        this.releaseTime = releaseTime;
    }

    public AnimeInfo() {
    }
}
