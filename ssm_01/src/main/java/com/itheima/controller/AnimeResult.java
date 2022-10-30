package com.itheima.controller;

import com.itheima.pojo.AnimeInfo;
import lombok.Data;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> com.itheima.controller
 * Version ==> 1.0
 * CreateTime ==> 2022-10-31 07:01:34
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Data
public class AnimeResult {

    private List<AnimeInfo> animeInfoList;

    private Integer code;

    private String msg;

}
