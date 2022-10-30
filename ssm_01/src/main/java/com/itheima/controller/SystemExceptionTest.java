package com.itheima.controller;

import lombok.Data;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> com.itheima.controller
 * Version ==> 1.0
 * CreateTime ==> 2022-10-31 07:39:05
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Data
public class SystemExceptionTest extends RuntimeException{

    private Integer code;

    public SystemExceptionTest(String message, Throwable cause, Integer code) {
        super(message, cause);
        this.code = code;
    }

    public SystemExceptionTest(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public SystemExceptionTest() {
    }
}
