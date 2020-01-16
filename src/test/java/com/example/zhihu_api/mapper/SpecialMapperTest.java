package com.example.zhihu_api.mapper;

import com.example.zhihu_api.ZhihuApiApplication;
import com.example.zhihu_api.entity.Special;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@SpringBootTest(classes = ZhihuApiApplication.class)
class SpecialMapperTest {
    @Resource SpecialMapper specialMapper;
    @Resource SectionMapper sectionMapper;

    @Test
    void selectRecent() {
        List<Special> specials = specialMapper.selectRecent();
        specials.forEach(System.out::println);
    }

    @Test
    void selectAll() {
        List<Map>specials = specialMapper.selectAll();
        specials.forEach(System.out::println);
    }
}