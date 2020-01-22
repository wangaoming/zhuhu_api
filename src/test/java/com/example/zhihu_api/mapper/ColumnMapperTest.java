package com.example.zhihu_api.mapper;

import com.example.zhihu_api.ZhihuApiApplication;
import com.example.zhihu_api.controller.Column;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@SpringBootTest(classes = ZhihuApiApplication.class)
class ColumnMapperTest {
    @Resource
    private ColumnMapper columnMapper;

    @Test
    void selectHot() {
        List<Column>columns = columnMapper.selectHot();
        columns.forEach(System.out::println);
    }

    @Test
    void selectAllColumn() {
        List<Map>columns = columnMapper.selectAllColumn();
        columns.forEach(System.out::println);
    }
}