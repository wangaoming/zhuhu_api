package com.example.zhihu_api.mapper;

import com.example.zhihu_api.entity.Favorite;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author ASUS
 * @description TODO
 * @create Date
 */
public interface FavoriteMapper {
    /**
     * 查询被关注最多收藏
     *
     * @return List<Favorite>
     */
    @Select("SELECT * FROM t_favorite ORDER BY followers DESC LIMIT 0,4")
    List<Favorite> selectMost();
    /**
     * 查询所有收藏
     *
     * @Return List<Map>
     */
    @Select("SELECT * FROM t_favorite")
    @Results({
            @Result(id = true,property = "favoriteId",column = "id",javaType = String.class),
            @Result(property = "title",column = "title",javaType = String.class),
            @Result(property = "creatorName",column = "creator_name",javaType = String.class),
            @Result(property = "creatorAvatar",column = "creator_avatar",javaType = String.class),
            @Result(property = "followers",column = "followers",javaType = Integer.class),
            @Result(property = "totalCount",column = "total_count",javaType = Integer.class),
            @Result(property = "questionTitle",column = "question_title",javaType = String.class),
            @Result(property = "answerAuthorName",column = "answer_author_name",javaType = String.class),
            @Result(property = "answerContent",column = "answer_content",javaType = String.class),
            @Result(property = "voteUpCount",column = "voteup_count",javaType = Integer.class),
            @Result(property = "commentCount",column = "comment_count",javaType = Integer.class),
    })
    List<Map> selectAllFavorite();
}