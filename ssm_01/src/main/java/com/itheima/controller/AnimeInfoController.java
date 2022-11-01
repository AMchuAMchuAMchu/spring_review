package com.itheima.controller;

import com.google.gson.Gson;
import com.itheima.pojo.AnimeInfo;
import com.itheima.service.AnimeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> com.itheima.controller
 * Version ==> 1.0
 * CreateTime ==> 2022-10-29 13:25:31
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@RequestMapping("/animeInfo")
@RestController
public class AnimeInfoController {

    @Autowired
    private AnimeInfoService animeInfoService;

//    @GetMapping("/{id}")
    @GetMapping
//    public AnimeResult getAnimeInfo(@PathVariable("id") Integer id) {
    public AnimeResult getAnimeInfo() {
//        if (id == 1) {
//            throw new BusinessExceptionTest("请输入正确格式的说...",null,400);
//        }
        List<AnimeInfo> animeInfos = animeInfoService.selectALl();
//        try {
//            int i = 10 / 0;
//        } catch (Exception e) {
//            throw new SystemExceptionTest("果咩~~服务器内部故障...",null,500 );
//        }
        System.out.println("controller...call...");
        Gson gson = new Gson();
        String s = gson.toJson(animeInfos);
        AnimeResult animeResult = new AnimeResult();
        animeResult.setAnimeInfoList(animeInfos);
        animeResult.setCode(animeInfos != null ? 200 : 500);
        animeResult.setMsg(animeInfos != null ? "哦咩爹多!!收到数据!!" : "找不到数据...果咩~~");
        return animeResult;
    }


}