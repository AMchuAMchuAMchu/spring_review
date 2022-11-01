package com.itheima.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> com.itheima.pojo
 * Version ==> 1.0
 * CreateTime ==> 2022-11-01 10:05:02
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Data
public class AnimeInfo01 {

    @TableField("name")
    private String name01;

    private Integer releaseTime;

    private String character01;

    private String character02;

    private Integer id;


}
