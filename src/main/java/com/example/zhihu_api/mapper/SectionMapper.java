package com.example.zhihu_api.mapper;

import com.example.zhihu_api.entity.Section;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SectionMapper {
    /**
     * @return
     */

    /** 根据id查询标签列表
     * /
     * @param specialId
     * @return
     */
    @Select("SELECT * FROM t_section WHERE special_id = #{specialId}")
    List<Section>getSectionBySpecialId(String  specialId);
}
