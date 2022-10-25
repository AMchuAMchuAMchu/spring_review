package com.itheima.invoke;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> com.itheima.invoke
 * Version ==> 1.0
 * CreateTime ==> 2022-10-24 11:07:26
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七   草荠_制作委员会_start
 */
@Component
@Aspect
public class AnimeInfoInvoke {


    @Pointcut("execution(* com.itheima.*.AnimeInfoService.printCurrentTime(..))")
    public void pt01(){}

    @Around("pt01()")
    public Object invokeAnimeInfo(ProceedingJoinPoint pjp){
        Object[] args = null;
        System.out.println("操蛋...");
        System.out.println("操蛋...");
        System.out.println("操蛋...");
        try {
            pjp.proceed();
            args = pjp.getArgs();
            args[0] = "散华礼弥";
            args[1] = 2012;



        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("西内");
        System.out.println("西内");
        System.out.println("西内");

        return args;


    }
}
