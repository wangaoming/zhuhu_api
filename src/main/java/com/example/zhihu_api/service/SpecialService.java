package com.example.zhihu_api.service;

import com.example.zhihu_api.entity.Special;

import java.util.List;
import java.util.Map;

public interface SpecialService {

    /** 查询所有标题
     *
     * @return
     */
    List<Map>selectAll();

    /** 查询最新标题
     *
     * @return
     */
    List<Special>selectRecent();
}
