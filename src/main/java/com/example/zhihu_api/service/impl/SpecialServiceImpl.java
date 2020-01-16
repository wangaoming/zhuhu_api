package com.example.zhihu_api.service.impl;

import com.example.zhihu_api.entity.Special;
import com.example.zhihu_api.mapper.SpecialMapper;
import com.example.zhihu_api.service.SpecialService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@Service
public class SpecialServiceImpl implements SpecialService {

    @Resource
    private SpecialMapper specialMapper;
    @Override
    public List<Map> selectAll() {
        return specialMapper.selectAll();
    }

    @Override
    public List<Special> selectRecent() {
        return specialMapper.selectRecent();
    }
}
