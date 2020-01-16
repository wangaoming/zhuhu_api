package com.example.zhihu_api.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Special {
    private  String specialId;
    private  String title;
    private  String introducion;
    private  String banner;
    private  Integer viewCount;
    private  Integer followersCount;
    private Data updated;


}
