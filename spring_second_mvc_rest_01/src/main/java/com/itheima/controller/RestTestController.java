package com.itheima.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> com.itheima.controller
 * Version ==> 1.0
 * CreateTime ==> 2022-10-30 08:07:16
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@RequestMapping("/rest")
@RestController
public class RestTestController {

    @PostMapping
    public String postString(){
        System.out.println("PostMapping...");
        return "PostMapping";
    }

    @DeleteMapping
    public String deleteString(){
        System.out.println("DeleteMapping...");
        return "DeleteMapping";
    }

    @PutMapping
    public String putString(){
        System.out.println("putMapping...");
        return "putMapping";
    }

    @GetMapping
    public String getString(){
        System.out.println("GetMapping...");
        return "GetMapping";
    }

}
