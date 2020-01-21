package com.example.zhihu_api.service.impl;

import com.example.zhihu_api.entity.Favorite;
import com.example.zhihu_api.mapper.FavoriteMapper;
import com.example.zhihu_api.service.FavoriteService;
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
public class FavoriteServiceImpl implements FavoriteService {
    @Resource
    private FavoriteMapper favoriteMapper;

    @Override
    public List<Map> selectAllFavorite() {
        return favoriteMapper.selectAllFavorite();
    }

    @Override
    public List<Favorite> selectMost() {
        return favoriteMapper.selectMost();
    }
}