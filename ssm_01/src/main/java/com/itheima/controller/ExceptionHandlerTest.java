package com.itheima.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> com.itheima.controller
 * Version ==> 1.0
 * CreateTime ==> 2022-10-31 07:27:10
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@RestControllerAdvice
public class ExceptionHandlerTest {

    @ExceptionHandler(Exception.class)
    public AnimeResult handleEX(){
        return new AnimeResult(null,500,"果咩~~无法获取数据...");
    }


    @ExceptionHandler(BusinessExceptionTest.class)
    public AnimeResult handleBx(BusinessExceptionTest bx){
        return new AnimeResult(null,bx.getCode(),bx.getMessage());
    }

    @ExceptionHandler(SystemExceptionTest.class)
    public AnimeResult handleSx(SystemExceptionTest sx){
        return new AnimeResult(null,sx.getCode(),sx.getMessage());
    }


}
