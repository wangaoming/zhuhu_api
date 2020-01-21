package com.example.zhihu_api.mapper;

import com.example.zhihu_api.ZhihuApiApplication;
import com.example.zhihu_api.entity.Favorite;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@SpringBootTest(classes = ZhihuApiApplication.class)
class FavoriteMapperTest {
    @Resource
    private FavoriteMapper favoriteMapper;
    @Test
    void selectMost() {
        List<Favorite> favorites = favoriteMapper.selectMost();
        favorites.forEach(System.out::println);
    }

    @Test
    void selectAllFavorite() {
        List<Map> favorites = favoriteMapper.selectAllFavorite();
        favorites.forEach(System.out::println);
    }
}