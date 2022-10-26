package com.itheima.log;

import com.itheima.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> com.itheima.log
 * Version ==> 1.0
 * CreateTime ==> 2022-10-26 10:00:06
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Component
@Transactional()
public class LogForAccount {

    @Autowired
    private AccountDao accountDao;

    public void logAccount(String name01,String name02,Integer money,String time){
        accountDao.logAccount(name01,name02,money,time);
    }

}
