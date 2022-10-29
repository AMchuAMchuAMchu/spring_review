package com.itheima.controller;

import com.alibaba.fastjson2.JSON;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.itheima.pojo.AnimeInfo;
import org.springframework.web.bind.annotation.*;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

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
        System.out.println("04 animeInfo >> "+animeInfo);
        AnimeInfo animeInfo01 = new AnimeInfo();
        animeInfo01.setName("Alicization");
        animeInfo01.setTime(2022);
        return animeInfo01;
    }

    @GetMapping("/parameter05")
    public List<AnimeInfo> getAnimeInfo02(@RequestBody List<AnimeInfo> animeInfoList){
        System.out.println("05 animeInfoList >> "+animeInfoList);
        AnimeInfo animeInfo01 = new AnimeInfo();
        animeInfo01.setName("Alicization01");
        animeInfo01.setTime(2022);

        AnimeInfo animeInfo02 = new AnimeInfo();
        animeInfo02.setName("Alicization02");
        animeInfo02.setTime(2023);

        ArrayList<AnimeInfo> animeInfos = new ArrayList<>();

        animeInfos.add(animeInfo01);
        animeInfos.add(animeInfo02);

        return animeInfos;
    }

    @GetMapping("/parameter06")
    public String[] getArray01(String [] animes){
        System.out.println("animes >> "+animes);
        return new String []{"kirito","asuna","Alici","eugeo"};
    }














}