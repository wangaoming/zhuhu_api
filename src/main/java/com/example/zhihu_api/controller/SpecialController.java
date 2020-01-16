package com.example.zhihu_api.controller;

import com.example.zhihu_api.common.Result;
import com.example.zhihu_api.service.SpecialService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/api/special")
public class SpecialController {
    @Resource
    private SpecialService specialService;
    @GetMapping
  public   Result getRecent(){
        return Result.success(specialService.selectRecent());
    }
    @GetMapping(value = "/all")
    public  Result getAll(){
        return  Result.success(specialService.selectAll());
    }
}
