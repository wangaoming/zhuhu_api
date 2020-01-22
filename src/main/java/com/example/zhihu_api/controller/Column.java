package com.example.zhihu_api.controller;

import lombok.Builder;
import lombok.Data;

/**
 * @author ASUS
 * @description TODO
 * @create Date
 */
@Data
@Builder
public class Column {
    private String columnId;
    private String title;
    private String description;
    private String url;
    private String imageUrl;
    private Integer followers;
    private Integer articlesCount;
}