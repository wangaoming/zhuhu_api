package com.example.zhihu_api.controller;


import com.example.zhihu_api.common.Result;
import com.example.zhihu_api.service.RoundTableService;
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
@RequestMapping(value = "/api/roundTable")
public class RoundTableController {
    @Resource
    private RoundTableService roundTableService;

    @GetMapping
    public Result getPopular() {return Result.success(roundTableService.selectPopular());  }

    @GetMapping(value = "/all")
    public  Result getAllRoundTable(){
        return Result.success(roundTableService.selectAllRoundTable());
    }
}