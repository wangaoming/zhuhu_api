package com.example.zhihu_api.service;

import com.example.zhihu_api.entity.RoundTable;

import java.util.List;
import java.util.Map;

/**
 * @author ASUS
 * @description TODO
 * @create Date
 */
public interface RoundTableService {
    /**
     * 查询所有圆桌
     *
     * @return List<Map>
     */
    List<Map> selectAllRoundTable();


    /**
     * 查询最受欢迎圆桌
     *
     * @return List<RoundTable>
     */
    List<RoundTable> selectPopular();
}
