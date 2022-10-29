package com.itheima.controller;

import com.alibaba.fastjson2.JSON;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.itheima.pojo.AnimeInfo;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/parameter02")
    public String getString02(String name, Integer time) {
        System.out.println("name >> " + name + "|| time >> " + time);
        return "getString02...Lycoris recoil";
    }

    @GetMapping("/parameter03")
    public String getString03(@RequestParam("anime") String name, Integer time) {
        System.out.println("name >> " + name + "|| time >> " + time);
        return "getString03...Lycoris recoil";
    }

    @GetMapping("/parameter04")
    public AnimeInfo getAnimeInfo01(@RequestBody AnimeInfo animeInfo){
        System.out.println("03 animeInfo >> "+animeInfo);
        AnimeInfo animeInfo01 = new AnimeInfo();
        animeInfo01.setName("Alicization");
        animeInfo01.setTime(2022);
        return animeInfo01;
    }











}