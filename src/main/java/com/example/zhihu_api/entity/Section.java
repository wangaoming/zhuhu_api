package com.example.zhihu_api.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Section {
    private  String sectionId;
    private  String specialId;
    private  String sectionTitle;
}
