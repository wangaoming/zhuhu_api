package com.example.zhihu_api.controller;

import com.example.zhihu_api.common.Result;
import com.example.zhihu_api.service.FavoriteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
/**
        * @author ASUS
        * @description TODO
        * @create Date
        */
@RestController
@RequestMapping(value = "/api/favorite")
public class FavoriteController{
    @Resource
    private FavoriteService favoriteService;

    @GetMapping
    public  Result getMost() {return Result.success(favoriteService.selectMost()); }

    @GetMapping(value = "/all")
    public  Result getAllFavorite(){
        return Result.success(favoriteService.selectAllFavorite());
    }
}