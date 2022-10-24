package com.itheima.dao;

import com.itheima.pojo.AnimeInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> com.itheima.dao
 * Version ==> 1.0
 * CreateTime ==> 2022-10-24 10:17:00
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public interface AnimeInfoDao {

    @Select("select * from anime_info")
    List<AnimeInfo> selectAll();

    @Insert("insert into anime_info values(#{name},#{character01},#{character02},#{release_time},#{id})")
    Integer insertOne(AnimeInfo animeInfo);


}
