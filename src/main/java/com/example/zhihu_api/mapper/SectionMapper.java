package com.example.zhihu_api.mapper;

import com.example.zhihu_api.entity.Section;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author ASUS
 * @deprecated
 * @created
 */
public interface SectionMapper {

    /** 根据id查询标签列表
     * /
     * @param specialId
     * @return List<Section>
     */

    @Select("SELECT * FROM t_section WHERE special_id = #{specialId}")
    List<Section> getSectionsBySpecialId(String specialId);

//    List<Section> getSectionBySpecialId(String  specialId); 粗心问题  少s

}
