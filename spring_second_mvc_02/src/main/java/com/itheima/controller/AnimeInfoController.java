package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.format.DateTimeFormatter;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> com.itheima.controller
 * Version ==> 1.0
 * CreateTime ==> 2022-10-29 17:20:54
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@RequestMapping("/animeInfo")
@RestController
public class AnimeInfoController {

    @GetMapping("/parameter01")
    public String getString01(String name, Integer time) {
        System.out.println("name >> " + name + "|| time >> " + time);
        return "getString01...Lycoris recoil";
    }

    @GetMapping("/parameter02")
    public String getString02(@PathVariable("anime") String name){
        System.out.println("name >> "+name);
        return "getString02..";
    }


}