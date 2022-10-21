package com.itheima.utils;

import lombok.Data;
import org.springframework.scheduling.support.SimpleTriggerContext;

import java.util.*;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> com.itheima.utils
 * Version ==> 1.0
 * CreateTime ==> 2022-10-21 18:19:11
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Data
public class ContainerTest01 {

    private String [] name01;

    private List<String> name02;

    private Set<String> name03;

    private Map<String,String> name04;

    private Properties name05;

    public void printAnime(){
        System.out.println(Arrays.toString(name01));
        System.out.println(name02);
        System.out.println(name03);
        System.out.println(name04);
        System.out.println(name05);
    }

}
