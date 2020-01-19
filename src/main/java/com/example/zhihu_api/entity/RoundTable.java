package com.example.zhihu_api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author ASUS
 * @description TODO
 * @create Date
 */
@Data
@Builder
public class RoundTable {
    private String roundTableId;
    private String name;
    private String urlToken;
    private String banner;
    private Integer visitsCount;
    private Integer includeCount;

}