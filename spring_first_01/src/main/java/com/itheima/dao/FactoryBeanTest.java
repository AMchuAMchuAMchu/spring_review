package com.itheima.dao;

import com.itheima.utils.DateTimeUtils;
import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;
import org.springframework.beans.factory.FactoryBean;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> com.itheima.dao
 * Version ==> 1.0
 * CreateTime ==> 2022-10-20 09:26:09
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class FactoryBeanTest implements FactoryBean<DateTimeUtils> {


    @Override
    public DateTimeUtils getObject() throws Exception {
        return new DateTimeUtils();
    }

    @Override
    public Class<?> getObjectType() {
        return DateTimeUtils.class;
    }
}
