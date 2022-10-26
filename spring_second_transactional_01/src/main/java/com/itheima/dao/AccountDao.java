package com.itheima.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> com.itheima.dao
 * Version ==> 1.0
 * CreateTime ==> 2022-10-26 09:12:37
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Component
public interface AccountDao {

    @Update("update account set money = money + #{money} where id = 1")
    void addAlice(Integer money);

    @Update("update account set money = money - #{money} where id = 2")
    void subKirito(Integer money);

    @Insert("insert into log_account values(#{name01},#{name02},#{money},#{time})")
    void logAccount(@Param("name01") String name01,@Param("name02") String name02,@Param("money") Integer money,@Param("time") String time);


}
