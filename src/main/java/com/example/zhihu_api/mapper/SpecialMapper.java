package com.example.zhihu_api.mapper;

import com.example.zhihu_api.entity.Special;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author Lenovo
 */
public interface SpecialMapper {
    @Insert("<script>"+
            "INSERT INTO t_special (special_id,title,introduction,banner,view_count,followers_count,updated) VALUES"+
            "<foreach collection=\"list\" item=\"special\" index=\"index\" separator=\",\">"+
            "(#{special.specialId},#{special.title},#{special.introduction},#{special.banner},#{special.viewCount},#{special.followersCount},#{special.updated})"+
            "</foreach>"+
            "</script>")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    void batchInsert(@Param("list") List<Special> specials);
/**
 * 查询最新专题
 *
 * @return List<Special>
 */
@Select("SELECT * FROM t_special ORDER BY updated DESC LIMIT 0,4")
List<Special> selectRecent();

    /**
     * 查询所有专题
     *
     * @return List<Map>
     */
@Select("SELECT * FROM t_special")
    @Results({
    @Result(id = true, property = "specialId", column = "special_id", javaType = String.class),
    @Result(property = "title", column = "title", javaType = String.class),
    @Result(property = "introduction", column = "introduction", javaType = String.class),
    @Result(property = "banner", column = "banner", javaType = String.class),
    @Result(property = "viewCount", column = "view_count", javaType = Integer.class),
    @Result(property = "followersCount", column = "followers_count", javaType = Integer.class),
    @Result(property = "updated", column = "updated", javaType = Date.class),
    @Result(property = "sections", column = "special_id",
            many = @Many(select = "com.example.zhihu_api.mapper.SectionMapper.getSectionsBySpecialId")),
})
List<Map> selectAll();
}
