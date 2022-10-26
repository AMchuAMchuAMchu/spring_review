package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.log.LogForAccount;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> com.itheima.service.impl
 * Version ==> 1.0
 * CreateTime ==> 2022-10-26 09:19:42
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private LogForAccount logForAccount;




    @Override
    public void Kirito2Alice(Integer money) throws IOException {


        accountDao.addAlice(money);

        int i = 10/0;
//        if (true){
//            throw new IOException();
//        }

        accountDao.subKirito(money);

    }

    @Override
    public void log(Integer money) {
        logForAccount.logAccount("kirito","alice",money, DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh时mm分ss秒").format(LocalDateTime.now()));
    }
}
