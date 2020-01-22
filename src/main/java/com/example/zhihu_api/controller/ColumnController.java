package com.example.zhihu_api.controller;

import com.example.zhihu_api.common.Result;
import com.example.zhihu_api.service.ColumnService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "api/column")
public class ColumnController {
    @Resource
    private ColumnService columnService;

    @GetMapping
    public Result getHot(){
        return Result.success(columnService.selectHot());
    }

    @GetMapping(value = "/all")
    public Result getAllColumn(){
        return Result.success(columnService.selectAllColumn());
    }

}
