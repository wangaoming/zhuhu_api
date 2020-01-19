package com.example.zhihu_api.service.impl;

import com.example.zhihu_api.entity.RoundTable;
import com.example.zhihu_api.mapper.RoundTableMapper;
import com.example.zhihu_api.service.RoundTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author ASUS
 * @description TODO
 * @create Date
 */
@Service
public class RoundTableServiceImpl implements RoundTableService {
    @Resource
    private RoundTableMapper roundTableMapper;
    @Override
    public List<Map> selectAllRoundTable() {
        return roundTableMapper.selectAllRoundTable();
    }

    @Override
    public List<RoundTable> selectPopular() {
        return roundTableMapper.selectPopular();
    }
}