package com.itheima.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.lang.reflect.Type;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> com.itheima.pojo
 * Version ==> 1.0
 * CreateTime ==> 2022-11-01 10:05:02
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Data
@TableName("anime_info")
public class AnimeInfo01 {

    @TableField("name")
    private String name01;

    @TableField(select = false)
    private Integer releaseTime;

    private String character01;

    private String character02;

    @TableId(type = IdType.AUTO)
    private Integer id;

    @TableField(exist = false)
    private String haha;


}
