package com.example.zhihu_api.service;

import com.example.zhihu_api.controller.Column;

import java.util.List;
import java.util.Map;


    /**
     * @author ASUS
     * @description TODO
     * @create Date
     */
    public interface ColumnService {
        /**
         * 查询所有专栏
         *
         * @return List<Map>
         */
        List<Map> selectAllColumn();

        /**
         * 查询被关注最多专栏
         *
         * @return List<Column>
         */
        List<Column> selectHot();
    }

