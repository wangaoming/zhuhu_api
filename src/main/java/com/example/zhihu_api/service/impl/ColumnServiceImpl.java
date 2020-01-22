package com.example.zhihu_api.service.impl;

import com.example.zhihu_api.controller.Column;
import com.example.zhihu_api.mapper.ColumnMapper;
import com.example.zhihu_api.service.ColumnService;
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
public class ColumnServiceImpl implements ColumnService {
    @Resource
    private ColumnMapper columnMapper;
    @Override
    public List<Map> selectAllColumn() {
        return columnMapper.selectAllColumn();
    }

    @Override
    public List<Column> selectHot() {
        return columnMapper.selectHot();
    }
}