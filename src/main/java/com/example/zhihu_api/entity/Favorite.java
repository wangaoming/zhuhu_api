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
public class Favorite {
    private String favoriteId;
    private String title;
    private String creatorName;
    private String creatorAvatar;
    private Integer followers;
    private Integer totalCount;
    private String questionTitle;
    private String answerAuthorName;
    private String answerContent;
    private Integer voteUpCount;
    private Integer commentCount;
}